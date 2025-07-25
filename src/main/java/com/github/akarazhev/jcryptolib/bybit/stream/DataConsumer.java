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

import com.github.akarazhev.jcryptolib.stream.Payload;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;

import java.net.http.HttpClient;
import java.util.Map;

/**
 * Bybit data consumer.
 * <p>
 * Connects to Bybit WebSocket endpoint, subscribes to topics, and handles
 * connection, reconnection with exponential backoff, ping/pong, and resource
 * cleanup.
 */
public final class DataConsumer implements FlowableOnSubscribe<Payload<Map<String, Object>>> {
    private final HttpClient client;
    private final DataConfig config;

    private DataConsumer(final HttpClient client, final DataConfig config) {
        this.client = client;
        this.config = config;
    }

    /**
     * Creates a new Bybit data consumer.
     * <p>
     * Connects to Bybit WebSocket endpoint, subscribes to topics, and handles
     * connection, reconnection with exponential backoff, ping/pong, and resource
     * cleanup.
     * <p>
     * When {@link FlowableEmitter#isCancelled()} is true, the subscription is cancelled.
     *
     * @param client HttpClient to use
     * @param config Bybit data consumer configuration
     * @return Bybit data consumer instance
     */
    public static DataConsumer create(final HttpClient client, final DataConfig config) {
        return new DataConsumer(client, config);
    }

    /**
     * Subscribes to Bybit WebSocket endpoint.
     * <p>
     * Connects to Bybit WebSocket endpoint, subscribes to topics, and handles
     * connection, reconnection with exponential backoff, ping/pong, and resource
     * cleanup.
     * <p>
     * When {@link FlowableEmitter#isCancelled()} is true, the subscription is cancelled.
     *
     * @param emitter Flowable emitter
     * @throws Throwable if an error occurs
     */
    @Override
    public void subscribe(@NonNull final FlowableEmitter<Payload<Map<String, Object>>> emitter) throws Throwable {
        if (!config.getTypes().isEmpty()) {
            final var fetcher = BybitDataFetcher.create(client, config, emitter);
            emitter.setCancellable(fetcher::cancel);
            fetcher.fetch();
        }

        if (config.getRestApiType() != null) {
            final var fetcher = RestApiDataFetcher.create(client, config, emitter);
            emitter.setCancellable(fetcher::cancel);
            fetcher.fetch();
        }

        if (config.getStreamType() != null) {
            final var listener = DataConsumerListener.create(client, config, emitter);
            emitter.setCancellable(listener::cancel);
            listener.connect();
        }
    }
}