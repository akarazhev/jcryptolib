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

public enum Topic {
    // Order books
    ORDER_BOOK_1_BTC_USDT(Constants.Topic.ORDER_BOOK_1_BTC_USDT),
    ORDER_BOOK_50_BTC_USDT(Constants.Topic.ORDER_BOOK_50_BTC_USDT),
    ORDER_BOOK_200_BTC_USDT(Constants.Topic.ORDER_BOOK_200_BTC_USDT),
    ORDER_BOOK_1_ETH_USDT(Constants.Topic.ORDER_BOOK_1_ETH_USDT),
    ORDER_BOOK_50_ETH_USDT(Constants.Topic.ORDER_BOOK_50_ETH_USDT),
    ORDER_BOOK_200_ETH_USDT(Constants.Topic.ORDER_BOOK_200_ETH_USDT),
    // RPI Order books
    ORDER_BOOK_RPI_BTC_USDT(Constants.Topic.ORDER_BOOK_RPI_BTC_USDT),
    ORDER_BOOK_RPI_ETH_USDT(Constants.Topic.ORDER_BOOK_RPI_ETH_USDT),
    // Trades
    PUBLIC_TRADE_BTC_USDT(Constants.Topic.PUBLIC_TRADE_BTC_USDT),
    PUBLIC_TRADE_ETH_USDT(Constants.Topic.PUBLIC_TRADE_ETH_USDT),
    // Tickers
    TICKERS_BTC_USDT(Constants.Topic.TICKERS_BTC_USDT),
    TICKERS_ETH_USDT(Constants.Topic.TICKERS_ETH_USDT),
    // Kline
    KLINE_1_BTC_USDT(Constants.Topic.KLINE_1_BTC_USDT),
    KLINE_1_ETH_USDT(Constants.Topic.KLINE_1_ETH_USDT),
    ALL_LIQUIDATION_BTC_USDT(Constants.Topic.ALL_LIQUIDATION_BTC_USDT),
    // USDT
    INSURANCE_USDT(Constants.Topic.INSURANCE_USDT),
    // Order
    ORDER(Constants.Topic.ORDER),
    // SOL and USDT
    ORDER_BOOK_25_SOL_USDT(Constants.Topic.ORDER_BOOK_25_SOL_USDT),
    PUBLIC_TRADE_SOL_USDT(Constants.Topic.PUBLIC_TRADE_SOL_USDT),
    TICKERS_SOL_USDT(Constants.Topic.TICKERS_SOL_USDT),
    // EOS and USDT
    KLINE_LT_5_EOS3L_USDT(Constants.Topic.KLINE_LT_5_EOS3L_USDT),
    TICKERS_LT_EOS3L_USDT(Constants.Topic.TICKERS_LT_EOS3L_USDT),
    LT_EOS3L_USDT(Constants.Topic.LT_EOS3L_USDT);

    private final String topic;

    Topic(final String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return topic;
    }
}
