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

    public static final class CMC {
        public static final int FG_START_DATE = 1367193600;
        public static final int FG_PERIOD_DAYS = 7;
        public static final int AS_PERIOD_DAYS = 7;
        public static final int CONVERT_ID = 2781;
    }

    public static final class Response {
        public static final String DATA = "data";
        public static final String STATUS = "status";
        public static final String ERROR_CODE = "error_code";
        public static final String ERROR_CODE_OK = "0";
        public static final String ERROR_MESSAGE = "error_message";
        public static final String ERROR_MESSAGE_SUCCESS = "SUCCESS";
        public static final String DATA_LIST = "dataList";
        public static final String DIAL_CONFIG = "dialConfig";
        public static final String HISTORICAL_VALUES = "historicalValues";
        public static final String POINTS = "points";
        public static final String DIAL_CONFIGS = "dialConfigs";
        public static final String TOP_CRYPTOS = "topCryptos";
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
    }
}
