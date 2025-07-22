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
                .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                .header("Accept-Language", "en-US,en;q=0.5")
                .header("Alt-Used", "www.bybit.com")
                .header("Priority", "u=0, i")
                .header("Referer", referer)
                .header("Origin", "https://www.bybit.com")
                .header("Sec-Fetch-Dest", "document")
                .header("Sec-Fetch-Mode", "navigate")
                .header("Sec-Fetch-Site", "none")
                .header("Sec-Fetch-User", "?1")
                .header("TE", "trailers")
                .header("Upgrade-Insecure-Requests", "1")
                .header("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:140.0) " +
                        "Gecko/20100101 Firefox/140.0")
                .GET()
                .build();
    }

    private static HttpRequest buildPostRequest(final URI uri, final String referer, final String body) {
        return HttpRequest.newBuilder()
                .uri(uri)
                .header("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:140.0) " +
                        "Gecko/20100101 Firefox/140.0")
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Language", "en")
                .header("Content-Type", "application/json")
                .header("lang", "en")
                .header("Sec-Fetch-Dest", "empty")
                .header("Sec-Fetch-Mode", "cors")
                .header("Sec-Fetch-Site", "same-origin")
                .header("Alt-Used", "www.bybit.com")
                .header("Referer", referer)
                .header("Origin", "https://www.bybit.com")
                .header("Priority", "u=1, i")
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();
    }
}
