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

    public static final class Request {
        private Request() {
            throw new UnsupportedOperationException();
        }

        public static final String PAGE_SIZE = "pageSize";
        public static final String CURRENT = "current";
        public static final String TYPE = "type";
        public static final String REFERER_LPL = "https://www.bybit.com/en/trade/spot/launchpool";
        public static final String REFERER_LPD = "https://www.bybit.com/en/trade/spot/launchpad";
        public static final String REFERER_MD = "https://www.bybit.com/en/trade/spot/megadrop";
        public static final String REFERER_BYV = "https://www.bybit.com/en/trade/spot/vote-home";
        public static final int BYV_TYPE_ALL = 0;
    }

    public static final class Response {
        private Response() {
            throw new UnsupportedOperationException();
        }

        public static final String RESULT = "result";
        public static final String SUCCESS = "success";
        public static final String RET_CODE = "ret_code";
        public static final String TOKEN_NAME = "tokenName";
        public static final String TOKEN_ICON = "tokenIcon";
        public static final String START_TIME = "startTime";
        public static final String END_TIME = "endTime";
        public static final String CLAIM_START_TIME = "claimStartTime";
        public static final String CLAIM_END_TIME = "claimEndTime";
        public static final String LIST = "list";
        public static final String RET_CODE_CAMEL_CASE = "retCode";
        public static final String RET_MSG = "retMsg";
        public static final String OK = "OK";
        public static final String TOTAL_PROJECTS = "totalProjects";
        public static final String RETURN_COIN = "returnCoin";
        public static final String RETURN_COIN_ICON = "returnCoinIcon";
        public static final String DESC = "desc";
        public static final String WEBSITE = "website";
        public static final String WHITE_PAPER = "whitepaper";
        public static final String RULES = "rules";
        public static final String STAKE_BEGIN_TIME = "stakeBeginTime";
        public static final String STAKE_END_TIME = "stakeEndTime";
        public static final String TRADE_BEGIN_TIME = "tradeBeginTime";
        public static final String STAKE_POOL_LIST = "stakePoolList";
        public static final String NAME = "name";
        public static final String TITLE = "title";
        public static final String ICON = "icon";
        public static final String SNAPSHOT_START_TIME = "snapshotStartTime";
        public static final String SNAPSHOT_END_TIME = "snapshotEndTime";
        public static final String ALLOCATION_START_TIME = "allocationStartTime";
        public static final String ALLOCATION_END_TIME = "allocationEndTime";
        public static final String PROJECT_START_TIME = "projectStartTime";
        public static final String COIN = "coin";
        public static final String VOTE_START_TIME = "voteStartTime";
        public static final String VOTE_END_TIME = "voteEndTime";
        public static final String REWARD_START_TIME = "rewardStartTime";
        public static final String REWARD_END_TIME = "rewardEndTime";
        public static final String INTRODUCE_CONTENT = "introduceContent";
    }
}
