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

package com.github.akarazhev.jcryptolib;

import com.github.akarazhev.jcryptolib.stream.Payload;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.http.HttpClient;
import java.util.Map;

public final class DataStreams {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataStreams.class);

    private DataStreams() {
        throw new UnsupportedOperationException();
    }

    public static Flowable<Payload<Map<String, Object>>> ofBybit(final HttpClient client,
                                                                 final com.github.akarazhev.jcryptolib.bybit.stream.DataConfig config) {
        LOGGER.info(config.print());
        return Flowable.create(e ->
                        com.github.akarazhev.jcryptolib.bybit.stream.DataConsumer.create(client, config).subscribe(e),
                BackpressureStrategy.BUFFER);
    }

    public static Flowable<Payload<Map<String, Object>>> ofCmc(final HttpClient client,
                                                               final com.github.akarazhev.jcryptolib.cmc.stream.DataConfig config) {
        LOGGER.info(config.print());
        return Flowable.create(e ->
                        com.github.akarazhev.jcryptolib.cmc.stream.DataConsumer.create(client, config).subscribe(e),
                BackpressureStrategy.BUFFER);
    }
}
