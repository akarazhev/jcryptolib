/*
 * MIT License
 *
 * Copyright (c) 2025 Andrey Karazhev
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.akarazhev.jcryptolib.bybit.stream;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;
import io.reactivex.rxjava3.disposables.Disposable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.WebSocket;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import static com.github.akarazhev.jcryptolib.bybit.BybitConfig.getBackoffMultiplier;
import static com.github.akarazhev.jcryptolib.bybit.BybitConfig.getInitialReconnectIntervalMs;
import static com.github.akarazhev.jcryptolib.bybit.BybitConfig.getMaxReconnectAttempts;
import static com.github.akarazhev.jcryptolib.bybit.BybitConfig.getMaxReconnectIntervalMs;
import static com.github.akarazhev.jcryptolib.bybit.BybitConfig.getPingInterval;
import static com.github.akarazhev.jcryptolib.bybit.stream.Responses.isPong;
import static com.github.akarazhev.jcryptolib.bybit.stream.Responses.isSubscription;

public final class BybitDataStream implements FlowableOnSubscribe<String> {
    private static final Logger LOGGER = LoggerFactory.getLogger(BybitDataStream.class);
    private final HttpClient client;
    private final URI uri;
    private final String[] topics;
    private final AtomicReference<WebSocket> webSocketRef = new AtomicReference<>();
    private final AtomicInteger reconnectAttempts = new AtomicInteger(0);
    private final AtomicBoolean isReconnecting = new AtomicBoolean(false);

    private BybitDataStream(final String url, final String[] topics) {
        this.client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .build();
        this.uri = URI.create(url);
        this.topics = topics;
    }

    public static BybitDataStream create(final String url, final String[] topics) {
        return new BybitDataStream(url, topics);
    }

    @Override
    public void subscribe(final FlowableEmitter<String> emitter) throws Throwable {
        reconnectAttempts.set(0);
        connect(emitter);
    }

    private void connect(final FlowableEmitter<String> emitter) {
        final class DataStreamListener implements WebSocket.Listener {
            private final AtomicBoolean isAwaitingPong = new AtomicBoolean(false);
            private Disposable ping;
            private final StringBuilder buffer = new StringBuilder();

            @Override
            public void onOpen(final WebSocket webSocket) {
                LOGGER.debug("WebSocket opened");
                webSocketRef.set(webSocket);
                reconnectAttempts.set(0);
                isReconnecting.set(false);
                webSocket.sendText(Requests.ofSubscription(topics), true);
                webSocket.request(1);
            }

            @Override
            public CompletionStage<?> onText(final WebSocket webSocket, final CharSequence data, final boolean last) {
                buffer.append(data);
                if (last) {
                    final var text = buffer.toString();
                    buffer.setLength(0);
                    if (isSubscription(text)) {
                        LOGGER.debug("Received subscription message: {}", text);
                        ping = Flowable.interval(getPingInterval(), TimeUnit.MILLISECONDS)
                                .subscribe($ -> {
                                    if (isAwaitingPong.get()) {
                                        LOGGER.warn("Previous ping didn't receive a pong.");
                                        closeWsStopPing(webSocket, "Ping timeout");
                                        reconnectImmediate(emitter);
                                    } else {
                                        LOGGER.debug("Sending ping");
                                        webSocket.sendText(Requests.ofPing(), true);
                                        isAwaitingPong.set(true);
                                    }
                                }, t -> LOGGER.error("Heartbeat error", t));
                    } else if (isPong(text)) {
                        LOGGER.debug("Received pong message: {}", text);
                        isAwaitingPong.set(false);
                    } else {
                        if (!emitter.isCancelled()) {
                            LOGGER.debug("Received message: {}", text);
                            emitter.onNext(text);
                        }
                    }
                }

                webSocket.request(1);
                return CompletableFuture.completedFuture(null);
            }

            @Override
            public CompletionStage<?> onClose(final WebSocket webSocket, final int statusCode, final String reason) {
                closeWsStopPing(webSocket, "Connection closed");
                LOGGER.warn("WebSocket closed with code: {}, reason: {}", statusCode, reason);
                if (emitter.isCancelled()) {
                    emitter.onComplete();
                } else {
                    LOGGER.warn("Connection closed, attempting to reconnect");
                    reconnectWithBackoff(emitter);
                }

                return CompletableFuture.completedFuture(null);
            }

            @Override
            public void onError(final WebSocket webSocket, final Throwable error) {
                closeWsStopPing(webSocket, "Connection failed");
                if (emitter.isCancelled()) {
                    LOGGER.error("Connection failed: {}", error.getMessage());
                    emitter.onError(error);
                } else {
                    LOGGER.warn("Connection error: {}, attempting to reconnect", error.getMessage());
                    reconnectWithBackoff(emitter);
                }
            }

            @Override
            public CompletionStage<?> onPing(final WebSocket webSocket, final ByteBuffer message) {
                LOGGER.debug("Received ping");
                webSocket.request(1);
                return CompletableFuture.completedFuture(null);
            }

            @Override
            public CompletionStage<?> onPong(final WebSocket webSocket, final ByteBuffer message) {
                LOGGER.debug("Received pong");
                isAwaitingPong.set(false);
                webSocket.request(1);
                return CompletableFuture.completedFuture(null);
            }

            private void closeWsStopPing(final WebSocket ws, final String reason) {
                try {
                    ws.sendClose(WebSocket.NORMAL_CLOSURE, reason).join();
                } catch (final Exception e) {
                    LOGGER.warn("Error closing WebSocket: {}", e.getMessage());
                }

                if (ping != null && !ping.isDisposed()) {
                    LOGGER.warn("Stop pinging...");
                    ping.dispose();
                    isAwaitingPong.set(false);
                }
            }
        }

        final var webSocketBuilder = client.newWebSocketBuilder();
        webSocketBuilder.buildAsync(uri, new DataStreamListener())
                .exceptionally(throwable -> {
                    LOGGER.error("Failed to create WebSocket: {}", throwable.getMessage());
                    if (!emitter.isCancelled()) {
                        if (isInitialConnection()) {
                            emitter.onError(throwable);
                        } else {
                            reconnectWithBackoff(emitter);
                        }
                    }

                    return null;
                });

        emitter.setCancellable(() -> {
            if (emitter.isCancelled()) {
                final var webSocket = webSocketRef.get();
                if (webSocket != null) {
                    LOGGER.info("WebSocket closing...");
                    webSocket.sendClose(WebSocket.NORMAL_CLOSURE, "Connection closed");
                }

                client.close();
            }
        });
    }

    private boolean isInitialConnection() {
        return reconnectAttempts.get() == 0;
    }

    private void reconnectImmediate(final FlowableEmitter<String> emitter) {
        if (isReconnecting.compareAndSet(false, true)) {
            LOGGER.info("Attempting immediate reconnection");
            connect(emitter);
        }
    }

    private void reconnectWithBackoff(final FlowableEmitter<String> emitter) {
        if (isReconnecting.compareAndSet(false, true)) {
            final var attempts = reconnectAttempts.incrementAndGet();
            if (attempts > getMaxReconnectAttempts()) {
                LOGGER.error("Maximum reconnection attempts ({}) reached", getMaxReconnectAttempts());
                if (!emitter.isCancelled()) {
                    emitter.onError(new RuntimeException("Maximum reconnection attempts reached"));
                }

                return;
            }

            final var delay = Math.min(getInitialReconnectIntervalMs() * Math.pow(getBackoffMultiplier(), attempts - 1),
                    getMaxReconnectIntervalMs());
            LOGGER.info("Reconnection attempt {} of {}. Waiting for {} ms", attempts, getMaxReconnectAttempts(), delay);
            CompletableFuture.delayedExecutor((long) delay, TimeUnit.MILLISECONDS)
                    .execute(() -> {
                        if (!emitter.isCancelled()) {
                            connect(emitter);
                        } else {
                            isReconnecting.set(false);
                        }
                    });
        }
    }
}