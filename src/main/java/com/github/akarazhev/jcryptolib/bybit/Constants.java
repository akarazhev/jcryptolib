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

public final class Constants {
    private Constants() {
        throw new UnsupportedOperationException();
    }

    public static final String TOPIC_FIELD = "topic";

    public static final class Response {
        private Response() {
            throw new UnsupportedOperationException();
        }

        public static final String RESULT = "result";
        public static final String SUCCESS = "success";
        public static final String RET_CODE = "ret_code";
        public static final String ACTIVITY_ID = "activityId";
        public static final String TOKEN_NAME = "tokenName";
        public static final String TOKEN_ICON = "tokenIcon";
        public static final String TOKEN_INFO_LIST = "tokenInfoList";
        public static final String START_TIME = "startTime";
        public static final String END_TIME = "endTime";
        public static final String CLAIM_START_TIME = "claimStartTime";
        public static final String CLAIM_END_TIME = "claimEndTime";
        public static final String TOTAL_PRIZE_POOL = "totalPrizePool";
        public static final String ACTIVITY_STATUS = "activityStatus";
        public static final String USER_MAX_NUM = "userMaxNum";
        public static final String TOTAL_NUMBER_AWARDS = "totalNumberAwards";
        public static final String AWARD_INTERVAL = "awardInterval";
        public static final String MIN_REWARD_AMOUNT = "minRewardAmount";
    }
}
