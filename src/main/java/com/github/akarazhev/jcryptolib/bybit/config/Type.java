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

public enum Type {
    LPD(Constants.LaunchPad.TYPE, new String[]{Constants.LaunchPad.PROJECT_URL, Constants.LaunchPad.CURRENT_LIST_URL}),
    MD(Constants.MegaDrop.TYPE, new String[]{Constants.MegaDrop.CURRENT_LIST_URL}),
    LPL(Constants.LaunchPool.TYPE, new String[]{Constants.LaunchPool.PROJECT_URL, Constants.LaunchPool.CURRENT_LIST_URL}),
    BYV(Constants.ByVotes.TYPE, new String[]{Constants.ByVotes.CURRENT_LIST_URL}),
    BYVP(Constants.ByVotes.TYPE, new String[]{Constants.ByVotes.PAST_LIST_URL}),
    BYS(Constants.ByStarter.TYPE, new String[]{Constants.ByStarter.PROJECT_URL, Constants.ByStarter.CURRENT_LIST_URL}),
    BYSP(Constants.ByStarter.TYPE, new String[]{Constants.ByStarter.PROJECT_URL, Constants.ByStarter.PAST_LIST_URL}),
    ADH(Constants.AirdropHunt.TYPE, new String[]{Constants.AirdropHunt.PROJECT_URL, Constants.AirdropHunt.CURRENT_LIST_URL}),
    ADHP(Constants.AirdropHunt.TYPE, new String[]{Constants.AirdropHunt.PROJECT_URL, Constants.AirdropHunt.PAST_LIST_URL});

    private final String type;
    private final String[] urls;

    Type(final String type, final String[] urls) {
        this.type = type;
        this.urls = urls;
    }

    public String getType() {
        return type;
    }

    public String[] getUrls() {
        return urls;
    }
}
