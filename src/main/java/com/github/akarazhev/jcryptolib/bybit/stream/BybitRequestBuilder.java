package com.github.akarazhev.jcryptolib.bybit.stream;

import com.github.akarazhev.jcryptolib.bybit.config.Type;

import java.net.URI;
import java.net.http.HttpRequest;

final class BybitRequestBuilder {

    public static HttpRequest buildMegaDropRequest() {
        return buildRequest(URI.create(Type.MD.getUrl()));
    }

    private static HttpRequest buildRequest(final URI uri) {
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
}
