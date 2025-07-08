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

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public final class DataConfig {
    private final Set<Type> types;
    private final int connectTimeoutMs;
    private final LocalTime fetchAtTime;

    private DataConfig(final Builder builder) {
        if (builder.types.isEmpty()) {
            throw new IllegalArgumentException("Types is empty");
        }

        if (!builder.fetchAtTime.contains(":")) {
            throw new IllegalArgumentException("Fetch at time is not valid");
        }

        this.types = builder.types;
        this.connectTimeoutMs = builder.connectTimeoutMs;
        final var time = builder.fetchAtTime.split(":");
        this.fetchAtTime = LocalTime.of(Integer.parseInt(time[0]), Integer.parseInt(time[1]));
    }

    public Set<Type> getTypes() {
        return types;
    }

    public int getConnectTimeoutMs() {
        return connectTimeoutMs;
    }

    public LocalTime getFetchAtTime() {
        return fetchAtTime;
    }

    public String print() {
        return "\nCMC Data Config {" +
                "\n\ttypes=" + types +
                "\n\tfetchAtTime=" + fetchAtTime +
                "\n\tconnectTimeoutMs=" + connectTimeoutMs +
                "\n}";
    }

    public static final class Builder {
        private final Set<Type> types = new HashSet<>();
        private int connectTimeoutMs = Config.getConnectTimeoutMs();
        private String fetchAtTime = Config.getFetchAtTime();

        public Builder type(final Type type) {
            this.types.add(type);
            return this;
        }

        public Builder connectTimeoutMs(final int connectTimeoutMs) {
            this.connectTimeoutMs = connectTimeoutMs;
            return this;
        }

        public Builder fetchAtTime(final String fetchAtTime) {
            this.fetchAtTime = fetchAtTime;
            return this;
        }

        public DataConfig build() {
            return new DataConfig(this);
        }
    }
}
