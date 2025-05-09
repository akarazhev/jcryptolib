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

package com.github.akarazhev.jcryptolib.bybit;

public final class BybitTestConfig {
    private static final String[] PUBLIC_ORDER_BOOK_1_BTC_USDT = new String[]{"orderbook.1.BTCUSDT"};
    private static final String[] PUBLIC_TICKERS_BTC_USDT = new String[]{"tickers.BTCUSDT"};
    private static final String[] PUBLIC_KLINE_BTC_USDT = new String[]{"kline.1.BTCUSDT"};

    /**
     * Returns a list of public order book level 1 topics for the BTCUSDT pair.
     *
     * @return a list of public order book level 1 topics for the BTCUSDT pair.
     */
    public static String[] getPublicOrderBook1BtcUsdt() {
        return PUBLIC_ORDER_BOOK_1_BTC_USDT;
    }

    /**
     * Returns a list of public ticker topics for the BTCUSDT pair.
     *
     * @return a list of public ticker topics for the BTCUSDT pair.
     */
    public static String[] getPublicTickersBtcUsdt() {
        return PUBLIC_TICKERS_BTC_USDT;
    }

    /**
     * Returns a list of public kline topics for the BTCUSDT pair.
     *
     * @return a list of public kline topics for the BTCUSDT pair.
     */
    public static String[] getPublicKlineBtcUsdt() {
        return PUBLIC_KLINE_BTC_USDT;
    }
}
