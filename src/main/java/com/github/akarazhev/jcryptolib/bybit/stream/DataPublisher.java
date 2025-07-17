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
import io.reactivex.rxjava3.core.BackpressureOverflowStrategy;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.processors.PublishProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.WebSocket;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

// TODO: Draft solution
/**
 * Production-grade reactive WebSocket data publisher for Bybit.
 */
public final class DataPublisher {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataPublisher.class);
    private static final int DEFAULT_BUFFER_SIZE = 1024;

    private final WebSocket webSocket;
    private final DataConfig config;
    private final PublishProcessor<Map<String, Object>> processor;
    private final int bufferSize;
    private volatile boolean disposed = false;

    private DataPublisher(
            final WebSocket webSocket,
            final DataConfig config,
            final PublishProcessor<Map<String, Object>> processor,
            final int bufferSize
    ) {
        this.webSocket = Objects.requireNonNull(webSocket, "webSocket");
        this.config = Objects.requireNonNull(config, "config");
        this.processor = Objects.requireNonNull(processor, "processor");
        this.bufferSize = bufferSize;
    }

    /**
     * Connects to the Bybit WebSocket endpoint and returns a DataPublisher.
     */
    public static CompletableFuture<DataPublisher> connect(final HttpClient client, final DataConfig config) {
        return connect(client, config, DEFAULT_BUFFER_SIZE);
    }

    /**
     * Connects with a custom buffer size.
     */
    public static CompletableFuture<DataPublisher> connect(
            final HttpClient client,
            final DataConfig config,
            final int bufferSize
    ) {
        Objects.requireNonNull(client, "client");
        Objects.requireNonNull(config, "config");
        if (bufferSize <= 0) throw new IllegalArgumentException("bufferSize must be positive");

        final var processor = PublishProcessor.<Map<String, Object>>create();
        final var listener = new Listener(processor);
//       todo final var webSocketFuture = client.newWebSocketBuilder().buildAsync(URI.create(config.getUrl().toString()), listener);
        final var webSocketFuture = client.newWebSocketBuilder().buildAsync(URI.create(""), listener);
        return webSocketFuture.thenApply(webSocket -> new DataPublisher(webSocket, config, processor, bufferSize));
    }

    /**
     * Sends a message over the WebSocket.
     */
    public Completable send(final Map<String, Object> data) {
        Objects.requireNonNull(data, "data");
        if (disposed) return Completable.error(new IllegalStateException("DataPublisher is disposed"));
        return Completable.fromFuture(webSocket.sendText(JsonUtils.mapToJson(data), true));
    }

    /**
     * Returns a Flowable stream of JSON messages.
     */
    public Flowable<Map<String, Object>> textMessages() {
        return processor
                .onBackpressureBuffer(
                        bufferSize,
                        () -> {
                            LOGGER.error("Buffer overflow in DataPublisher, closing processor.");
                            processor.onError(new IllegalStateException("Buffer overflow in DataPublisher"));
                        },
                        BackpressureOverflowStrategy.DROP_OLDEST
                )
                .doOnError(t -> LOGGER.error("Error in DataPublisher stream", t))
                .doOnComplete(() -> LOGGER.info("DataPublisher stream completed"));
    }

    /**
     * Closes the WebSocket and completes the processor.
     */
    public Completable close() {
        if (disposed) return Completable.complete();
        disposed = true;
        return Completable.fromFuture(webSocket.sendClose(WebSocket.NORMAL_CLOSURE, "Client close"))
                .doFinally(() -> {
                    if (!processor.hasComplete() && !processor.hasThrowable()) {
                        processor.onComplete();
                    }
                    LOGGER.info("DataPublisher closed.");
                });
    }

    /**
     * Disposes the processor and releases resources.
     */
    public void dispose() {
        if (!disposed) {
            disposed = true;
            processor.onComplete();
            LOGGER.info("DataPublisher disposed.");
        }
    }

    private static class Listener implements WebSocket.Listener {
        private final PublishProcessor<Map<String, Object>> processor;

        Listener(final PublishProcessor<Map<String, Object>> processor) {
            this.processor = Objects.requireNonNull(processor, "processor");
        }

        @Override
        public void onOpen(final WebSocket webSocket) {
            LOGGER.info("WebSocket opened: {}", webSocket.getSubprotocol());
            webSocket.request(1);
        }

        @Override
        public CompletionStage<?> onText(final WebSocket webSocket, final CharSequence data, final boolean last) {
            try {
                processor.onNext(JsonUtils.jsonToMap(data.toString()));
            } catch (final Exception e) {
                LOGGER.error("Failed to parse incoming message: {}", data, e);
                processor.onError(e);
            }
            webSocket.request(1);
            return CompletableFuture.completedFuture(null);
        }

        @Override
        public void onError(final WebSocket webSocket, final Throwable error) {
            LOGGER.error("WebSocket error", error);
            processor.onError(error);
        }

        @Override
        public CompletionStage<?> onClose(final WebSocket webSocket, final int statusCode, final String reason) {
            LOGGER.info("WebSocket closed: {} - {}", statusCode, reason);
            processor.onComplete();
            return CompletableFuture.completedFuture(null);
        }
    }
}
