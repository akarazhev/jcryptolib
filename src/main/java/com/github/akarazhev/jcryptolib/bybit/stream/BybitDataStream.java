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
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import static com.github.akarazhev.jcryptolib.bybit.BybitConfig.getBackoffMultiplier;
import static com.github.akarazhev.jcryptolib.bybit.BybitConfig.getInitialReconnectIntervalMs;
import static com.github.akarazhev.jcryptolib.bybit.BybitConfig.getMaxReconnectAttempts;
import static com.github.akarazhev.jcryptolib.bybit.BybitConfig.getMaxReconnectIntervalMs;
import static com.github.akarazhev.jcryptolib.bybit.BybitConfig.getPingInterval;
import static com.github.akarazhev.jcryptolib.bybit.stream.Responses.isPong;
import static com.github.akarazhev.jcryptolib.bybit.stream.Responses.isSubscription;

/**
 * Reactive Bybit WebSocket data stream.
 * Handles connection, reconnection with exponential backoff, ping/pong, and resource cleanup.
 */
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

    /**
     * Creates a new BybitDataStream.
     *
     * @param client HttpClient to use
     * @param url    WebSocket endpoint
     * @param topics Subscription topics
     * @return BybitDataStream instance
     */
    public static BybitDataStream create(final HttpClient client, final String url, final String[] topics) {
        return new BybitDataStream(client, url, topics);
    }

    @Override
    public void subscribe(final FlowableEmitter<String> emitter) throws Throwable {
        final var listener = new BybitDataStreamListener(emitter);
        emitter.setCancellable(listener::cancel);
        listener.connect();
    }

    private final class BybitDataStreamListener implements Listener {
        private final FlowableEmitter<String> emitter;
        private final StringBuilder buffer = new StringBuilder();
        private final AtomicBoolean isAwaitingPong = new AtomicBoolean(false);
        private final AtomicInteger reconnectAttempts = new AtomicInteger(0);
        private WebSocket webSocket;
        private Disposable ping;

        public BybitDataStreamListener(final FlowableEmitter<String> emitter) {
            this.emitter = emitter;
        }

        @Override
        public void onOpen(final WebSocket webSocket) {
            LOGGER.debug("WebSocket opened");
            reconnectAttempts.set(0);
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
            LOGGER.warn("WebSocket closed with code: {}, reason: {}", statusCode, reason);
            if (!emitter.isCancelled()) {
                reconnect();
            } else {
                stopPing();
                emitter.onComplete();
            }

            return CompletableFuture.completedFuture(null);
        }

        @Override
        public void onError(final WebSocket webSocket, final Throwable error) {
            LOGGER.error("WebSocket error", error);
            if (!emitter.isCancelled()) {
                reconnect();
            } else {
                stopPing();
                emitter.onError(error);
            }
        }

        private void reconnect() {
            if (reconnectAttempts.incrementAndGet() > getMaxReconnectAttempts()) {
                LOGGER.error("Max reconnection attempts ({}) reached", getMaxReconnectAttempts());
                emitter.onError(new IllegalStateException("Max reconnection attempts reached"));
                return;
            }

            final var delay = Math.min(getInitialReconnectIntervalMs() * Math.pow(getBackoffMultiplier(),
                    reconnectAttempts.get() - 1), getMaxReconnectIntervalMs());
            LOGGER.info("Reconnection attempt {} of {}. Waiting for {} ms", reconnectAttempts, getMaxReconnectAttempts(),
                    delay);
            CompletableFuture.delayedExecutor((long) delay, TimeUnit.MILLISECONDS).execute(this::connect);
        }

        private void connect() {
            if (!emitter.isCancelled()) {
                releaseDataStream();
                webSocket = client.newWebSocketBuilder()
                        .connectTimeout(Duration.ofSeconds(10))
                        .buildAsync(uri, this)
                        .exceptionally(ex -> {
                            if (!emitter.isCancelled()) {
                                LOGGER.error("Failed to connect: {}", ex.getMessage());
                                reconnect();
                            }

                            return null;
                        })
                        .join();
            }
        }

        private void cancel() {
            if (emitter.isCancelled()) {
                releaseDataStream();
            }
        }

        private void releaseDataStream() {
            stopPing();
            closeWebSocket();
        }

        /**
         * Starts sending ping messages with the configured interval. If the pong response is not received
         * within the next interval, the data stream is reconnected.
         */
        private void startPing() {
            if (ping == null) {
                LOGGER.debug("Starting ping");
                ping = Flowable.interval(getPingInterval(), TimeUnit.MILLISECONDS)
                        .subscribe($ -> {
                            if (webSocket != null) {
                                if (!isAwaitingPong.get()) {
                                    webSocket.sendText(Requests.ofPing(), true);
                                    isAwaitingPong.set(true);
                                    LOGGER.debug("Ping sent: {}", Requests.ofPing());
                                } else {
                                    reconnect();
                                }
                            }
                        }, t -> LOGGER.error("Ping error", t));
            }
        }

        /**
         * Stops the ping task and disposes of it. If the task is not running,
         * this method has no effect.
         */
        private void stopPing() {
            if (ping != null && !ping.isDisposed()) {
                LOGGER.debug("Stopping ping");
                isAwaitingPong.set(false);
                ping.dispose();
                ping = null;
            }
        }

        /**
         * Closes the WebSocket, stopping the ping task and disposing of it.
         * Does nothing if the WebSocket is null.
         */
        private void closeWebSocket() {
            if (webSocket != null) {
                LOGGER.info("WebSocket closing...");
                webSocket.abort();
                webSocket = null;
            }
        }
    }
}