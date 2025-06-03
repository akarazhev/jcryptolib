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
    // public topics
    private static final String[] PUBLIC_ORDER_BOOK_25_SOLUSDT = new String[]{"orderbook.25.SOLUSDT_SOL/USDT"};
    private static final String[] PUBLIC_TRADE_SOLUSDT = new String[]{"publicTrade.SOLUSDT_SOL/USDT"};
    private static final String[] PUBLIC_TICKERS_SOLUSDT = new String[]{"tickers.SOLUSDT_SOL/USDT"};
    private static final String[] PUBLIC_ORDER_BOOK_1_BTCUSDT = new String[]{"orderbook.1.BTCUSDT"};
    private static final String[] PUBLIC_TRADE_BTCUSDT = new String[]{"publicTrade.BTCUSDT"};
    private static final String[] PUBLIC_TICKERS_BTCUSDT = new String[]{"tickers.BTCUSDT"};
    private static final String[] PUBLIC_KLINE_BTCUSDT = new String[]{"kline.1.BTCUSDT"};
    private static final String[] PUBLIC_ALL_LIQUIDATION_BTCUSDT = new String[]{"allLiquidation.BTCUSDT"};
    private static final String[] PUBLIC_INSURANCE_POOL_USDT = new String[]{"insurance.USDT"};
    private static final String[] PUBLIC_KLINE_LT_5_EOS3LUSDT = new String[]{"kline_lt.5.EOS3LUSDT"};
    private static final String[] PUBLIC_TICKERS_LT_EOS3LUSDT = new String[]{"tickers_lt.EOS3LUSDT"};
    private static final String[] PUBLIC_LT_EOS3LUSDT = new String[]{"lt.EOS3LUSDT"};
    // private topics
    private static final String[] PRIVATE_ORDER = new String[]{"order"};

    /**
     * Returns an array of public order book level 25 topics for the SOLUSDT pair.
     *
     * @return an array of public order book level 25 topics for the SOLUSDT pair.
     */
    public static String[] getPublicOrderBook25SolUsdt() {
        return PUBLIC_ORDER_BOOK_25_SOLUSDT;
    }

    /**
     * Returns an array of public trade topics for the SOLUSDT pair.
     *
     * @return an array of public trade topics for the SOLUSDT pair.
     */
    public static String[] getPublicTradeSolUsdt() {
        return PUBLIC_TRADE_SOLUSDT;
    }

    /**
     * Returns an array of public ticker topics for the SOLUSDT pair.
     *
     * @return an array of public ticker topics for the SOLUSDT pair.
     */
    public static String[] getPublicTickersSolUsdt() {
        return PUBLIC_TICKERS_SOLUSDT;
    }

    /**
     * Returns an array of public order book level 1 topics for the BTCUSDT pair.
     *
     * @return an array of public order book level 1 topics for the BTCUSDT pair.
     */
    public static String[] getPublicOrderBook1BtcUsdt() {
        return PUBLIC_ORDER_BOOK_1_BTCUSDT;
    }

    /**
     * Returns an array of public trade topics for the BTCUSDT pair.
     *
     * @return an array of public trade topics for the BTCUSDT pair.
     */
    public static String[] getPublicTradeBtcUsdt() {
        return PUBLIC_TRADE_BTCUSDT;
    }

    /**
     * Returns an array of public ticker topics for the BTCUSDT pair.
     *
     * @return an array of public ticker topics for the BTCUSDT pair.
     */
    public static String[] getPublicTickersBtcUsdt() {
        return PUBLIC_TICKERS_BTCUSDT;
    }

    /**
     * Returns an array of public kline topics for the BTCUSDT pair.
     *
     * @return an array of public kline topics for the BTCUSDT pair.
     */
    public static String[] getPublicKlineBtcUsdt() {
        return PUBLIC_KLINE_BTCUSDT;
    }

    /**
     * Returns an array of public all liquidation topics for the BTCUSDT pair.
     *
     * @return an array of public all liquidation topics for the BTCUSDT pair.
     */
    public static String[] getPublicAllLiquidationBtcUsdt() {
        return PUBLIC_ALL_LIQUIDATION_BTCUSDT;
    }

    /**
     * Returns an array of public insurance pool topics for the USDT.
     *
     * @return an array of public insurance pool topics for the USDT.
     */
    public static String[] getPublicInsurancePoolUsdt() {
        return PUBLIC_INSURANCE_POOL_USDT;
    }

    /**
     * Returns an array of public kline topics for the EOS3LUSDT pair.
     *
     * @return an array of public kline topics for the EOS3LUSDT pair.
     */
    public static String[] getPublicKlineLt5Eos3lUsdt() {
        return PUBLIC_KLINE_LT_5_EOS3LUSDT;
    }

    /**
     * Returns an array of public ticker topics for the EOS3LUSDT pair.
     *
     * @return an array of public ticker topics for the EOS3LUSDT pair.
     */
    public static String[] getPublicTickersLtEos3lUsdt() {
        return PUBLIC_TICKERS_LT_EOS3LUSDT;
    }

    /**
     * Returns an array of public ticker topics for the EOS3LUSDT pair.
     *
     * @return an array of public ticker topics for the EOS3LUSDT pair.
     */
    public static String[] getPublicLtEos3lUsdt() {
        return PUBLIC_LT_EOS3LUSDT;
    }

    /**
     * Returns an array of private order topics.
     *
     * @return an array of private order topics.
     */
    public static String[] getPrivateOrder() {
        return PRIVATE_ORDER;
    }
}
