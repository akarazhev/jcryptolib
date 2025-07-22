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
}
