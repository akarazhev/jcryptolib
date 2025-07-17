package com.github.akarazhev.jcryptolib.bybit.stream;

import com.github.akarazhev.jcryptolib.bybit.config.Type;
import com.github.akarazhev.jcryptolib.util.JsonUtils;

import java.net.URI;
import java.net.http.HttpRequest;
import java.util.HashMap;

import static com.github.akarazhev.jcryptolib.bybit.Constants.Request.CURRENT;
import static com.github.akarazhev.jcryptolib.bybit.Constants.Request.PAGE_SIZE;

final class BybitRequestBuilder {

    public static HttpRequest buildMegaDropRequest() {
        return buildGetRequest(URI.create(Type.MD.getUrl()));
    }

    public static HttpRequest buildLaunchPoolPageRequest() {
        return buildGetRequest(URI.create(Type.LPL.getUrl()));
    }

    public static HttpRequest buildLaunchPoolPageRequest(final int size) {
        final var body = new HashMap<String, Object>();
        body.put(PAGE_SIZE, size);
        body.put(CURRENT, 1);
        return buildPostRequest(URI.create("https://www.bybit.com/x-api/spot/api/launchpool/v1/history"),
                JsonUtils.mapToJson(body));
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

    private static HttpRequest buildPostRequest(final URI uri, final String body) {
//        final var cookie = "_by_l_g_d=377c94b9-e6e4-a6c5-d7d5-21b01965c693; deviceId=9e9dcd95-59c3-e74f-78a1-103fe32268c6; _gcl_au=1.1.1936238975.1749464337; _ga=GA1.1.587500126.1749464337; _fbp=fb.1.1749464337562.831339531793144457; _tt_enable_cookie=1; _ttp=01JXA36K8NFNH7G6PYE69Y6HVF_.tt.1; _fwb=210sBDE7S3Kd5r3BFyn5N2Q.1749470314445; cto_bundle=A3qCdl9Ga2s2ckttZHN4TW5DQ2ZNZXVNcm5QZFVDTHFCNEFwdjhqcjFDNTBFQ2FVVHJocSUyQlZXU2hXaUVtY0ppSERnWjR6cHVZMjFZWWNWcWVsR1hxU2psVFpLUDhhcEd5NWJ5SnQ5c2swbDd0dmxzNXZOa1VBT0RwY0l4Smc1NENuUWNmWjJSUGJOdGk1dFVZalllVENRWGpFenhOa1glMkJzejJmaGc2aG8lMkJlNFFYQlJXUkpwT3hRZngweXluaiUyQjFRdU1OYVhDR3ZwZSUyQkNDbCUyRno0bHllY1IlMkI5bG5jendCJTJGelZBJTJCOGdFcThURlRFUDhKbGN2UCUyRjJUazhLa1hSTEZSalA3V08; sensorsdata2015jssdkchannel=%7B%22prop%22%3A%7B%22_sa_channel_landing_url%22%3A%22%22%7D%7D; sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%2219754332daa311-0d943129c9eba2-18525636-2073600-19754332dabc21%22%2C%22first_id%22%3A%22%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E7%9B%B4%E6%8E%A5%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC_%E7%9B%B4%E6%8E%A5%E6%89%93%E5%BC%80%22%2C%22%24latest_referrer%22%3A%22%22%2C%22_a_u_v%22%3A%220.0.6%22%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTk3NTQzMzJkYWEzMTEtMGQ5NDMxMjljOWViYTItMTg1MjU2MzYtMjA3MzYwMC0xOTc1NDMzMmRhYmMyMSJ9%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%22%2C%22value%22%3A%22%22%7D%7D; cookies_uuid_report=57b6c21a-3946-4515-9e72-8bf9dde3dcfe; first_collect=true; BYBIT_REG_REF_prod={\"lang\":\"en-US\",\"g\":\"377c94b9-e6e4-a6c5-d7d5-21b01965c693\",\"referrer\":\"www.bybit.com/\",\"source\":\"bybit.com\",\"medium\":\"other\",\"url\":\"https://www.bybit.com/en/\",\"last_refresh_time\":\"Thu, 17 Jul 2025 09:22:15 GMT\",\"ext_json\":{\"dtpid\":null}}; tx_token_current=BNE; by_token_print=02a4a04705m0z6bsm5ad0xe7482ad8a03; deviceCodeExpire=1752744151914; tx_token_time=1752755466100; trace_id_time=1752755466223; bm_mi=2B68E11E82B5E1040A74E3AA4A93CF34~YAAQFQxAFxgKLfeXAQAA4vrTGRyBxfxMkBWMqe53iIa6FQnGmYeXxZ/TmTj0IksuEHxX7xl8AR53o9AEi3QSAtfbNfuoFiYQgHGxpmlCFYjswD6e4MkWD/yKi89gJi5eVKLADv7cdmA50F79rGWIymKD/xev9WxlBy01/IAyzJHKji/3hgGwOX0Qy8kbthDAope1nJYeWjLjuOu9iVOA75NmvROu0MjC11xdxLuITQ4/97JD3ANHiCrvJLHLWm+YAuSlhHut/OvnoFGpf1UXFO7jYprMAfbG/NdwVbGqTtvaRHWXDibZoATUgl7NMMBAtfOzTHcD1CUMk2BuD0EyPulY/rk=~1; bm_sz=DD017FA45935D96899B102EE117E28C9~YAAQFQxAFxoKLfeXAQAA4vrTGRxF00QX6+Pch4yS+l8nb0lJlS8DRUN1YkBD9gzKHnwIZSf+J7M/7nstP7rOruk9/FkLkZnYTSqDwm2GZZBGtUiQd7B3ITNmNMNhukkg7ztwQRyqm77PDt961tmGjGKgEFcmEKbCa4DVp1RVwYaP1iT3EkvYZo8ABf6Jh9olTfGJVIDSfQIz3XkMS8smKExQO0xGDF3/MRl1RDbeplVIoJPbSXg5J7ynbjdEp19o91BS8QdNJHn9+itNSIhJTNreWCr9WiDY8VH4HfrP0OLtdKaRYAcrIiIl/7snd3cC5/aPR9p2aPjOmX+Vk4y86HbYnq0Z+i1B+UwMhNwBuZY5dv+g7Edh6StC+gxjvuUWM9XUrGMbBCmByoI=~4338486~4469043; _abck=2C70ED0C8A5431F82D7491567089DFE7~0~YAAQFQxAF04KLfeXAQAA9PvTGQ5WleCbTgR/XAFXgLJ3EIncizppBANFyrOgDvldUlTOos2UDBZUBJMmU+EyQJ2FZ5LohdQw+G5rt9uzVnhs79JT8Xpbk5cTPFFndUO4L3lolve4d6jbAaivYlp5K/iY5l/LpLELTbr3zpi4wvM2+VEcWsVFDpF2kPyFLkb/lBFd61KMWP3EDLkhynarCBLVogP1x1lFyxn2Mb9xUiMgei1VLteWvc7x4m2f8gW1pz2h8hCtggBS6MsZHpq6fs9cgwzHJaB42XjCrFrfWAy9eHCKQ/9YEHY8VDrKf2Qb+SxvncVYLE1NGhcl01/XZhRAOK19f04c7LFjw1OGW4KPE8LYr3GyS+dgfWIiaXyT8knkrPsQ+7tHz+Uduy0EjGWviuKhKU2ATrraeoMgp+GBd929x+jThHvQUqSSq18ubgbcPNn/DZipNiv1iHJVfNvQGZNfFSo0hn51NQzgXV8VtaV8Du6u3Ngj5izfFv7E3tKsBbaFDSfavvIS39MBQll9qBREnlYSw5RghAxq0HEJx7YpIaN3EbmMpP6evD6s4TpSBhq4zIRmxBF9y8t6DOoHnQop0mhFwpSvgA9OWbD0xWnWPZj0ad9IjHXxwyEE8tZuAuUa2Cjh11i853CZR4kdBI1XNtTT~-1~-1~-1; ak_bmsc=9E9AEAEE48DA06CAA6A1496D6B04D180~000000000000000000000000000000~YAAQFQxAF+8KLfeXAQAAZf/TGRxetmAVgbk9zI/uoewZJgeddoe4OKZTrFWC1EYDA0xAfN3S3xtY7SfAQE+U8+To6XN0Dly3WLC/sFRdthuwgf68G4dCZBLxzT49D8/1u3QZRUBIRr2nvLk46yVbKVbS6jSxKGmtTt3OOu0++2lwx0S1YEDn9uKY1T79gDd1QxhCJzuwrAJR99EFj4hiyRMdYrvzLGsre05qYxtXfA/K9bZ7wKnXvNaLQ1HaN3Y+oUER3z0i0HPZ8c1AFq/aNgfHsbqITqBxvgdHW2SmWuY0dV9wq3+EXneToQOSiZ+M+iOAhM6XY5kOludljX7j3cWjjcqv2fAt6bUorm8CjexTN87vOtmKPa2uYp47bp3QZwCHuwi+ZCggOYRAyba2C+2f6KOC0VC1EKBQQHNKvtS4TAQy3n6m78PlF0DGP7h0ucqXqmIZ8xSthbm6o15a36jzEb83C5Tq4DksDUCmsD8A/pr27Z4rLrY=; __rtbh.uid=%7B%22eventType%22%3A%22uid%22%2C%22id%22%3A%22undefined%22%2C%22expiryDate%22%3A%222026-07-17T19%3A19%3A47.127Z%22%7D; __rtbh.lid=%7B%22eventType%22%3A%22lid%22%2C%22id%22%3A%22GZGhc90xFQ3VJ0YvP269%22%2C%22expiryDate%22%3A%222026-07-17T19%3A19%3A47.127Z%22%7D; _ga_SPS4ND2MGC=GS2.1.s1752779979$o10$g1$t1752779987$j52$l0$h0; MgidSensorNVis=5; MgidSensorHref=https://www.bybit.com/en/trade/spot/launchpool; wcs_bt=135fb0af9baad90:1752779987|17470ac91156420:1752744136; ttcsid=1752779987324::m_Cm07XlD3vANUuFTTwC.9.1752779987324; _rdt_uuid=1752321283033.76299c6d-d736-4460-806f-7fb9e09b3a18; ttcsid_CMEEMQRC77UBHLCRLFPG=1752779987323::LHK_3-pqQHuNCbLMpZhC.9.1752779987544; bm_sv=3195184B97454256A8C733C19CF323E7~YAAQFQxAF/sbLfeXAQAAF3HUGRxhVEEc4bJlp83hx/HazJBYHzSpIQm+6bdduOoUksyf90VTS6c+7Z8dbAvaQjoeyzx8h3XkNRax4BmdkGqM/IR32Nj7Wm2z2F1kjy5nAVz2rq4S8+1yF95NhRfYswpoWLk03ZxcEDdpKbygUPcy+UDPscbgeXEt4mDXW45TPVMwkDoA16pniG7MU4I8Q4xSG8SJJ6MG6ECq5vKWqx05jqdUfdTWAUtGArnCKUK+~1";
        return HttpRequest.newBuilder()
                .uri(uri)
                .header("accept", "application/json, text/plain, */*")
                .header("accept-language", "en")
                .header("content-type", "application/json")
//                .header("cookie", cookie)
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
//                .header("traceparent", "00-2e9e590fa09c942ac5acfe88d61c3d0c-8add70d2467776d9-01")
                .header("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 " +
                        "(KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36")
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();
    }
}
