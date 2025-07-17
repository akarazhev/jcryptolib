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

package com.github.akarazhev.jcryptolib.bybit.config;

public enum Type {
    ANMT("Announcements", "https://api.bybit.com/v5/announcements/index"),
    PTST("Public Testnet Spot", "wss://stream-testnet.bybit.com/v5/public/spot"),
    PTL("Public Testnet Linear", "wss://stream-testnet.bybit.com/v5/public/linear"),
    PTI("Public Testnet Inverse", "wss://stream-testnet.bybit.com/v5/public/inverse"),
    PTO("Public Testnet Option", "wss://stream-testnet.bybit.com/v5/public/option"),
    PTSD("Public Testnet Spread", "wss://stream-testnet.bybit.com/v5/public/spread"),
    PT("Private Testnet", "wss://stream-testnet.bybit.com/v5/private"),
    TO("Testnet Order", "wss://stream-testnet.bybit.com/v5/trade"),
    MD("Mega Drop", "https://www.bybit.com/x-api/spot/api/megadrop/v1/prizePool/tokenList"),
    LPL("Launch Pool", "https://www.bybit.com/x-api/spot/api/launchpool/v1/home");

    private final String url;

    Type(final String type, final String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
