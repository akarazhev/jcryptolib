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

package com.github.akarazhev.jcryptolib.cmc.stream;

final class Constants {
    private Constants() {
        throw new UnsupportedOperationException();
    }

    final static class CMC {
        private CMC() {
            throw new UnsupportedOperationException();
        }

        static final int FG_PERIOD_DAYS = 30;
        static final int AS_PERIOD_DAYS = 7;
        static final int USD_ID = 2781;
        static final int MAX_CMC_100_INDEX_ITEMS = 10;
        static final int MAX_FEAR_GREED_ITEMS = 500;
    }

    final static class Request {
        private Request() {
            throw new UnsupportedOperationException();
        }

        static final String CONVERT_ID_API = "convert_id";
        static final String CONVERT_ID = "convertId";
        static final String RANGE = "range";
        static final String START = "start";
        static final String END = "end";
        static final String CATEGORY = "category";
        static final String CATEGORY_ALL = "all";
        static final String SORT_BY = "sortBy";
        static final String SORT_BY_INDEX = "index";
        static final String SORT_TYPE = "sortType";
        static final String SORT_TYPE_ASC = "asc";
        static final String LIMIT = "limit";
        static final String INTERVAL = "interval";
        static final String DAILY = "daily";
        static final String TIME_END = "time_end";
        static final String COUNT = "count";
    }

    final static class Response {
        private Response() {
            throw new UnsupportedOperationException();
        }

        static final int STATUS_CODE_OK = 200;
        static final String DATA = "data";
        static final String STATUS = "status";
        static final String ERROR_CODE = "error_code";
        static final String ERROR_CODE_OK_STR = "0";
        static final int ERROR_CODE_OK_INT = 0;
        static final String ERROR_MESSAGE = "error_message";
        static final String ERROR_MESSAGE_SUCCESS = "SUCCESS";
        static final String ERROR_MESSAGE_EMPTY = "";
    }

    final static class GetRequestHeader {
        private GetRequestHeader() {
            throw new UnsupportedOperationException();
        }

        static final String X_CMC_PRO_API_KEY = "X-CMC_PRO_API_KEY";
        static final String ACCEPT = "Accept";
        static final String ACCEPT_VALUE = "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8";
        static final String ACCEPT_JSON_VALUE = "application/json";
        static final String ACCEPT_LANGUAGE = "Accept-Language";
        static final String ACCEPT_LANGUAGE_VALUE = "en-US,en;q=0.5";
        static final String CACHE_CONTROL = "Cache-Control";
        static final String CACHE_CONTROL_VALUE = "no-cache";
        static final String ORIGIN = "Origin";
        static final String ORIGIN_VALUE = "https://coinmarketcap.com/";
        static final String PLATFORM = "Platform";
        static final String PLATFORM_VALUE = "web";
        static final String PRIORITY = "Priority";
        static final String PRIORITY_VALUE = "u=0, i";
        static final String REFERER = "Referer";
        static final String REFERER_VALUE = "https://coinmarketcap.com/";
        static final String SEC_FETCH_DEST = "Sec-Fetch-Dest";
        static final String SEC_FETCH_DEST_VALUE = "document";
        static final String SEC_FETCH_MODE = "Sec-Fetch-Mode";
        static final String SEC_FETCH_MODE_VALUE = "navigate";
        static final String SEC_FETCH_SITE = "Sec-Fetch-Site";
        static final String SEC_FETCH_SITE_VALUE = "none";
        static final String SEC_FETCH_USER = "Sec-Fetch-User";
        static final String SEC_FETCH_USER_VALUE = "?1";
        static final String TE = "TE";
        static final String TE_VALUE = "trailers";
        static final String UPGRADE_INSECURE_REQUESTS = "Upgrade-Insecure-Requests";
        static final String UPGRADE_INSECURE_REQUESTS_VALUE = "1";
        static final String USER_AGENT = "User-Agent";
        static final String USER_AGENT_VALUE = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:140.0) " +
                "Gecko/20100101 Firefox/140.0";
        static final String X_REQUEST_ID = "x-request-id";
    }
}
