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

package com.github.akarazhev.jcryptolib.cmc.stream;

import com.github.akarazhev.jcryptolib.cmc.config.Config;
import com.github.akarazhev.jcryptolib.cmc.config.Type;

import java.util.Objects;

public final class DataConfig {
    private final Type type;
    private final int connectTimeoutMs;
    private final int fetchIntervalMs;

    private DataConfig(final Builder builder) {
        this.type = Objects.requireNonNull(builder.type, "Type is null");
        this.connectTimeoutMs = builder.connectTimeoutMs;
        this.fetchIntervalMs = builder.fetchIntervalMs;
    }

    public Type getType() {
        return type;
    }

    public int getConnectTimeoutMs() {
        return connectTimeoutMs;
    }

    public int getFetchIntervalMs() {
        return fetchIntervalMs;
    }

    public String print() {
        return "\nCMC Data Config {" +
                "\n\ttype=" + type +
                "\n\tconnectTimeoutMs=" + connectTimeoutMs +
                "\n\tfetchIntervalMs=" + fetchIntervalMs +
                "\n}";
    }

    public static final class Builder {
        private Type type;
        private int connectTimeoutMs = Config.getConnectTimeoutMs();
        private int fetchIntervalMs = Config.getFetchIntervalMs();

        public Builder type(final Type type) {
            this.type = type;
            return this;
        }

        public Builder connectTimeoutMs(final int connectTimeoutMs) {
            this.connectTimeoutMs = connectTimeoutMs;
            return this;
        }

        public Builder fetchIntervalMs(final int fetchIntervalMs) {
            this.fetchIntervalMs = fetchIntervalMs;
            return this;
        }

        public DataConfig build() {
            return new DataConfig(this);
        }
    }
}
