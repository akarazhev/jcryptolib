package com.github.akarazhev.jcryptolib.bybit.stream;

import com.github.akarazhev.jcryptolib.bybit.config.Type;
import com.github.akarazhev.jcryptolib.util.JsonUtils;

import java.net.URI;
import java.net.http.HttpRequest;
import java.util.Map;

import static com.github.akarazhev.jcryptolib.bybit.Constants.Request.CURRENT;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Request.PAGE_SIZE;

final class BybitRequestBuilder {

    public static HttpRequest buildMegaDropRequest() {
        return buildGetRequest(URI.create(Type.MD.getUrls()[0]));
    }

    public static HttpRequest buildLaunchPoolPageRequest() {
        return buildGetRequest(URI.create(Type.LPL.getUrls()[0]));
    }

    public static HttpRequest buildLaunchPoolPageRequest(final int size) {
        final var body = JsonUtils.mapToJson(Map.of(PAGE_SIZE, size, CURRENT, 1));
        return buildPostRequest(URI.create(Type.LPL.getUrls()[1]), body);
    }

    private static HttpRequest buildGetRequest(final URI uri) {
        return HttpRequest.newBuilder()
                .uri(uri)
                .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                .header("Accept-Encoding", "gzip, deflate, br, zstd")
                .header("Accept-Language", "en-US,en;q=0.5")
                .header("Alt-Used", "www.bybit.com")
                .header("Priority", "u=0, i")
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

    private static HttpRequest buildPostRequest(final URI uri, final String body) { // todo: to review
        return HttpRequest.newBuilder()
                .uri(uri)
                .header("accept", "application/json, text/plain, */*")
                .header("accept-language", "en")
                .header("content-type", "application/json")
                .header("lang", "en")
                .header("origin", "https://www.bybit.com")
                .header("priority", "u=1, i")
                .header("referer", "https://www.bybit.com/en/trade/spot/launchpool")
                .header("sec-ch-ua", "\"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"138\", \"Google Chrome\";v=\"138\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"macOS\"")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "same-origin")
                .header("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 " +
                        "(KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36")
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();
    }
}
