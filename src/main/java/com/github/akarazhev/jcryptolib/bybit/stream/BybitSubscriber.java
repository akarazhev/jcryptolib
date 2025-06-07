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

import com.github.akarazhev.jcryptolib.stream.DataHandler;
import com.github.akarazhev.jcryptolib.stream.Subscriber;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public final class BybitSubscriber implements Subscriber {
    private static final Logger LOGGER = LoggerFactory.getLogger(BybitSubscriber.class);
    private static final String STREAM_TOPIC_PREFIX = "bybit";
    private final DataHandler handler;

    private BybitSubscriber(final DataHandler handler) {
        this.handler = handler;
    }

    public static BybitSubscriber create(final DataHandler handler) {
        return new BybitSubscriber(handler);
    }

    @Override
    public Consumer<Map<String, Object>> onNext() {
        return data -> {
            handler.handle(data);
            LOGGER.debug("Received message: {}", data);
        };
    }

    @Override
    public Consumer<Throwable> onError() {
        return t -> {
            handler.error(t);
            LOGGER.debug("WebSocket error", t);
        };
    }

    @Override
    public Action onComplete() {
        return () -> {
            handler.close();
            LOGGER.debug("WebSocket closed");
        };
    }
}
