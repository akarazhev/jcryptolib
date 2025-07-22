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
    LPD(Constants.LaunchPad.TYPE, new String[]{Constants.LaunchPad.CURRENT_LIST, Constants.LaunchPad.PAST_LIST}),
    MD(Constants.MegaDrop.TYPE, new String[]{Constants.MegaDrop.CURRENT_LIST}),
    LPL(Constants.LaunchPool.TYPE, new String[]{Constants.LaunchPool.CURRENT_LIST, Constants.LaunchPool.PAST_LIST}),
    BYV(Constants.ByVotes.TYPE, new String[]{Constants.ByVotes.CURRENT_LIST}),
    BYS(Constants.ByStarter.TYPE, new String[]{Constants.ByStarter.PROJECT_URL, Constants.ByStarter.CURRENT_LIST}),
    BYS_PAST(Constants.ByStarter.TYPE, new String[]{Constants.ByStarter.PROJECT_URL, Constants.ByStarter.PAST_LIST}),
    ADH(Constants.AirdropHunt.TYPE, new String[]{Constants.AirdropHunt.PROJECT_URL, Constants.AirdropHunt.CURRENT_LIST}),
    ADH_PAST(Constants.AirdropHunt.TYPE, new String[]{Constants.AirdropHunt.PROJECT_URL, Constants.AirdropHunt.PAST_LIST});

    private final String[] urls;

    Type(final String type, final String[] urls) {
        this.urls = urls;
    }

    public String[] getUrls() {
        return urls;
    }
}
