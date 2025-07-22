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

package com.github.akarazhev.jcryptolib.bybit.config;

final class Constants {
    private Constants() {
        throw new UnsupportedOperationException();
    }

    final static class Config {
        private Config() {
            throw new UnsupportedOperationException();
        }

        static final String CONNECT_TIMEOUT_MS = "bybit.connect.timeout.ms";
        static final String INITIAL_RECONNECT_INTERVAL_MS = "bybit.initial.reconnect.interval.ms";
        static final String MAX_RECONNECT_INTERVAL_MS = "bybit.max.reconnect.interval.ms";
        static final String PING_INTERVAL_MS = "bybit.ping.interval.ms";
        static final String FETCH_INTERVAL_MS = "bybit.fetch.interval.ms";
        static final String BACKOFF_MULTIPLIER = "bybit.backoff.multiplier";
        static final String MAX_RECONNECT_ATTEMPTS = "bybit.max.reconnect.attempts";
        static final String API_KEY = "bybit.api.key";
        static final String API_SECRET = "bybit.api.secret";
    }

    final static class LaunchPad {
        private LaunchPad() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Launchpad";
        static final String CURRENT_LIST = "https://www.bybit.com/x-api/spot/api/activity/v2/project/ongoing/list";
        static final String PAST_LIST = "https://www.bybit.com/x-api/spot/api/activity/v2/project/finished/list";
    }

    final static class MegaDrop {
        private MegaDrop() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Mega Drop";
        static final String CURRENT_LIST = "https://www.bybit.com/x-api/spot/api/megadrop/v1/prizePool/tokenList";
    }

    final static class LaunchPool {
        private LaunchPool() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Launch Pool";
        static final String CURRENT_LIST = "https://www.bybit.com/x-api/spot/api/launchpool/v1/home";
        static final String PAST_LIST = "https://www.bybit.com/x-api/spot/api/launchpool/v1/history";
    }

    final static class ByVotes {
        private ByVotes() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "ByVotes";
        static final String CURRENT_LIST = "https://www.bybit.com/x-api/spot/api/vote/v2/projectList";
    }

    final static class ByStarter {
        private ByStarter() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "ByStarter";
        static final String PROJECT_URL = "https://www.bybit.com/x-api/spot/api/by-starter/v1/bystarter/overview";
        static final String CURRENT_LIST = "https://www.bybit.com/x-api/spot/api/by-starter/v3/project/current";
        static final String PAST_LIST = "https://www.bybit.com/x-api/spot/api/by-starter/v2/project/previously";
    }

    final static class AirdropHunt {
        private AirdropHunt() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Airdrop Hunt";
        static final String PROJECT_URL = "https://www.bybit.com/x-api/spot/api/airdrop-splash/v1/project/home";
        static final String CURRENT_LIST = "https://www.bybit.com/x-api/spot/api/airdrop-splash/v1/project/list?requestCategory=0";
        static final String PAST_LIST = "https://www.bybit.com/x-api/spot/api/airdrop-splash/v1/project/list?requestCategory=2";
    }

    final static class Announcements {
        private Announcements() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Announcements";
        static final String URL = "https://api.bybit.com/v5/announcements/index";
    }

    final static class PublicTestnetSpot {
        private PublicTestnetSpot() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Public Testnet Spot";
        static final String URL = "wss://stream-testnet.bybit.com/v5/public/spot";
    }

    final static class PublicTestnetLinear {
        private PublicTestnetLinear() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Public Testnet Linear";
        static final String URL = "wss://stream-testnet.bybit.com/v5/public/linear";
    }

    final static class PublicTestnetInverse {
        private PublicTestnetInverse() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Public Testnet Inverse";
        static final String URL = "wss://stream-testnet.bybit.com/v5/public/inverse";
    }

    final static class PublicTestnetOption {
        private PublicTestnetOption() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Public Testnet Option";
        static final String URL = "wss://stream-testnet.bybit.com/v5/public/option";
    }

    final static class PublicTestnetSpread {
        private PublicTestnetSpread() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Public Testnet Spread";
        static final String URL = "wss://stream-testnet.bybit.com/v5/public/spread";
    }

    final static class PrivateTestnet {
        private PrivateTestnet() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Private Testnet";
        static final String URL = "wss://stream-testnet.bybit.com/v5/private";
    }

    final static class TestnetOrder {
        private TestnetOrder() {
            throw new UnsupportedOperationException();
        }

        static final String TYPE = "Testnet Order";
        static final String URL = "wss://stream-testnet.bybit.com/v5/trade";
    }

    final static class Topic {
        private Topic() {
            throw new UnsupportedOperationException();
        }

        static final String ORDER_BOOK_1_BTC_USDT = "orderbook.1.BTCUSDT";
        static final String PUBLIC_TRADE_BTC_USDT = "publicTrade.BTCUSDT";
        static final String TICKERS_BTC_USDT = "tickers.BTCUSDT";
        static final String KLINE_1_BTC_USDT = "kline.1.BTCUSDT";
        static final String ALL_LIQUIDATION_BTC_USDT = "allLiquidation.BTCUSDT";
        static final String INSURANCE_USDT = "insurance.USDT";
        static final String ORDER = "order";
        static final String ORDER_BOOK_25_SOL_USDT = "orderbook.25.SOLUSDT_SOL/USDT";
        static final String PUBLIC_TRADE_SOL_USDT = "publicTrade.SOLUSDT_SOL/USDT";
        static final String TICKERS_SOL_USDT = "tickers.SOLUSDT_SOL/USDT";
        static final String KLINE_LT_5_EOS3L_USDT = "kline_lt.5.EOS3LUSDT";
        static final String TICKERS_LT_EOS3L_USDT = "tickers_lt.EOS3LUSDT";
        static final String LT_EOS3L_USDT = "lt.EOS3LUSDT";
    }

    final static class Key {
        private Key() {
            throw new UnsupportedOperationException();
        }

        static final String TAG = "tag";
        static final String TYPE = "type";
        static final String LOCALE = "locale";
    }

    final static class Value {
        private Value() {
            throw new UnsupportedOperationException();
        }

        static final String NEW_CRYPTO = "new_crypto";
        static final String DE_LISTINGS = "delistings";
        static final String EN_US = "en-US";
    }
}
