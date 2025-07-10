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
    FGI("Fear and Greed Index", "https://api.coinmarketcap.com/data-api/v3/fear-greed/chart"),
    ASI("Altcoin Season Index", "https://api.coinmarketcap.com/data-api/v3/altcoin-season/chart"),
    BDN("Bitcoin Dominance Now", "https://api.coinmarketcap.com/data-api/v3/global-metrics/dominance/overview"),
    BDA("Bitcoin Dominance All", "https://api.coinmarketcap.com/data-api/v3/global-metrics/dominance/chart"),
    PMN("Puell Multiple Now", "https://api.coinmarketcap.com/data-api/v3/market-cycles/latest"),
    PMA("Puell Multiple All", "https://api.coinmarketcap.com/data-api/v3/market-cycles/puell-multiple"),
    IND("Indicators", "https://api.coinmarketcap.com/data-api/v3/market-cycles/indicators");

    private final String url;

    Type(final String type, final String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
