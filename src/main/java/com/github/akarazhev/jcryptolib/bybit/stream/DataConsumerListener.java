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

import com.github.akarazhev.jcryptolib.resilience.CircuitBreaker;
import com.github.akarazhev.jcryptolib.resilience.HealthCheck;
import com.github.akarazhev.jcryptolib.resilience.RateLimiter;
import com.github.akarazhev.jcryptolib.stream.Payload;
import com.github.akarazhev.jcryptolib.stream.Provider;
import com.github.akarazhev.jcryptolib.stream.Source;
import com.github.akarazhev.jcryptolib.util.JsonUtils;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.disposables.Disposable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.net.URISyntaxException;
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

final class DataConsumerListener implements WebSocket.Listener {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataConsumerListener.class);
    private final HttpClient client;
    private final DataConfig config;
    private final CircuitBreaker circuitBreaker;
    private final RateLimiter reconnectLimiter;
    private final RateLimiter pingLimiter;
    private final HealthCheck healthCheck;
    private final FlowableEmitter<Payload<Map<String, Object>>> emitter;
    private final StringBuilder buffer = new StringBuilder();
    private final AtomicBoolean isConnecting = new AtomicBoolean(false);
    private final AtomicBoolean isAwaitingPong = new AtomicBoolean(false);
    private final AtomicInteger reconnectAttempts = new AtomicInteger(0);
    private final AtomicReference<WebSocket> webSocketRef = new AtomicReference<>();
    private final AtomicReference<Disposable> pingRef = new AtomicReference<>();

    /**
     * Creates a new Bybit data consumer listener.
     * <p>
     * The listener connects to the Bybit WebSocket endpoint, subscribes to topics, and handles
     * connection, reconnection with exponential backoff, ping/pong, and resource
     * cleanup.
     * <p>
     * When {@link FlowableEmitter#isCancelled()} is true, the subscription is cancelled.
     *
     * @param client  HttpClient to use
     * @param config  Bybit data consumer configuration
     * @param emitter Flowable emitter
     * @return Bybit data consumer listener instance
     */
    public static DataConsumerListener create(final HttpClient client, final DataConfig config,
                                              final FlowableEmitter<Payload<Map<String, Object>>> emitter) {
        return new DataConsumerListener(client, config, emitter);
    }

    private DataConsumerListener(final HttpClient client, final DataConfig config,
                                 final FlowableEmitter<Payload<Map<String, Object>>> emitter) {
        this.client = Objects.requireNonNull(client, "Client must be not null");
        this.config = Objects.requireNonNull(config, "Config must be not null");
        this.emitter = Objects.requireNonNull(emitter, "Emitter must be not null");
        this.circuitBreaker = new CircuitBreaker(config.getCircuitBreakerThreshold(), config.getCircuitBreakerTimeoutMs());
        this.reconnectLimiter = new RateLimiter(config.getReconnectRateLimitMs());
        this.pingLimiter = new RateLimiter(config.getPingIntervalMs());
        this.healthCheck = new HealthCheck(status -> LOGGER.info("Health status changed: {}", status));
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
                        emitter.onNext(Payload.of(Provider.BYBIT, Source.WS, JsonUtils.jsonToMap(text)));
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
     * Handles errors during WebSocket communication.
     * <p>
     * This method logs the error, records the failure in the circuit breaker, and updates
     * the health status to unhealthy. If the emitter has not been cancelled, it schedules
     * a reconnection attempt. Otherwise, it stops the ping flow, closes the WebSocket,
     * and sets the connecting flag to false.
     *
     * @param webSocket the WebSocket instance that encountered the error
     * @param error     the exception that was thrown
     */
    @Override
    public void onError(final WebSocket webSocket, final Throwable error) {
        LOGGER.error("WebSocket error", error);
        circuitBreaker.recordFailure();
        healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
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
                final var apiKey = Objects.requireNonNull(config.getApiKey(), "API key is null");
                final var secret = Objects.requireNonNull(config.getApiSecret(), "Secret is null");
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
     * Schedules a reconnection attempt with exponential backoff.
     * <p>
     * If the circuit breaker is open, the method will log an error and set the health status
     * to unhealthy. If the maximum number of reconnection attempts have been reached, the
     * method will log an error, set the health status to unhealthy, and propagate an exception
     * to the emitter if it has not been cancelled. Otherwise, the method will wait for the
     * calculated delay and schedule a reconnection attempt using the {@link #connect()} method.
     */
    private void reconnect() {
        stopPing();
        closeWebSocket();
        isConnecting.set(false);
        if (!circuitBreaker.allowRequest()) {
            LOGGER.error("Circuit breaker OPEN, skipping reconnect.");
            healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
            return;
        }

        if (reconnectAttempts.incrementAndGet() > config.getMaxReconnectAttempts()) {
            LOGGER.error("Max reconnection attempts ({}) reached", config.getMaxReconnectAttempts());
            healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
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
     * Initiates a WebSocket connection if not already connecting and the emitter is not cancelled.
     * <p>
     * This method checks if the circuit breaker allows the connection request and if the
     * reconnection rate limit permits it. It handles the connection process, including stopping
     * any ongoing ping flows and closing existing WebSockets. If connection attempts fail,
     * it will schedule a reconnection with exponential backoff.
     * <p>
     * The method updates the health status based on the success or failure of the connection
     * and logs the process. It ensures that the connection attempt does not proceed if the
     * circuit breaker is open or the reconnect rate is limited.
     */
    public void connect() {
        if (!emitter.isCancelled() && isConnecting.compareAndSet(false, true)) {
            if (!circuitBreaker.allowRequest()) {
                LOGGER.warn("Circuit breaker OPEN, skipping connect attempt");
                healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
                isConnecting.set(false);
                return;
            }

            if (!reconnectLimiter.tryAcquire()) {
                LOGGER.warn("Reconnect rate limited.");
                isConnecting.set(false);
                return;
            }

            stopPing();
            closeWebSocket();
            try {
                client.newWebSocketBuilder()
                        .connectTimeout(Duration.ofMillis(config.getConnectTimeoutMs()))
                        .buildAsync(getURI(), this)
                        .whenComplete((ws, ex) -> {
                            isConnecting.set(false);
                            if (ex != null) {
                                LOGGER.error("Failed to connect: {}", ex.getMessage());
                                circuitBreaker.recordFailure();
                                healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
                                reconnect();
                            } else if (ws != null) {
                                LOGGER.info("WebSocket connection established");
                                webSocketRef.set(ws);
                                circuitBreaker.recordSuccess();
                                healthCheck.setStatus(HealthCheck.Status.HEALTHY);
                            }
                        });
            } catch (final Exception ex) {
                isConnecting.set(false);
                LOGGER.error("Exception during connect: {}", ex.getMessage());
                circuitBreaker.recordFailure();
                healthCheck.setStatus(HealthCheck.Status.UNHEALTHY);
                reconnect();
            }
        }
    }

    /**
     * Cancels the data consumer.
     * <p>
     * This method is called by the emitter when it is cancelled. It releases the data consumer resources by stopping the
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
                .subscribe(l -> {
                    if (!emitter.isCancelled()) {
                        final var webSocket = webSocketRef.get();
                        if (webSocket != null) {
                            if (!isAwaitingPong.get()) {
                                if (pingLimiter.tryAcquire()) {
                                    webSocket.sendText(Requests.ofPing(), true);
                                    isAwaitingPong.set(true);
                                    LOGGER.trace("Ping sent: {}", Requests.ofPing());
                                }
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

    /**
     * Returns the URI of the WebSocket connection.
     * <p>
     * The URI is based on the value of the {@link #config} property.
     * <p>
     * This method is thread-safe and can be called from any thread.
     *
     * @return the URI of the WebSocket connection
     * @throws RuntimeException if the URI is invalid
     */
    private URI getURI() {
        try {
            return new URI(config.getStreamType().getUrl());
        } catch (final URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
