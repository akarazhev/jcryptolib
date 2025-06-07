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

import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;

import java.net.http.HttpClient;
import java.util.Map;

/**
 * Bybit data stream.
 * <p>
 * Connects to Bybit WebSocket endpoint, subscribes to topics, and handles
 * connection, reconnection with exponential backoff, ping/pong, and resource
 * cleanup.
 */
public final class BybitDataStream implements FlowableOnSubscribe<Map<String, Object>> {
    private final HttpClient client;
    private final BybitDataConfig config;

    private BybitDataStream(final HttpClient client, final BybitDataConfig config) {
        this.client = client;
        this.config = config;
    }

    /**
     * Creates a new Bybit data stream.
     * <p>
     * Connects to Bybit WebSocket endpoint, subscribes to topics, and handles
     * connection, reconnection with exponential backoff, ping/pong, and resource
     * cleanup.
     * <p>
     * When {@link FlowableEmitter#isCancelled()} is true, the subscription is cancelled.
     *
     * @param client HttpClient to use
     * @param config Bybit data stream configuration
     * @return Bybit data stream instance
     */
    public static BybitDataStream create(final HttpClient client, final BybitDataConfig config) {
        return new BybitDataStream(client, config);
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
    public void subscribe(final FlowableEmitter<Map<String, Object>> emitter) throws Throwable {
        if (config.isWebSocket()) {
            final var listener = new WebSocketStreamListener(client, config, emitter);
            emitter.setCancellable(listener::cancel);
            listener.connect();
        } else if (config.isRestApi()) {
            final var fetcher = new ApiDataFetcher(client, config, emitter);
            emitter.setCancellable(fetcher::cancel);
            fetcher.fetch();
        } else {
            throw new IllegalArgumentException("Unsupported data stream type");
        }
    }
}