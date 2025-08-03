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

package com.github.akarazhev.jcryptolib.cmc;

public final class Constants {
    private Constants() {
        throw new UnsupportedOperationException();
    }

    public static final class Response {
        private Response() {
            throw new UnsupportedOperationException();
        }

        public static final String DATA_LIST = "dataList";
        public static final String DIAL_CONFIG = "dialConfig";
        public static final String DIAL_CONFIGS = "dialConfigs";
        public static final String HISTORICAL_VALUES = "historicalValues";
        public static final String POINTS = "points";
        public static final String CONFIGS = "configs";
        public static final String DOMINANCE = "dominance";
        public static final String DOMINANCE_LAST_MONTH = "dominanceLastMonth";
        public static final String DOMINANCE_LAST_WEEK = "dominanceLastWeek";
        public static final String DOMINANCE_YEARLY_HIGH = "dominanceYearlyHigh";
        public static final String DOMINANCE_YEARLY_LOW = "dominanceYearlyLow";
        public static final String DOMINANCE_YESTERDAY = "dominanceYesterday";
        public static final String PUELL_MULTIPLE = "puellMultiple";
        public static final String PI_CYCLE_TOP = "piCycleTop";
        public static final String LIKELIHOOD = "likelihood";
        public static final String INDICATORS = "indicators";
        public static final String TOTAL_HIT_COUNT = "totalHitCount";
        public static final String TRIGGERED_COUNT = "triggeredCount";
        public static final String YEARLY_PERFORMANCE = "yearlyPerformance";
        public static final String THIRTY_DAYS_PERCENTAGE = "thirtyDaysPercentage";
        public static final String AGGREGATION = "aggregation";
        public static final String TOTAL = "total";
        public static final String TOTAL_BTC_VALUE = "totalBtcValue";
        public static final String TOTAL_ETH_VALUE = "totalEthValue";
        public static final String CONSTITUENTS = "constituents";
        public static final String VALUES = "values";
        public static final String OVER_VIEW = "overView";
        public static final String OVERVIEW = "overview";
        public static final String NOW = "now";
        public static final String YESTERDAY = "yesterday";
        public static final String LAST_WEEK = "lastWeek";
        public static final String LAST_MONTH = "lastMonth";
        public static final String YEARLY_HIGH = "yearlyHigh";
        public static final String YEARLY_LOW = "yearlyLow";
        public static final String COINS = "coins";
        public static final String VALUE = "value";
        public static final String UPDATE_TIME = "update_time";
        public static final String VALUE_CLASSIFICATION = "value_classification";
        public static final String BTC_DOMINANCE = "btc_dominance";
        public static final String ETH_DOMINANCE = "eth_dominance";
        public static final String ETH_DOMINANCE_YESTERDAY = "eth_dominance_yesterday";
        public static final String BTC_DOMINANCE_YESTERDAY = "btc_dominance_yesterday";
        public static final String ETH_DOMINANCE_24H_PERCENTAGE_CHANGE = "eth_dominance_24h_percentage_change";
        public static final String BTC_DOMINANCE_24H_PERCENTAGE_CHANGE = "btc_dominance_24h_percentage_change";
        public static final String DEFI_VOLUME_24H = "defi_volume_24h";
        public static final String DEFI_VOLUME_24H_REPORTED = "defi_volume_24h_reported";
        public static final String DEFI_MARKET_CAP = "defi_market_cap";
        public static final String DEFI_24H_PERCENTAGE_CHANGE = "defi_24h_percentage_change";
        public static final String STABLECOIN_VOLUME_24H = "stablecoin_volume_24h";
        public static final String STABLECOIN_VOLUME_24H_REPORTED = "stablecoin_volume_24h_reported";
        public static final String STABLECOIN_MARKET_CAP = "stablecoin_market_cap";
        public static final String STABLECOIN_24H_PERCENTAGE_CHANGE = "stablecoin_24h_percentage_change";
        public static final String DERIVATIVES_VOLUME_24H = "derivatives_volume_24h";
        public static final String DERIVATIVES_VOLUME_24H_REPORTED = "derivatives_volume_24h_reported";
        public static final String DERIVATIVES_24H_PERCENTAGE_CHANGE = "derivatives_24h_percentage_change";
        public static final String LAST_UPDATED = "last_updated";
        public static final String QUOTE = "quote";
        public static final String TOTAL_MARKET_CAP = "total_market_cap";
        public static final String TOTAL_MARKET_CAP_YESTERDAY = "total_market_cap_yesterday";
        public static final String TOTAL_MARKET_CAP_YESTERDAY_PERCENTAGE_CHANGE = "total_market_cap_yesterday_percentage_change";
        public static final String CMC_USD_ID = "2781";
        public static final String TOTAL_VOLUME_24H = "total_volume_24h";
        public static final String TOTAL_VOLUME_24H_REPORTED = "total_volume_24h_reported";
        public static final String TOTAL_VOLUME_24H_YESTERDAY = "total_volume_24h_yesterday";
        public static final String TOTAL_VOLUME_24H_YESTERDAY_PERCENTAGE_CHANGE = "total_volume_24h_yesterday_percentage_change";
        public static final String ALTCOIN_VOLUME_24H = "altcoin_volume_24h";
        public static final String ALTCOIN_VOLUME_24H_REPORTED = "altcoin_volume_24h_reported";
        public static final String ALTCOIN_MARKET_CAP = "altcoin_market_cap";
        public static final String ALTCOIN_MARKET_CAP2 = "altcoinMarketcap";
        public static final String VALUE_24H_PERCENTAGE_CHANGE = "value_24h_percentage_change";
        public static final String LAST_UPDATE = "last_update";
        public static final String NEXT_UPDATE = "next_update";
        public static final String WEIGHT = "weight";
        public static final String NAME = "name";
        public static final String SYMBOL = "symbol";
        public static final String URL = "url";
        public static final String TIMESTAMP = "timestamp";
        public static final String ALTCOIN_INDEX = "altcoinIndex";
        public static final String START = "start";
        public static final String END = "end";
        public static final String MC_CHANGE_PCT_30D = "mcChangePct30d";
        public static final String MC_PROPORTION = "mcProportion";
        public static final String ID = "id";
        public static final String CRYPTO_ID = "cryptoId";
        public static final String SLUG = "slug";
        public static final String SUMMARY_DATA = "summaryData";
        public static final String CURRENT_VALUE = "currentValue";
        public static final String PERCENT_CHANGE = "percentChange";
        public static final String HIGH = "high";
        public static final String HIGH_TIMESTAMP = "highTimestamp";
        public static final String LOW = "low";
        public static final String LOW_TIMESTAMP = "lowTimestamp";
        public static final String FUTURES = "futures";
        public static final String OPEN_INTEREST = "openInterest";
        public static final String CHG = "chg";
        public static final String PERPETUALS = "perpetuals";
        public static final String CEX = "cex";
        public static final String DEX = "dex";
        public static final String MARKET_CAP = "marketcap";
        public static final String PERCENTAGE = "percentage";
        public static final String COIN_ID = "coinId";
        public static final String COIN_NAME = "coinName";
        public static final String COIN_SLUG = "coinSlug";
        public static final String MARKET_FUNDING_RATE = "marketFundingRate";
        public static final String CRYPTO_FUNDING_RATE = "cryptoFundingRate";
        public static final String BITCOIN = "bitcoin";
        public static final String ETHEREUM = "ethereum";
        public static final String SCORE = "score";
        public static final String BTC_PRICE = "btcPrice";
        public static final String BTC_VOLUME = "btcVolume";
        public static final String INDICATOR_NAME = "indicatorName";
        public static final String TIME = "time";
        public static final String TARGET_VALUE = "targetValue";
        public static final String COMPARISON_TYPE = "comparisonType";
        public static final String PERCENT_CHANGE_24H = "percentChange24h";
        public static final String HIT_STATUS = "hitStatus";
        public static final String INDEX = "index";
        public static final String MA110 = "ma110";
        public static final String MA350MU2 = "ma350mu2";
        public static final String TOTAL_COUNT = "totalCount";
        public static final String HOLD_COUNT = "holdCount";
        public static final String SELL_COUNT = "sellCount";
        public static final String BTC_USD_PRICE = "btcUsdPrice";
    }
}
