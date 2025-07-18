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

package com.github.akarazhev.jcryptolib.cmc.config;

public enum Type {
    FG("Fear and Greed", "https://api.coinmarketcap.com/data-api/v3/fear-greed/chart"),
    AS("Altcoin Season", "https://api.coinmarketcap.com/data-api/v3/altcoin-season/chart"),
    BDO("Bitcoin Dominance Overview", "https://api.coinmarketcap.com/data-api/v3/global-metrics/dominance/overview"),
    BD("Bitcoin Dominance", "https://api.coinmarketcap.com/data-api/v3/global-metrics/dominance/chart"),
    MCL("Market Cycle Latest", "https://api.coinmarketcap.com/data-api/v3/market-cycles/latest"),
    PM("Puell Multiple", "https://api.coinmarketcap.com/data-api/v3/market-cycles/puell-multiple"),
    IND("Indicators", "https://api.coinmarketcap.com/data-api/v3/market-cycles/indicators"),
    CMC("Crypto Market Cap", "https://api.coinmarketcap.com/data-api/v4/global-metrics/quotes/historical"),
    ETF_NF("Crypto EFTs Net Flow", "https://api.coinmarketcap.com/data-api/v3/etf/overview/netflow/chart"),
    PCT("Pi Cycle Top", "https://api.coinmarketcap.com/data-api/v3/market-cycles/pi-cycle-top"),
    BRP("Bitcoin Rainbow Price", "https://api.coinmarketcap.com/data-api/v3/market-cycles/rainbow"),
    CMC100("CoinMarketCap 100 Index", "https://api.coinmarketcap.com/data-api/v3/top100/historical/chart"),
    CSV("Crypto Spot Volume", "https://api.coinmarketcap.com/data-api/v3/global-metrics/spot/chart"),
    OIO("Open Interest Overview", "https://api.coinmarketcap.com/data-api/v4/open-interest/overview"),
    OI("Open Interest", "https://api.coinmarketcap.com/data-api/v4/open-interest/chart"),
    DV("Derivatives Volume", "https://api.coinmarketcap.com/data-api/v4/derivatives/chart"),
    FR("Funding Rates", "https://api.coinmarketcap.com/data-api/v3/funding-rate/chart"),
    VIV("Volmex Implied Volatility", "https://api.coinmarketcap.com/data-api/v4/volmex-implied-volatility/chart");

    private final String url;

    Type(final String type, final String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
