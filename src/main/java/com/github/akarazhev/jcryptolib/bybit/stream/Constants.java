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

package com.github.akarazhev.jcryptolib.bybit.stream;

final class Constants {
    private Constants() {
        throw new UnsupportedOperationException();
    }

    final static class Request {
        private Request() {
            throw new UnsupportedOperationException();
        }

        static final String PAGE = "page";
        static final String LIMIT = "limit";
        static final String PAGE_SIZE = "pageSize";
        static final String CURRENT = "current";
        static final String PAGE_NO = "pageNo";
        static final String TYPE = "type";
        static final String REFERER_LPL = "https://www.bybit.com/en/trade/spot/launchpool";
        static final String REFERER_LPD = "https://www.bybit.com/en/trade/spot/launchpad";
        static final String REFERER_MD = "https://www.bybit.com/en/trade/spot/megadrop";
        static final String REFERER_BYV = "https://www.bybit.com/en/trade/spot/vote-home";
        static final String REFERER_BYS = "https://www.bybit.com/en/bystarter";
        static final String REFERER_ADH = "https://www.bybit.com/en/trade/spot/airdrop-hunt";
        static final int BYV_TYPE_ALL = 0;
        static final String SUBSCRIBE = "subscribe";
        static final String PING = "ping";
        static final String AUTH = "auth";
    }

    final static class Response {
        private Response() {
            throw new UnsupportedOperationException();
        }

        static final int STATUS_CODE_OK = 200;
        static final String RESULT = "result";
        static final String SUCCESS = "success";
        static final String RET_CODE = "ret_code";
        static final String LIST = "list";
        static final String RET_CODE_CAMEL_CASE = "retCode";
        static final String RET_MSG = "retMsg";
        static final String RET_MSG2 = "ret_msg";
        static final String OK = "OK";
        static final String TOTAL_PROJECTS = "totalProjects";
        static final String PROJECTS = "projects";
        static final String JSON_OP_AUTH = "\"op\":\"auth\"";
        static final String JSON_OP_SUBSCRIBE = "\"op\":\"subscribe\"";
        static final String JSON_TYPE_COMMAND = "\"type\":\"COMMAND_RESP\"";
        static final String JSON_SUCCESS_TRUE = "\"success\":true";
        static final String JSON_OP_PONG = "\"op\":\"pong\"";
        static final String JSON_RET_MSG_PONG = "\"ret_msg\":\"pong\"";
    }

    final static class GetRequestHeader {
        private GetRequestHeader() {
            throw new UnsupportedOperationException();
        }

        static final String ACCEPT = "Accept";
        static final String ACCEPT_VALUE = "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8";
        static final String ACCEPT_LANGUAGE = "Accept-Language";
        static final String ACCEPT_LANGUAGE_VALUE = "en-US,en;q=0.5";
        static final String ALT_USED = "Alt-Used";
        static final String ALT_USED_VALUE = "www.bybit.com";
        static final String PRIORITY = "Priority";
        static final String PRIORITY_VALUE = "u=0, i";
        static final String REFERER = "Referer";
        static final String ORIGIN = "Origin";
        static final String ORIGIN_VALUE = "https://www.bybit.com";
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
    }

    final static class PostRequestHeader {
        private PostRequestHeader() {
            throw new UnsupportedOperationException();
        }

        static final String USER_AGENT = "User-Agent";
        static final String USER_AGENT_VALUE = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:140.0) " +
                "Gecko/20100101 Firefox/140.0";
        static final String ACCEPT = "Accept";
        static final String ACCEPT_VALUE = "application/json, text/plain, */*";
        static final String ACCEPT_LANGUAGE = "Accept-Language";
        static final String ACCEPT_LANGUAGE_VALUE = "en";
        static final String CONTENT_TYPE = "Content-Type";
        static final String CONTENT_TYPE_VALUE = "application/json";
        static final String LANG = "lang";
        static final String LANG_VALUE = "en";
        static final String SEC_FETCH_DEST = "Sec-Fetch-Dest";
        static final String SEC_FETCH_DEST_VALUE = "empty";
        static final String SEC_FETCH_MODE = "Sec-Fetch-Mode";
        static final String SEC_FETCH_MODE_VALUE = "cors";
        static final String SEC_FETCH_SITE = "Sec-Fetch-Site";
        static final String SEC_FETCH_SITE_VALUE = "same-origin";
        static final String ALT_USED = "Alt-Used";
        static final String ALT_USED_VALUE = "www.bybit.com";
        static final String REFERER = "Referer";
        static final String ORIGIN = "Origin";
        static final String ORIGIN_VALUE = "https://www.bybit.com";
        static final String PRIORITY = "Priority";
        static final String PRIORITY_VALUE = "u=1, i";
    }
}
