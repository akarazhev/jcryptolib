package com.github.akarazhev.jcryptolib.util;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public final class SecUtils {

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
    public static String getSignature(final String secret, final long expires) throws NoSuchAlgorithmException, InvalidKeyException {
        final var val = "GET/realtime" + expires;
        final var secretKeySpec = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
        final var mac = Mac.getInstance("HmacSHA256");
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
        final var hexArray = "0123456789abcdef".toCharArray();
        final var hexChars = new char[bytes.length * 2];
        for (var j = 0; j < bytes.length; j++) {
            final var v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }

        return new String(hexChars);
    }
}
