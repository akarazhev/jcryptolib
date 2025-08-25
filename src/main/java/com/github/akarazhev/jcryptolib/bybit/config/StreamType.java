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

public enum StreamType {
    PTST(Constants.PublicTestnetSpot.TYPE, Constants.PublicTestnetSpot.URL),
    PTL(Constants.PublicTestnetLinear.TYPE, Constants.PublicTestnetLinear.URL),
    PTI(Constants.PublicTestnetInverse.TYPE, Constants.PublicTestnetInverse.URL),
    PTO(Constants.PublicTestnetOption.TYPE, Constants.PublicTestnetOption.URL),
    PTSD(Constants.PublicTestnetSpread.TYPE, Constants.PublicTestnetSpread.URL),
    PT(Constants.PrivateTestnet.TYPE, Constants.PrivateTestnet.URL),
    TO(Constants.TestnetOrder.TYPE, Constants.TestnetOrder.URL);

    private final String url;

    StreamType(final String streamType, final String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
