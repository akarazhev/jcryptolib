package com.github.akarazhev.jcryptolib.bybit.stream;

import com.github.akarazhev.jcryptolib.bybit.config.Type;
import com.github.akarazhev.jcryptolib.util.JsonUtils;

import java.net.URI;
import java.net.http.HttpRequest;
import java.util.Map;

import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Request.BYV_TYPE_ALL;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Request.CURRENT;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Request.PAGE_NO;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Request.PAGE_SIZE;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Request.REFERER_ADH;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Request.REFERER_BYS;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Request.REFERER_BYV;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Request.REFERER_LPD;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Request.REFERER_LPL;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Request.REFERER_MD;
import static com.github.akarazhev.jcryptolib.bybit.stream.Constants.Request.TYPE;

final class BybitRequestBuilder {

    public static HttpRequest buildLaunchPadRequest() {
        return buildGetRequest(URI.create(Type.LPD.getUrls()[0]), REFERER_LPD);
    }

    public static HttpRequest buildLaunchPadRequest(final int size) {
        String request = "?" + CURRENT + "=" + 1 + "&" + PAGE_SIZE + "=" + size;
        return buildGetRequest(URI.create(Type.LPD.getUrls()[1] + request), REFERER_LPD);
    }

    public static HttpRequest buildMegaDropRequest() {
        return buildGetRequest(URI.create(Type.MD.getUrls()[0]), REFERER_MD);
    }

    public static HttpRequest buildLaunchPoolRequest() {
        return buildGetRequest(URI.create(Type.LPL.getUrls()[0]), REFERER_LPL);
    }

    public static HttpRequest buildLaunchPoolRequest(final int size) {
        final var body = JsonUtils.mapToJson(Map.of(PAGE_SIZE, size, CURRENT, 1));
        return buildPostRequest(URI.create(Type.LPL.getUrls()[1]), REFERER_LPL, body);
    }

    public static HttpRequest buildByVotesRequest() {
        return buildGetRequest(URI.create(Type.BYV.getUrls()[0] + "?" + TYPE + "=" + BYV_TYPE_ALL), REFERER_BYV);
    }

    public static HttpRequest buildByStarterRequest() {
        return buildGetRequest(URI.create(Type.BYS.getUrls()[0]), REFERER_BYS);
    }

    public static HttpRequest buildAirdropHuntRequest() {
        return buildGetRequest(URI.create(Type.ADH.getUrls()[0]), REFERER_ADH);
    }

    public static HttpRequest buildAirdropHuntRequest(final Type type, final int size) {
        String request = "&" + PAGE_NO + "=" + 1 + "&" + PAGE_SIZE + "=" + size;
        return buildGetRequest(URI.create(type.getUrls()[1] + request), REFERER_ADH);
    }

    private static HttpRequest buildGetRequest(final URI uri, final String referer) {
        return HttpRequest.newBuilder()
                .uri(uri)
                .header(Constants.GetRequestHeader.ACCEPT,
                        Constants.GetRequestHeader.ACCEPT_VALUE)
                .header(Constants.GetRequestHeader.ACCEPT_LANGUAGE,
                        Constants.GetRequestHeader.ACCEPT_LANGUAGE_VALUE)
                .header(Constants.GetRequestHeader.ALT_USED,
                        Constants.GetRequestHeader.ALT_USED_VALUE)
                .header(Constants.GetRequestHeader.PRIORITY,
                        Constants.GetRequestHeader.PRIORITY_VALUE)
                .header(Constants.GetRequestHeader.REFERER, referer)
                .header(Constants.GetRequestHeader.ORIGIN,
                        Constants.GetRequestHeader.ORIGIN_VALUE)
                .header(Constants.GetRequestHeader.SEC_FETCH_DEST,
                        Constants.GetRequestHeader.SEC_FETCH_DEST_VALUE)
                .header(Constants.GetRequestHeader.SEC_FETCH_MODE,
                        Constants.GetRequestHeader.SEC_FETCH_MODE_VALUE)
                .header(Constants.GetRequestHeader.SEC_FETCH_SITE,
                        Constants.GetRequestHeader.SEC_FETCH_SITE_VALUE)
                .header(Constants.GetRequestHeader.SEC_FETCH_USER,
                        Constants.GetRequestHeader.SEC_FETCH_USER_VALUE)
                .header(Constants.GetRequestHeader.TE,
                        Constants.GetRequestHeader.TE_VALUE)
                .header(Constants.GetRequestHeader.UPGRADE_INSECURE_REQUESTS,
                        Constants.GetRequestHeader.UPGRADE_INSECURE_REQUESTS_VALUE)
                .header(Constants.GetRequestHeader.USER_AGENT,
                        Constants.GetRequestHeader.USER_AGENT_VALUE)
                .GET()
                .build();
    }

    private static HttpRequest buildPostRequest(final URI uri, final String referer, final String body) {
        return HttpRequest.newBuilder()
                .uri(uri)
                .header(Constants.PostRequestHeader.USER_AGENT,
                        Constants.PostRequestHeader.USER_AGENT_VALUE)
                .header(Constants.PostRequestHeader.ACCEPT,
                        Constants.PostRequestHeader.ACCEPT_VALUE)
                .header(Constants.PostRequestHeader.ACCEPT_LANGUAGE,
                        Constants.PostRequestHeader.ACCEPT_LANGUAGE_VALUE)
                .header(Constants.PostRequestHeader.CONTENT_TYPE,
                        Constants.PostRequestHeader.CONTENT_TYPE_VALUE)
                .header(Constants.PostRequestHeader.LANG,
                        Constants.PostRequestHeader.LANG_VALUE)
                .header(Constants.PostRequestHeader.SEC_FETCH_DEST,
                        Constants.PostRequestHeader.SEC_FETCH_DEST_VALUE)
                .header(Constants.PostRequestHeader.SEC_FETCH_MODE,
                        Constants.PostRequestHeader.SEC_FETCH_MODE_VALUE)
                .header(Constants.PostRequestHeader.SEC_FETCH_SITE,
                        Constants.PostRequestHeader.SEC_FETCH_SITE_VALUE)
                .header(Constants.PostRequestHeader.ALT_USED,
                        Constants.PostRequestHeader.ALT_USED_VALUE)
                .header(Constants.PostRequestHeader.REFERER, referer)
                .header(Constants.PostRequestHeader.ORIGIN,
                        Constants.PostRequestHeader.ORIGIN_VALUE)
                .header(Constants.PostRequestHeader.PRIORITY,
                        Constants.PostRequestHeader.PRIORITY_VALUE)
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();
    }
}
