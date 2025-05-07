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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.IOException;
import java.util.Map;

public final class JsonUtils {
    private static final ObjectMapper MAPPER;
    private static final ObjectReader READER;
    private static final ObjectWriter WRITER;

    static {
        MAPPER = new ObjectMapper();
        MAPPER.setSerializationInclusion(JsonInclude.Include.ALWAYS);
        MAPPER.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        READER = MAPPER.reader();
        WRITER = MAPPER.writer();
    }

    private JsonUtils() {
        throw new UnsupportedOperationException();
    }

    public static String objectToJson(final Object object) {
        try {
            return WRITER.writeValueAsString(object);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Map<String, Object> jsonToMap(final String json) {
        try {
            return READER.forType(Map.class).readValue(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> byte[] objectToBytes(final T object) {
        try {
            return WRITER.writeValueAsBytes(object);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
