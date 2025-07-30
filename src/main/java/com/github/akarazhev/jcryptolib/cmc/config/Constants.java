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

final class Constants {
    private Constants() {
        throw new UnsupportedOperationException();
    }

    final static class Config {
        private Config() {
            throw new UnsupportedOperationException();
        }

        static final String CONNECT_TIMEOUT_MS = "cmc.connect.timeout.ms";
        static final String FETCH_INTERVAL_MS = "cmc.fetch.interval.ms";
        static final String API_KEY = "cmc.api.key";
    }

    final static class Range {
        private Range() {
            throw new UnsupportedOperationException();
        }

        static final String HOURS_24 = "24h";
        static final String DAYS_30 = "30d";
    }

    final static class GlobalMetrics {
        private GlobalMetrics() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Global Metrics";
        static final String URL = "https://pro-api.coinmarketcap.com/v1/global-metrics/quotes/latest";
    }

    final static class FearAndGreed {
        private FearAndGreed() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Fear and Greed";
        static final String URL = "https://api.coinmarketcap.com/data-api/v3/fear-greed/chart";
        static final String URL_API_PRO_L = "https://pro-api.coinmarketcap.com/v3/fear-and-greed/latest";
        static final String URL_API_PRO_H = "https://pro-api.coinmarketcap.com/v3/fear-and-greed/historical";
    }

    final static class AltcoinSeason {
        private AltcoinSeason() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Altcoin Season";
        static final String URL = "https://api.coinmarketcap.com/data-api/v3/altcoin-season/chart";
    }

    final static class BitcoinDominanceOverview {
        private BitcoinDominanceOverview() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Bitcoin Dominance Overview";
        static final String URL = "https://api.coinmarketcap.com/data-api/v3/global-metrics/dominance/overview";
    }

    final static class BitcoinDominance {
        private BitcoinDominance() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Bitcoin Dominance";
        static final String URL = "https://api.coinmarketcap.com/data-api/v3/global-metrics/dominance/chart";
    }

    final static class MarketCycleLatest {
        private MarketCycleLatest() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Market Cycle Latest";
        static final String URL = "https://api.coinmarketcap.com/data-api/v3/market-cycles/latest";
    }

    final static class PuellMultiple {
        private PuellMultiple() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Puell Multiple";
        static final String URL = "https://api.coinmarketcap.com/data-api/v3/market-cycles/puell-multiple";
    }

    final static class Indicators {
        private Indicators() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Indicators";
        static final String URL = "https://api.coinmarketcap.com/data-api/v3/market-cycles/indicators";
    }

    final static class CryptoMarketCap {
        private CryptoMarketCap() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Crypto Market Cap";
        static final String URL = "https://api.coinmarketcap.com/data-api/v4/global-metrics/quotes/historical";
    }

    final static class CryptoEFTsNetFlow {
        private CryptoEFTsNetFlow() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Crypto EFTs Net Flow";
        static final String URL = "https://api.coinmarketcap.com/data-api/v3/etf/overview/netflow/chart";
    }

    final static class PiCycleTop {
        private PiCycleTop() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Pi Cycle Top";
        static final String URL = "https://api.coinmarketcap.com/data-api/v3/market-cycles/pi-cycle-top";
    }

    final static class BitcoinRainbowPrice {
        private BitcoinRainbowPrice() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Bitcoin Rainbow Price";
        static final String URL = "https://api.coinmarketcap.com/data-api/v3/market-cycles/rainbow";
    }

    final static class CoinMarketCap100Index {
        private CoinMarketCap100Index() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "CoinMarketCap 100 Index";
        static final String URL_H = "https://api.coinmarketcap.com/data-api/v3/top100/historical/chart";
        static final String URL_API_PRO_L = "https://pro-api.coinmarketcap.com/v3/index/cmc100-latest";
        static final String URL_API_PRO_H = "https://pro-api.coinmarketcap.com/v3/index/cmc100-historical";
    }

    final static class CryptoSpotVolume {
        private CryptoSpotVolume() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Crypto Spot Volume";
        static final String URL = "https://api.coinmarketcap.com/data-api/v3/global-metrics/spot/chart";
    }

    final static class OpenInterestOverview {
        private OpenInterestOverview() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Open Interest Overview";
        static final String URL = "https://api.coinmarketcap.com/data-api/v4/open-interest/overview";
    }

    final static class OpenInterest {
        private OpenInterest() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Open Interest";
        static final String URL = "https://api.coinmarketcap.com/data-api/v4/open-interest/chart";
    }

    final static class DerivativesVolume {
        private DerivativesVolume() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Derivatives Volume";
        static final String URL = "https://api.coinmarketcap.com/data-api/v4/derivatives/chart";
    }

    final static class FundingRates {
        private FundingRates() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Funding Rates";
        static final String URL = "https://api.coinmarketcap.com/data-api/v3/funding-rate/chart";
    }

    final static class VolmexImpliedVolatility {
        private VolmexImpliedVolatility() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Volmex Implied Volatility";
        static final String URL = "https://api.coinmarketcap.com/data-api/v4/volmex-implied-volatility/chart";
    }
}
