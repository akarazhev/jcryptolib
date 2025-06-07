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

import com.github.akarazhev.jcryptolib.util.JsonUtils;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.disposables.Disposable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.WebSocket;
import java.time.Duration;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import static com.github.akarazhev.jcryptolib.bybit.stream.Responses.isAuth;
import static com.github.akarazhev.jcryptolib.bybit.stream.Responses.isCommandResp;
import static com.github.akarazhev.jcryptolib.bybit.stream.Responses.isPong;
import static com.github.akarazhev.jcryptolib.bybit.stream.Responses.isSubscription;
import static com.github.akarazhev.jcryptolib.bybit.stream.Responses.isSuccess;

final class WebSocketStreamListener implements WebSocket.Listener {
    private static final Logger LOGGER = LoggerFactory.getLogger(WebSocketStreamListener.class);
    private final HttpClient client;
    private final BybitDataConfig config;
    private final FlowableEmitter<Map<String, Object>> emitter;
    private final StringBuilder buffer = new StringBuilder();
    private final AtomicBoolean isConnecting = new AtomicBoolean(false);
    private final AtomicBoolean isAwaitingPong = new AtomicBoolean(false);
    private final AtomicInteger reconnectAttempts = new AtomicInteger(0);
    private final AtomicReference<WebSocket> webSocketRef = new AtomicReference<>();
    private final AtomicReference<Disposable> pingRef = new AtomicReference<>();

    public WebSocketStreamListener(final HttpClient client, final BybitDataConfig config,
                                   final FlowableEmitter<Map<String, Object>> emitter) {
        this.client = client;
        this.config = config;
        this.emitter = emitter;
    }

    /**
     * Handles WebSocket open events.
     * <p>
     * This method resets the reconnection attempts counter, sends a subscription request, and
     * requests the first message.
     *
     * @param webSocket WebSocket instance
     */
    @Override
    public void onOpen(final WebSocket webSocket) {
        LOGGER.info("WebSocket opened");
        reconnectAttempts.set(0);
        doAuth(webSocket);
        webSocket.sendText(Requests.ofSubscription(config.getTopics()), true);
        webSocket.request(1);
    }

    /**
     * Handles WebSocket text messages.
     * <p>
     * This method processes the full message when the last fragment is received.
     * If the message is a subscription response, it starts the ping flow.
     * If the message is a pong response, it resets the awaiting pong flag.
     * Otherwise, it emits the message to the subscriber.
     *
     * @param webSocket WebSocket instance
     * @param data      Message data
     * @param last      Whether this is the last fragment
     * @return A completion stage that will be completed when the message is processed
     */
    @Override
    public CompletionStage<?> onText(final WebSocket webSocket, final CharSequence data, final boolean last) {
        buffer.append(data);
        if (last) {
            final var text = buffer.toString();
            buffer.setLength(0);
            if (isSubscription(text) || isCommandResp(text)) {
                if (isSuccess(text)) {
                    LOGGER.debug("Received subscription message: {}", text);
                    startPing();
                } else {
                    LOGGER.error("Received subscription error: {}", text);
                    closeWebSocket();
                    isConnecting.set(false);
                    emitter.onError(new IllegalStateException("Invalid subscription response: " + text));
                    return CompletableFuture.completedFuture(null);
                }
            } else if (isPong(text)) {
                LOGGER.trace("Received pong message: {}", text);
                isAwaitingPong.set(false);
            } else {
                if (!emitter.isCancelled()) {
                    LOGGER.debug("Received message: {}", text);
                    if (!isAuth(text)) {
                        emitter.onNext(JsonUtils.jsonToMap(text));
                    }
                }
            }
        }

        webSocket.request(1);
        return CompletableFuture.completedFuture(null);
    }

    /**
     * Called when the WebSocket connection is closed.
     * <p>
     * If the emitter is not cancelled, the method will schedule a reconnection attempt.
     * If the emitter is cancelled, the method will stop the ping flow.
     *
     * @param webSocket  the closed WebSocket
     * @param statusCode the status code of the close event
     * @param reason     the reason of the close event
     * @return a {@link CompletionStage} that completes when the method has finished
     */
    @Override
    public CompletionStage<?> onClose(final WebSocket webSocket, final int statusCode, final String reason) {
        LOGGER.warn("WebSocket closed with code: {}, reason: {}", statusCode, reason);
        if (!emitter.isCancelled()) {
            reconnect();
        } else {
            stopPing();
            closeWebSocket();
            isConnecting.set(false);
        }

        return CompletableFuture.completedFuture(null);
    }

    /**
     * Called when an error occurs during the WebSocket connection.
     * <p>
     * If the emitter is not cancelled, the method will schedule a reconnection attempt with an
     * exponential backoff. If the maximum number of reconnection attempts is reached, the method
     * will propagate an error to the emitter.
     * <p>
     * If the emitter is cancelled, the method will stop the ping flow.
     */
    @Override
    public void onError(final WebSocket webSocket, final Throwable error) {
        LOGGER.error("WebSocket error", error);
        if (!emitter.isCancelled()) {
            reconnect();
        } else {
            stopPing();
            closeWebSocket();
            isConnecting.set(false);
        }
    }

    /**
     * Performs an authentication request.
     * <p>
     * If the API key and secret are not null, the method will send an authentication request
     * to the WebSocket. If an exception occurs during the authentication, the method will
     * close the WebSocket, set the connecting flag to false, and propagate an error to the
     * emitter.
     * <p>
     * This method is called by the {@link #onOpen(WebSocket)} method.
     *
     * @param webSocket the WebSocket instance
     */
    private void doAuth(final WebSocket webSocket) {
        if (config.isUseAuth()) {
            try {
                final var apiKey = Objects.requireNonNull(config.getKey(), "API key is null");
                final var secret = Objects.requireNonNull(config.getSecret(), "Secret is null");
                webSocket.sendText(Requests.ofAuth(apiKey, 10000, secret), true); // todo: make expires configurable
            } catch (final Exception e) {
                LOGGER.error("Exception during auth: {}", e.getMessage());
                closeWebSocket();
                isConnecting.set(false);
                emitter.onError(e);
            }
        }
    }

    /**
     * Schedules a reconnection attempt with an exponential backoff.
     * <p>
     * If the maximum number of reconnection attempts is reached, the method will propagate an
     * error to the emitter.
     */
    private void reconnect() {
        stopPing();
        closeWebSocket();
        isConnecting.set(false);
        if (reconnectAttempts.incrementAndGet() > config.getMaxReconnectAttempts()) {
            LOGGER.error("Max reconnection attempts ({}) reached", config.getMaxReconnectAttempts());
            if (!emitter.isCancelled()) {
                emitter.onError(new IllegalStateException("Max reconnection attempts reached"));
            }

            return;
        }

        final var delay = Math.min(config.getInitialReconnectIntervalMs() * Math.pow(config.getBackoffMultiplier(),
                reconnectAttempts.get() - 1), config.getMaxReconnectIntervalMs());
        LOGGER.info("Reconnection attempt {} of {}. Waiting for {} ms", reconnectAttempts.get(),
                config.getMaxReconnectAttempts(), delay);
        CompletableFuture.delayedExecutor((long) delay, TimeUnit.MILLISECONDS).execute(this::connect);
    }

    /**
     * Connects to the WebSocket and starts listening for messages.
     * <p>
     * If the connection fails, the method will schedule a reconnection attempt.
     */
    public void connect() {
        if (!emitter.isCancelled() && isConnecting.compareAndSet(false, true)) {
            stopPing();
            closeWebSocket();
            try {
                client.newWebSocketBuilder()
                        .connectTimeout(Duration.ofMillis(config.getConnectTimeoutMs()))
                        .buildAsync(URI.create(config.getUrl()), this)
                        .whenComplete((ws, ex) -> {
                            isConnecting.set(false);
                            if (ex != null) {
                                LOGGER.error("Failed to connect: {}", ex.getMessage());
                                reconnect();
                            } else if (ws != null) {
                                LOGGER.info("WebSocket connection established");
                                webSocketRef.set(ws);
                            }
                        });
            } catch (final Exception ex) {
                isConnecting.set(false);
                LOGGER.error("Exception during connect: {}", ex.getMessage());
                reconnect();
            }
        }
    }

    /**
     * Cancels the data stream.
     * <p>
     * This method is called by the emitter when it is cancelled. It releases the data stream resources by stopping the
     * current ping operation and closing the WebSocket.
     */
    public void cancel() {
        if (emitter.isCancelled()) {
            stopPing();
            closeWebSocket();
            isConnecting.set(false);
        }
    }

    /**
     * Starts a ping flow.
     * <p>
     * This method starts a flow that sends a ping message at a fixed interval.
     * If the pong is not received, a reconnection is scheduled.
     */
    private void startPing() {
        stopPing();
        LOGGER.debug("Starting ping");
        pingRef.set(Flowable.interval(config.getPingIntervalMs(), TimeUnit.MILLISECONDS)
                .subscribe(_ -> {
                    if (!emitter.isCancelled()) {
                        final var webSocket = webSocketRef.get();
                        if (webSocket != null) {
                            if (!isAwaitingPong.get()) {
                                webSocket.sendText(Requests.ofPing(), true);
                                isAwaitingPong.set(true);
                                LOGGER.trace("Ping sent: {}", Requests.ofPing());
                            } else {
                                reconnect();
                            }
                        }
                    }
                }, t -> LOGGER.error("Ping error", t)));
    }

    /**
     * Stops the current ping operation.
     * If the operation is null, then no operation is performed.
     * <p>
     * This method is thread-safe and can be called from any thread.
     */
    private void stopPing() {
        final var ping = pingRef.getAndSet(null);
        if (ping != null && !ping.isDisposed()) {
            LOGGER.debug("Stopping ping");
            isAwaitingPong.set(false);
            ping.dispose();
        }
    }

    /**
     * Closes the current WebSocket connection.
     * If the connection is null, then no operation is performed.
     * <p>
     * This method is thread-safe and can be called from any thread.
     */
    private void closeWebSocket() {
        final var webSocket = webSocketRef.getAndSet(null);
        if (webSocket != null) {
            LOGGER.debug("Closing WebSocket");
            webSocket.abort();
        }
    }
}
