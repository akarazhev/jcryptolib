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
import java.net.http.WebSocket.Listener;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;

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

    private BybitDataStream(final HttpClient client, final String url, final String[] topics) {
        this.client = client;
        this.uri = URI.create(url);
        this.topics = topics;
    }

    public static BybitDataStream create(final HttpClient client, final String url, final String[] topics) {
        return new BybitDataStream(client, url, topics);
    }

    @Override
    public void subscribe(final FlowableEmitter<String> emitter) throws Throwable {
        final var listener = new BybitDataStreamListener(emitter);
        listener.connect();
        emitter.setCancellable(listener::cancel);
    }

    final class BybitDataStreamListener implements Listener {
        private final FlowableEmitter<String> emitter;
        private final StringBuilder buffer;
        private WebSocket webSocket;
        private int reconnectAttempts;
        private Disposable ping;

        public BybitDataStreamListener(final FlowableEmitter<String> emitter) {
            this.emitter = emitter;
            this.buffer = new StringBuilder();
            this.reconnectAttempts = 0;
        }

        @Override
        public void onOpen(final WebSocket webSocket) {
            LOGGER.debug("WebSocket opened");
            this.webSocket = webSocket;
            reconnectAttempts = 0;
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
                    startPing();
                } else if (isPong(text)) {
                    LOGGER.debug("Received pong message: {}", text);
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
            LOGGER.warn("WebSocket closed with code: {}, reason: {}", statusCode, reason);
            stopPing();
            if (!emitter.isCancelled()) {
                scheduleReconnect();
            } else {
                emitter.onComplete();
            }

            return CompletableFuture.completedFuture(null);
        }

        @Override
        public void onError(final WebSocket webSocket, final Throwable error) {
            LOGGER.error("WebSocket error", error);
            stopPing();
            if (!emitter.isCancelled()) {
                scheduleReconnect();
            } else {
                emitter.onError(error);
            }
        }

        private void startPing() {
            stopPing();
            LOGGER.debug("Starting ping");
            ping = Flowable.interval(getPingInterval(), TimeUnit.MILLISECONDS)
                    .subscribe($ -> {
                        if (webSocket != null) {
                            webSocket.sendText(Requests.ofPing(), true);
                            LOGGER.debug("Ping sent: {}", Requests.ofPing());
                        }
                    }, t -> LOGGER.error("Ping error", t));
        }

        private void stopPing() {
            if (ping != null && !ping.isDisposed()) {
                LOGGER.debug("Stopping ping");
                ping.dispose();
            }
        }

        private void scheduleReconnect() {
            reconnectAttempts++;
            if (reconnectAttempts > getMaxReconnectAttempts()) {
                LOGGER.error("Maximum reconnection attempts ({}) reached", getMaxReconnectAttempts());
                reconnectAttempts = (int) getMaxReconnectAttempts();
            }

            final var delay = Math.min(getInitialReconnectIntervalMs() * Math.pow(getBackoffMultiplier(),
                    reconnectAttempts - 1), getMaxReconnectIntervalMs());
            LOGGER.info("Reconnection attempt {} of {}. Waiting for {} ms", reconnectAttempts, getMaxReconnectAttempts(),
                    delay);
            CompletableFuture.delayedExecutor((long) delay, TimeUnit.MILLISECONDS)
                    .execute(() -> {
                        if (!emitter.isCancelled()) {
                            closeWebSocket();
                            connect();
                        }
                    });
        }

        private void connect() {
            client.newWebSocketBuilder()
                    .connectTimeout(Duration.ofSeconds(10))
                    .buildAsync(uri, this)
                    .exceptionally(ex -> {
                        if (!emitter.isCancelled()) {
                            LOGGER.error("Failed to connect: {}", ex.getMessage());
                            stopPing();
                            scheduleReconnect();
                        }

                        return null;
                    });
        }

        private void cancel() {
            if (emitter.isCancelled()) {
                closeWebSocket();
            }
        }

        private void closeWebSocket() {
            if (webSocket != null) {
                LOGGER.info("WebSocket closing...");
                stopPing();
                webSocket.abort();
            }
        }
    }
}