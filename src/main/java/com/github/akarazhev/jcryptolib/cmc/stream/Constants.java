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
        static final int CONVERT_ID_VALUE = 2781;
    }

    final static class Request {
        private Request() {
            throw new UnsupportedOperationException();
        }

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
    }

    final static class Response {
        private Response() {
            throw new UnsupportedOperationException();
        }

        static final int STATUS_CODE_OK = 200;
        static final String DATA = "data";
        static final String STATUS = "status";
        static final String ERROR_CODE = "error_code";
        static final String ERROR_CODE_OK = "0";
        static final String ERROR_MESSAGE = "error_message";
        static final String ERROR_MESSAGE_SUCCESS = "SUCCESS";
    }
}
