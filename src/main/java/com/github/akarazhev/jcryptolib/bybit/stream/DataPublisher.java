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
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.processors.PublishProcessor;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.WebSocket;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public final class DataPublisher {
    private final WebSocket webSocket;
    private final DataConfig config;
    private final PublishProcessor<Map<String, Object>> processor = PublishProcessor.create();

    private DataPublisher(final WebSocket webSocket, final DataConfig config) {
        this.webSocket = webSocket;
        this.config = config;
    }

    public static CompletableFuture<DataPublisher> connect(final HttpClient client, final DataConfig config) {
        final var listener = new Listener();
        final var webSocketFuture = client.newWebSocketBuilder().buildAsync(URI.create(config.getUrl()), listener);
        return webSocketFuture.thenApply(webSocket -> {
            final var dataPublisher = new DataPublisher(webSocket, config);
            listener.setDataPublisher(dataPublisher);
            return dataPublisher;
        });
    }

    public Completable send(final Map<String, Object> data) {
        return Completable.fromFuture(webSocket.sendText(JsonUtils.mapToJson(data), true));
    }

    public Flowable<Map<String, Object>> textMessages() {
        return processor.onBackpressureBuffer();
    }

    public Completable close() {
        return Completable.fromFuture(webSocket.sendClose(WebSocket.NORMAL_CLOSURE, "Client close"));
    }

    private static class Listener implements WebSocket.Listener {
        private DataPublisher dataPublisher;

        void setDataPublisher(final DataPublisher dataPublisher) {
            this.dataPublisher = dataPublisher;
        }

        @Override
        public void onOpen(final WebSocket webSocket) {
            webSocket.request(1); // Request first message
        }

        @Override
        public CompletionStage<?> onText(final WebSocket webSocket, final CharSequence data, final boolean last) {
            dataPublisher.processor.onNext(JsonUtils.jsonToMap(data.toString()));
            webSocket.request(1); // Request next message
            return CompletableFuture.completedFuture(null);
        }

        @Override
        public void onError(final WebSocket webSocket, final Throwable error) {
            dataPublisher.processor.onError(error);
        }

        @Override
        public CompletionStage<?> onClose(final WebSocket webSocket, final int statusCode, final String reason) {
            dataPublisher.processor.onComplete();
            return CompletableFuture.completedFuture(null);
        }
    }
}
