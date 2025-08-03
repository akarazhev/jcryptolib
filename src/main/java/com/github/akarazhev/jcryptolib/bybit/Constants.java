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

        public static final String TOKEN_NAME = "tokenName";
        public static final String TOKEN_ICON = "tokenIcon";
        public static final String START_TIME = "startTime";
        public static final String END_TIME = "endTime";
        public static final String CLAIM_START_TIME = "claimStartTime";
        public static final String CLAIM_END_TIME = "claimEndTime";
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
        public static final String COIN_ICON = "coinIcon";
        public static final String COIN_NAME = "coinName";
        public static final String PROJECT_INTRO = "projectIntro";
        public static final String PERIOD_LIST = "periodList";
        public static final String SALE_START_TIME = "saleStartTime";
        public static final String SALE_END_TIME = "saleEndTime";
        public static final String PUBLISH_TIME = "publishTime";
        public static final String AIRDROP_END_TIME = "airdropEndTime";
        public static final String POOL_END = "poolEnd";
        public static final String POOL_START = "poolStart";
        public static final String TOKEN_ID = "tokenId";
    }
}
