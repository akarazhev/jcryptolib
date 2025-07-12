# Bybit API

This is a collection of Bybit API that are used to fetch data. 

## Megadrop

Buy Earn products on Bybit to win points and share the new token prize pool.

Request URL with curl:
```bash
curl 'https://www.bybit.com/x-api/spot/api/megadrop/v1/prizePool/tokenList' \
  -H 'accept: application/json, text/plain, */*' \
  -H 'accept-language: en' \
  -b '_by_l_g_d=377c94b9-e6e4-a6c5-d7d5-21b01965c693; deviceId=9e9dcd95-59c3-e74f-78a1-103fe32268c6; _gcl_au=1.1.1936238975.1749464337; _ga=GA1.1.587500126.1749464337; _fbp=fb.1.1749464337562.831339531793144457; _tt_enable_cookie=1; _ttp=01JXA36K8NFNH7G6PYE69Y6HVF_.tt.1; _fwb=210sBDE7S3Kd5r3BFyn5N2Q.1749470314445; cto_bundle=A3qCdl9Ga2s2ckttZHN4TW5DQ2ZNZXVNcm5QZFVDTHFCNEFwdjhqcjFDNTBFQ2FVVHJocSUyQlZXU2hXaUVtY0ppSERnWjR6cHVZMjFZWWNWcWVsR1hxU2psVFpLUDhhcEd5NWJ5SnQ5c2swbDd0dmxzNXZOa1VBT0RwY0l4Smc1NENuUWNmWjJSUGJOdGk1dFVZalllVENRWGpFenhOa1glMkJzejJmaGc2aG8lMkJlNFFYQlJXUkpwT3hRZngweXluaiUyQjFRdU1OYVhDR3ZwZSUyQkNDbCUyRno0bHllY1IlMkI5bG5jendCJTJGelZBJTJCOGdFcThURlRFUDhKbGN2UCUyRjJUazhLa1hSTEZSalA3V08; sensorsdata2015jssdkchannel=%7B%22prop%22%3A%7B%22_sa_channel_landing_url%22%3A%22%22%7D%7D; sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%2219754332daa311-0d943129c9eba2-18525636-2073600-19754332dabc21%22%2C%22first_id%22%3A%22%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E7%9B%B4%E6%8E%A5%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC_%E7%9B%B4%E6%8E%A5%E6%89%93%E5%BC%80%22%2C%22%24latest_referrer%22%3A%22%22%2C%22_a_u_v%22%3A%220.0.6%22%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTk3NTQzMzJkYWEzMTEtMGQ5NDMxMjljOWViYTItMTg1MjU2MzYtMjA3MzYwMC0xOTc1NDMzMmRhYmMyMSJ9%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%22%2C%22value%22%3A%22%22%7D%7D; BYBIT_REG_REF_prod={"lang":"en-US","g":"377c94b9-e6e4-a6c5-d7d5-21b01965c693","referrer":"www.bybit.com/","source":"bybit.com","medium":"other","url":"https://www.bybit.com/en/","last_refresh_time":"Sat, 12 Jul 2025 11:54:33 GMT","ext_json":{"dtpid":null}}; tx_token_current=BNE; cookies_uuid_report=57b6c21a-3946-4515-9e72-8bf9dde3dcfe; first_collect=true; _abck=2C70ED0C8A5431F82D7491567089DFE7~0~YAAQg3kmF9gxNf6XAQAAuOJ8/g4z2Ci/oUnIQhe0a4e/kYCBYbW+pZH1vPwTmkukPCaUU1e0IxNFGaR9JBiceE6pDBtAR2RjTQb1XsNrHMhcg5ChPrrPNgcaiktaI8XugbkYJhnjFUjTvFAjBBA6AFs7cWY85YCXqJDcoCPAZ4/GoB6cBqExtpZjVaKl/QrrZnCUMfbzDYLcmPkTih4lLf77q4XUqHQrVDH2by7Ic4SfqyHxh1QODfALotRyT49a8W7IiDXWTDJWSy3xxcTbI/bopjPu2w/zHypE8YZfOm/w1Dry9YXpMSi5V2jlRfI+7X5Af1J7MK2yx+UQ5VImJFHusU2XIBAdXzqIcNZkGE2PLI2OSkMZm2iM6wqUmByaXqbdxH67TBVX7u4XNkYXEKBFFENOGQMVG26GlkG+nxIo1CcPR3pPF6lzavzQWULcO3HeAvr+s4DLs0xkTbdSkjXFzis4h8LyXcQgvVKy3uYhqrgRTZrWAEO63DudNDKB23Al6Xcw28OuwRs4CN1bys8qZnUVrCpROTiLGacfW0ek2coBLDYSXOppGC1f9Vo9cg/LNd6z1/mrzmmfLErOL/JO9p+gWYRQ5DvnS2LLNRF9dabjSPoDMk4LoB3Mro6SpOOazj4JRHy+NixtW/Lyq/BugFm23K55~-1~-1~-1; bm_mi=B73E3B5F0D1262134C042BF4C02F9483~YAAQg3kmFzozNf6XAQAA3fF8/hy9v3IFLX96z8589hqYMbXIv3MPCAXwwLcWecTfcLwR6ogmo4OfgHcw/V6rpq9uHZSVtqH9nbesUGLba4qk+WoH9nJonBRklDkJ3iLzeLcpoWP0NMESLBrNLjyVps+BaG46wPrtVefVzlL/FbIzju0NCtMkjRFqRHWLIzsPW7WNt2KwFmf14JUNqJWMf7TcBmwAtS7nvT1Y1HerLglZXOUQPo/ZSHTBeijLzzhLsSBCNIXRl7PRVTgWDSZiFr7FCn/ghBbyqC5JNjTWEXdXQtqBN72061H4ErxOySXS4GitbZQMDPUdd/8lqT1OSavwpH7V6Bv2pJOT~1; MgidSensorNVis=2; MgidSensorHref=https://www.bybit.com/en/trade/spot/megadrop; bm_sv=2A8F4DC3F4ECB6794319B3B819426AFA~YAAQg3kmF0U3Nf6XAQAAhQ59/hzwl1CRCiwsxLB3oXk4gFPw+631YhaHMTJ7zXQ3yzLTIm0394zj74mqDQ4mI87v4n94EdrYZzuGw/ELvF+7dRmiPyYsBQUHaglP/XSRmn7Ce8H5wDfHd3uZ5095TLWpIYSZrkeyuNyjRIGVDZyJAegOlEZea/R4lWgLpC9htDEC+7+qCc5JLxmMkOghbED3nN3SPKhzPzih1ucUjpJRwy5HarPk0mDIQ6vJ0k+E~1; ak_bmsc=537257AAD7F52F2655206C44611564E1~000000000000000000000000000000~YAAQmHkmF2FzH+iXAQAAjYOC/hwFElYwa40OkXVy05H5yiY12E8S22zqH62ehmx5k8363F5xqPnCx3IiaoHHya9shiyvqxMzNXYZJoWieboubiZvwkHe3HsSez55RsSBk+EmtIc8OFqAog4hjo3gV/WhaS5+3pVpGT/xA1fVEpoFG3NwiJqvNGNL7Aa5eRAKDtdRaHcaASWja2ZIDVCC87thEKiMnP6g2JmZv/xV2fzOAPLKdlI6oIlhX2YGt8ZPhOIueJNaUBRHppowAr2I6dh/Xru4hLj70AmRIK75IZoxhvVCme1VRF1EFmWLN7oreqn9Xuosh5h7U03fzMtz+mdwojK76mg0/qLVtlbqkoqyUZg8hE/MUUIINwPMMUL+Uqk3NppX+gDbh6+M9YXRYYZBSOdM99fFbiixbmzdxR6GpTzGartwLDnujoXNIwsUPR7juGMulbaDdfJCrGDOPjslUe4dskZ2zucskK02q4k4+Uq+Hu9Y0kFMYt4uU29BBD6Yk9Ez; tx_token_time=1752321770010; trace_id_time=1752321770182; _rdt_uuid=1752321283033.76299c6d-d736-4460-806f-7fb9e09b3a18; __rtbh.uid=%7B%22eventType%22%3A%22uid%22%2C%22id%22%3A%22undefined%22%2C%22expiryDate%22%3A%222026-07-12T12%3A02%3A57.208Z%22%7D; __rtbh.lid=%7B%22eventType%22%3A%22lid%22%2C%22id%22%3A%22GZGhc90xFQ3VJ0YvP269%22%2C%22expiryDate%22%3A%222026-07-12T12%3A02%3A57.208Z%22%7D; wcs_bt=135fb0af9baad90:1752321777|17470ac91156420:1752321274; ttcsid=1752321283278::4HyeBwCsoPesATGNbnQ9.6.1752321777347; ttcsid_CMEEMQRC77UBHLCRLFPG=1752321283278::oElWSMp-8BNqR46Poy_G.6.1752321777701; bm_sz=21DBCAF9E54B93E3BBA82EBBCDF8A752~YAAQmHkmF/LWH+iXAQAArBeG/hzIJHKetLvQGrpZWCg93C3yLsu9OJylM5iYIQ8IcCAV+7xlxw4FQNhIP7VCnzyK4/QLZt/dtGvvKMEnK+1Xzzh+UKnMEJF5trpOP/6Z9BEuwGDXvyROyhzteMGHPFC1q/o77ZkdXiXKnmihWhYq4KQHNgeDnxU0zC3wIDlODjOB8OpDR9FYhX7yr2majLY4RBeSfLnhS1n6tpyS0T47GKecX+0DS0+KPGCUbt+miPRXNBAWG2IOFQrw8330j9O+Rf9RW8nu9IYLCu8RHAm5PnmG9GFMtljkgLhL62s4U1r334o2N7aS9iT0JHAkY/uaw7l7KZGeCnmMPGB66UuIRb2l2skyCz4lZ9n0HGM6zSwescdQpN6NBtx2lIdNHSE9h4QbtsvhyQQLT47A2wKgmRo86VyQFaprF9UcsQVcOD9Xw6A=~4601656~4600113; _ga_SPS4ND2MGC=GS2.1.s1752321282$o7$g1$t1752321890$j60$l0$h0' \
  -H 'lang: en' \
  -H 'priority: u=1, i' \
  -H 'referer: https://www.bybit.com/en/trade/spot/megadrop' \
  -H 'sec-ch-ua: "Not)A;Brand";v="8", "Chromium";v="138", "Google Chrome";v="138"' \
  -H 'sec-ch-ua-mobile: ?0' \
  -H 'sec-ch-ua-platform: "macOS"' \
  -H 'sec-fetch-dest: empty' \
  -H 'sec-fetch-mode: cors' \
  -H 'sec-fetch-site: same-origin' \
  -H 'traceparent: 00-c994c43211c42ac3fd9e9051e4720e6d-56c21495f5991d4e-01' \
  -H 'user-agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36'
```
Request URL with node-fetch:
```
fetch("https://www.bybit.com/x-api/spot/api/megadrop/v1/prizePool/tokenList", {
  "headers": {
    "accept": "application/json, text/plain, */*",
    "accept-language": "en",
    "lang": "en",
    "priority": "u=1, i",
    "sec-ch-ua": "\"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"138\", \"Google Chrome\";v=\"138\"",
    "sec-ch-ua-mobile": "?0",
    "sec-ch-ua-platform": "\"macOS\"",
    "sec-fetch-dest": "empty",
    "sec-fetch-mode": "cors",
    "sec-fetch-site": "same-origin",
    "traceparent": "00-c994c43211c42ac3fd9e9051e4720e6d-56c21495f5991d4e-01",
    "cookie": "_by_l_g_d=377c94b9-e6e4-a6c5-d7d5-21b01965c693; deviceId=9e9dcd95-59c3-e74f-78a1-103fe32268c6; _gcl_au=1.1.1936238975.1749464337; _ga=GA1.1.587500126.1749464337; _fbp=fb.1.1749464337562.831339531793144457; _tt_enable_cookie=1; _ttp=01JXA36K8NFNH7G6PYE69Y6HVF_.tt.1; _fwb=210sBDE7S3Kd5r3BFyn5N2Q.1749470314445; cto_bundle=A3qCdl9Ga2s2ckttZHN4TW5DQ2ZNZXVNcm5QZFVDTHFCNEFwdjhqcjFDNTBFQ2FVVHJocSUyQlZXU2hXaUVtY0ppSERnWjR6cHVZMjFZWWNWcWVsR1hxU2psVFpLUDhhcEd5NWJ5SnQ5c2swbDd0dmxzNXZOa1VBT0RwY0l4Smc1NENuUWNmWjJSUGJOdGk1dFVZalllVENRWGpFenhOa1glMkJzejJmaGc2aG8lMkJlNFFYQlJXUkpwT3hRZngweXluaiUyQjFRdU1OYVhDR3ZwZSUyQkNDbCUyRno0bHllY1IlMkI5bG5jendCJTJGelZBJTJCOGdFcThURlRFUDhKbGN2UCUyRjJUazhLa1hSTEZSalA3V08; sensorsdata2015jssdkchannel=%7B%22prop%22%3A%7B%22_sa_channel_landing_url%22%3A%22%22%7D%7D; sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%2219754332daa311-0d943129c9eba2-18525636-2073600-19754332dabc21%22%2C%22first_id%22%3A%22%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E7%9B%B4%E6%8E%A5%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC_%E7%9B%B4%E6%8E%A5%E6%89%93%E5%BC%80%22%2C%22%24latest_referrer%22%3A%22%22%2C%22_a_u_v%22%3A%220.0.6%22%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTk3NTQzMzJkYWEzMTEtMGQ5NDMxMjljOWViYTItMTg1MjU2MzYtMjA3MzYwMC0xOTc1NDMzMmRhYmMyMSJ9%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%22%2C%22value%22%3A%22%22%7D%7D; BYBIT_REG_REF_prod={\"lang\":\"en-US\",\"g\":\"377c94b9-e6e4-a6c5-d7d5-21b01965c693\",\"referrer\":\"www.bybit.com/\",\"source\":\"bybit.com\",\"medium\":\"other\",\"url\":\"https://www.bybit.com/en/\",\"last_refresh_time\":\"Sat, 12 Jul 2025 11:54:33 GMT\",\"ext_json\":{\"dtpid\":null}}; tx_token_current=BNE; cookies_uuid_report=57b6c21a-3946-4515-9e72-8bf9dde3dcfe; first_collect=true; _abck=2C70ED0C8A5431F82D7491567089DFE7~0~YAAQg3kmF9gxNf6XAQAAuOJ8/g4z2Ci/oUnIQhe0a4e/kYCBYbW+pZH1vPwTmkukPCaUU1e0IxNFGaR9JBiceE6pDBtAR2RjTQb1XsNrHMhcg5ChPrrPNgcaiktaI8XugbkYJhnjFUjTvFAjBBA6AFs7cWY85YCXqJDcoCPAZ4/GoB6cBqExtpZjVaKl/QrrZnCUMfbzDYLcmPkTih4lLf77q4XUqHQrVDH2by7Ic4SfqyHxh1QODfALotRyT49a8W7IiDXWTDJWSy3xxcTbI/bopjPu2w/zHypE8YZfOm/w1Dry9YXpMSi5V2jlRfI+7X5Af1J7MK2yx+UQ5VImJFHusU2XIBAdXzqIcNZkGE2PLI2OSkMZm2iM6wqUmByaXqbdxH67TBVX7u4XNkYXEKBFFENOGQMVG26GlkG+nxIo1CcPR3pPF6lzavzQWULcO3HeAvr+s4DLs0xkTbdSkjXFzis4h8LyXcQgvVKy3uYhqrgRTZrWAEO63DudNDKB23Al6Xcw28OuwRs4CN1bys8qZnUVrCpROTiLGacfW0ek2coBLDYSXOppGC1f9Vo9cg/LNd6z1/mrzmmfLErOL/JO9p+gWYRQ5DvnS2LLNRF9dabjSPoDMk4LoB3Mro6SpOOazj4JRHy+NixtW/Lyq/BugFm23K55~-1~-1~-1; bm_mi=B73E3B5F0D1262134C042BF4C02F9483~YAAQg3kmFzozNf6XAQAA3fF8/hy9v3IFLX96z8589hqYMbXIv3MPCAXwwLcWecTfcLwR6ogmo4OfgHcw/V6rpq9uHZSVtqH9nbesUGLba4qk+WoH9nJonBRklDkJ3iLzeLcpoWP0NMESLBrNLjyVps+BaG46wPrtVefVzlL/FbIzju0NCtMkjRFqRHWLIzsPW7WNt2KwFmf14JUNqJWMf7TcBmwAtS7nvT1Y1HerLglZXOUQPo/ZSHTBeijLzzhLsSBCNIXRl7PRVTgWDSZiFr7FCn/ghBbyqC5JNjTWEXdXQtqBN72061H4ErxOySXS4GitbZQMDPUdd/8lqT1OSavwpH7V6Bv2pJOT~1; MgidSensorNVis=2; MgidSensorHref=https://www.bybit.com/en/trade/spot/megadrop; bm_sv=2A8F4DC3F4ECB6794319B3B819426AFA~YAAQg3kmF0U3Nf6XAQAAhQ59/hzwl1CRCiwsxLB3oXk4gFPw+631YhaHMTJ7zXQ3yzLTIm0394zj74mqDQ4mI87v4n94EdrYZzuGw/ELvF+7dRmiPyYsBQUHaglP/XSRmn7Ce8H5wDfHd3uZ5095TLWpIYSZrkeyuNyjRIGVDZyJAegOlEZea/R4lWgLpC9htDEC+7+qCc5JLxmMkOghbED3nN3SPKhzPzih1ucUjpJRwy5HarPk0mDIQ6vJ0k+E~1; ak_bmsc=537257AAD7F52F2655206C44611564E1~000000000000000000000000000000~YAAQmHkmF2FzH+iXAQAAjYOC/hwFElYwa40OkXVy05H5yiY12E8S22zqH62ehmx5k8363F5xqPnCx3IiaoHHya9shiyvqxMzNXYZJoWieboubiZvwkHe3HsSez55RsSBk+EmtIc8OFqAog4hjo3gV/WhaS5+3pVpGT/xA1fVEpoFG3NwiJqvNGNL7Aa5eRAKDtdRaHcaASWja2ZIDVCC87thEKiMnP6g2JmZv/xV2fzOAPLKdlI6oIlhX2YGt8ZPhOIueJNaUBRHppowAr2I6dh/Xru4hLj70AmRIK75IZoxhvVCme1VRF1EFmWLN7oreqn9Xuosh5h7U03fzMtz+mdwojK76mg0/qLVtlbqkoqyUZg8hE/MUUIINwPMMUL+Uqk3NppX+gDbh6+M9YXRYYZBSOdM99fFbiixbmzdxR6GpTzGartwLDnujoXNIwsUPR7juGMulbaDdfJCrGDOPjslUe4dskZ2zucskK02q4k4+Uq+Hu9Y0kFMYt4uU29BBD6Yk9Ez; tx_token_time=1752321770010; trace_id_time=1752321770182; _rdt_uuid=1752321283033.76299c6d-d736-4460-806f-7fb9e09b3a18; __rtbh.uid=%7B%22eventType%22%3A%22uid%22%2C%22id%22%3A%22undefined%22%2C%22expiryDate%22%3A%222026-07-12T12%3A02%3A57.208Z%22%7D; __rtbh.lid=%7B%22eventType%22%3A%22lid%22%2C%22id%22%3A%22GZGhc90xFQ3VJ0YvP269%22%2C%22expiryDate%22%3A%222026-07-12T12%3A02%3A57.208Z%22%7D; wcs_bt=135fb0af9baad90:1752321777|17470ac91156420:1752321274; ttcsid=1752321283278::4HyeBwCsoPesATGNbnQ9.6.1752321777347; ttcsid_CMEEMQRC77UBHLCRLFPG=1752321283278::oElWSMp-8BNqR46Poy_G.6.1752321777701; bm_sz=21DBCAF9E54B93E3BBA82EBBCDF8A752~YAAQmHkmF/LWH+iXAQAArBeG/hzIJHKetLvQGrpZWCg93C3yLsu9OJylM5iYIQ8IcCAV+7xlxw4FQNhIP7VCnzyK4/QLZt/dtGvvKMEnK+1Xzzh+UKnMEJF5trpOP/6Z9BEuwGDXvyROyhzteMGHPFC1q/o77ZkdXiXKnmihWhYq4KQHNgeDnxU0zC3wIDlODjOB8OpDR9FYhX7yr2majLY4RBeSfLnhS1n6tpyS0T47GKecX+0DS0+KPGCUbt+miPRXNBAWG2IOFQrw8330j9O+Rf9RW8nu9IYLCu8RHAm5PnmG9GFMtljkgLhL62s4U1r334o2N7aS9iT0JHAkY/uaw7l7KZGeCnmMPGB66UuIRb2l2skyCz4lZ9n0HGM6zSwescdQpN6NBtx2lIdNHSE9h4QbtsvhyQQLT47A2wKgmRo86VyQFaprF9UcsQVcOD9Xw6A=~4601656~4600113; _ga_SPS4ND2MGC=GS2.1.s1752321282$o7$g1$t1752321890$j60$l0$h0",
    "Referer": "https://www.bybit.com/en/trade/spot/megadrop"
  },
  "body": null,
  "method": "GET"
});
```
The response is a JSON object with the following structure:
```json
{
    "ret_code": 0,
    "ret_msg": null,
    "token": null,
    "result": [
        {
            "activityId": 9,
            "tokenName": "TAC",
            "tokenIcon": "https://s1.bycsi.com/app/assets/token/a17254e5d1964ea260f89179f85a029f.png",
            "tokenInfoList": [],
            "startTime": 1752148800000,
            "endTime": 1752451199000,
            "claimStartTime": 1752501600000,
            "claimEndTime": 1752588000000,
            "totalPrizePool": "50000000",
            "activityStatus": 1,
            "userMaxNum": "0.01",
            "totalNumberAwards": 1,
            "awardInterval": 0,
            "minRewardAmount": "0.0001"
        }
    ],
    "success": true
}
```