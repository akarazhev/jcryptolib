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
    GM_API_PRO_L(Constants.GlobalMetrics.TYPE, Constants.GlobalMetrics.URL_API_PRO_L),
    FG(Constants.FearAndGreed.TYPE, Constants.FearAndGreed.URL),
    FG_API_PRO_L(Constants.FearAndGreed.TYPE, Constants.FearAndGreed.URL_API_PRO_L),
    FG_API_PRO_H(Constants.FearAndGreed.TYPE, Constants.FearAndGreed.URL_API_PRO_H),
    AS(Constants.AltcoinSeason.TYPE, Constants.AltcoinSeason.URL),
    BDO(Constants.BitcoinDominanceOverview.TYPE, Constants.BitcoinDominanceOverview.URL),
    BD(Constants.BitcoinDominance.TYPE, Constants.BitcoinDominance.URL),
    MCL(Constants.MarketCycleLatest.TYPE, Constants.MarketCycleLatest.URL),
    PM(Constants.PuellMultiple.TYPE, Constants.PuellMultiple.URL),
    IND(Constants.Indicators.TYPE, Constants.Indicators.URL),
    CMC(Constants.CryptoMarketCap.TYPE, Constants.CryptoMarketCap.URL),
    ETF_NF(Constants.CryptoEFTsNetFlow.TYPE, Constants.CryptoEFTsNetFlow.URL),
    PCT(Constants.PiCycleTop.TYPE, Constants.PiCycleTop.URL),
    BRP(Constants.BitcoinRainbowPrice.TYPE, Constants.BitcoinRainbowPrice.URL),
    CMC100L(Constants.CoinMarketCap100Index.TYPE, Constants.CoinMarketCap100Index.URL_L),
    CMC100H(Constants.CoinMarketCap100Index.TYPE, Constants.CoinMarketCap100Index.URL_H),
    CMC100_API_PRO_L(Constants.CoinMarketCap100Index.TYPE, Constants.CoinMarketCap100Index.URL_API_PRO_L),
    CMC100_API_PRO_H(Constants.CoinMarketCap100Index.TYPE, Constants.CoinMarketCap100Index.URL_API_PRO_H),
    CSV(Constants.CryptoSpotVolume.TYPE, Constants.CryptoSpotVolume.URL),
    OIO(Constants.OpenInterestOverview.TYPE, Constants.OpenInterestOverview.URL),
    OI(Constants.OpenInterest.TYPE, Constants.OpenInterest.URL),
    DV(Constants.DerivativesVolume.TYPE, Constants.DerivativesVolume.URL),
    FR(Constants.FundingRates.TYPE, Constants.FundingRates.URL),
    VIV(Constants.VolmexImpliedVolatility.TYPE, Constants.VolmexImpliedVolatility.URL);

    private final String type;
    private final String url;

    Type(final String type, final String url) {
        this.type = type;
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }
}
