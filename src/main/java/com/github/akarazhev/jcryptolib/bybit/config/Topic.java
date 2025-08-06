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
    ORDER_BOOK_100_BTC_USDT(Constants.Topic.ORDER_BOOK_100_BTC_USDT),
    ORDER_BOOK_200_BTC_USDT(Constants.Topic.ORDER_BOOK_200_BTC_USDT),
    ORDER_BOOK_500_BTC_USDT(Constants.Topic.ORDER_BOOK_500_BTC_USDT),
    ORDER_BOOK_1_ETH_USDT(Constants.Topic.ORDER_BOOK_1_ETH_USDT),
    ORDER_BOOK_50_ETH_USDT(Constants.Topic.ORDER_BOOK_50_ETH_USDT),
    ORDER_BOOK_100_ETH_USDT(Constants.Topic.ORDER_BOOK_100_ETH_USDT),
    ORDER_BOOK_200_ETH_USDT(Constants.Topic.ORDER_BOOK_200_ETH_USDT),
    ORDER_BOOK_500_ETH_USDT(Constants.Topic.ORDER_BOOK_500_ETH_USDT),
    // RPI Order books
    ORDER_BOOK_RPI_BTC_USDT(Constants.Topic.ORDER_BOOK_RPI_BTC_USDT),
    ORDER_BOOK_RPI_ETH_USDT(Constants.Topic.ORDER_BOOK_RPI_ETH_USDT),
    // Trades
    PUBLIC_TRADE_BTC_USDT(Constants.Topic.PUBLIC_TRADE_BTC_USDT),
    PUBLIC_TRADE_ETH_USDT(Constants.Topic.PUBLIC_TRADE_ETH_USDT),
    // Tickers
    TICKERS_BTC_USDT(Constants.Topic.TICKERS_BTC_USDT),
    TICKERS_ETH_USDT(Constants.Topic.TICKERS_ETH_USDT),
    // Klines
    KLINE_1_BTC_USDT(Constants.Topic.KLINE_1_BTC_USDT),
    KLINE_1_ETH_USDT(Constants.Topic.KLINE_1_ETH_USDT),
    // All liquidations
    ALL_LIQUIDATION_BTC_USDT(Constants.Topic.ALL_LIQUIDATION_BTC_USDT),
    ALL_LIQUIDATION_ETH_USDT(Constants.Topic.ALL_LIQUIDATION_ETH_USDT),
    // Price Limits
    PRICE_LIMIT_BTC_USDT(Constants.Topic.PRICE_LIMIT_BTC_USDT),
    PRICE_LIMIT_ETH_USDT(Constants.Topic.PRICE_LIMIT_ETH_USDT),
    // Insurances
    INSURANCE_USDT(Constants.Topic.INSURANCE_USDT),
    INSURANCE_USDC(Constants.Topic.INSURANCE_USDC),
    // Orders
    ORDER(Constants.Topic.ORDER),
    // Spread order books
    ORDER_BOOK_25_BTCUSDT_BTC_USDT(Constants.Topic.ORDER_BOOK_25_BTCUSDT_BTC_USDT),
    ORDER_BOOK_25_ETHUSDT_ETH_USDT(Constants.Topic.ORDER_BOOK_25_ETHUSDT_ETH_USDT),
    // Spread trades
    PUBLIC_TRADE_BTCUSDT_BTC_USDT(Constants.Topic.PUBLIC_TRADE_BTCUSDT_BTC_USDT),
    PUBLIC_TRADE_ETHUSDT_ETH_USDT(Constants.Topic.PUBLIC_TRADE_ETHUSDT_ETH_USDT),
    // Spread tickers
    TICKERS_BTCUSDT_BTC_USDT(Constants.Topic.TICKERS_BTCUSDT_BTC_USDT),
    TICKERS_ETHUSDT_ETH_USDT(Constants.Topic.TICKERS_ETHUSDT_ETH_USDT);

    private final String topic;

    Topic(final String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return topic;
    }
}
