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
import com.github.akarazhev.jcryptolib.util.SecUtils;

import java.time.Instant;
import java.util.UUID;

import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Request.AUTH;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Request.PING;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Request.SUBSCRIBE;

final class Requests {
    private Requests() {
        throw new UnsupportedOperationException();
    }

    public static String ofSubscription(final String[] topics) {
        return JsonUtils.objectToJson(new Request(UUID.randomUUID().toString(), SUBSCRIBE, topics));
    }

    public static String ofPing() {
        return JsonUtils.objectToJson(new Ping(PING));
    }

    public static String ofAuth(final String apiKey, final long expires, final String secret) throws Exception {
        final var expiresAt = Instant.now().toEpochMilli() + expires;
        final var args = new String[]{apiKey, String.valueOf(expiresAt), SecUtils.getSignature(secret, expiresAt)};
        return JsonUtils.objectToJson(new Request(UUID.randomUUID().toString(), AUTH, args));
    }
}
