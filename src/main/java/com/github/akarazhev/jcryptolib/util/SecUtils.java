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

package com.github.akarazhev.jcryptolib.util;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public final class SecUtils {
    private final static String ALGORITHM = "HmacSHA256";
    private final static String GET_REALTIME = "GET/realtime";
    private final static char[] HEX_ARRAY = "0123456789abcdef".toCharArray();

    private SecUtils() {
        throw new UnsupportedOperationException();
    }

    /**
     * Generates a signature for a given {@code secret} and {@code expires} using the <a
     * href="https://en.wikipedia.org/wiki/HMAC">HMAC-SHA256</a> algorithm.
     *
     * @param secret  the secret
     * @param expires the expires
     * @return a signature
     * @throws NoSuchAlgorithmException if the algorithm is not available
     * @throws InvalidKeyException      if the key is invalid
     */
    public static String getSignature(final String secret, final long expires)
            throws NoSuchAlgorithmException, InvalidKeyException {
        final var val = GET_REALTIME + expires;
        final var secretKeySpec = new SecretKeySpec(secret.getBytes(), ALGORITHM);
        final var mac = Mac.getInstance(ALGORITHM);
        mac.init(secretKeySpec);
        final var hmacSha256 = mac.doFinal(val.getBytes());
        return encodeHexString(hmacSha256);
    }

    /**
     * Encodes the given {@code bytes} as a hexadecimal string.
     *
     * @param bytes the bytes to encode
     * @return a hexadecimal string representation of the given bytes
     */
    private static String encodeHexString(final byte[] bytes) {
        final var hexChars = new char[bytes.length * 2];
        for (var j = 0; j < bytes.length; j++) {
            final var v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }

        return new String(hexChars);
    }
}
