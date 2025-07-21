# ByStarter

Request API with headers:

```text
GET /x-api/spot/api/by-starter/v3/project/current HTTP/3
Host: www.bybit.com
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:140.0) Gecko/20100101 Firefox/140.0
Accept: application/json, text/plain, */*
Accept-Language: en
Accept-Encoding: gzip, deflate, br, zstd
Referer: https://www.bybit.com/en/bystarter
guid: 6d1b2619-746f-68f2-ac44-38f9dd764171
traceparent: 00-02e895c89ba1aa170f037cbf7ac2ad30-9a12d70964900b9b-01
Sec-Fetch-Dest: empty
Sec-Fetch-Mode: cors
Sec-Fetch-Site: same-origin
Connection: keep-alive
Alt-Used: www.bybit.com
Cookie: _abck=376805849F2A9E8F282FF8470A1C91BB~0~YAAQdAxAF/ea+BmYAQAAdOlDLQ79AKnDb/rDQkM2KgiNLT7bx88THA8oPFNVgOjsN6fdpXI12Vdabxmo/e1wcZ4n0L12okzcawgbO/tVHd3C7ubO6+Z+oF3Qu3EzFHQIe2Pbj1O7+gSQLWZUZ9XlcOLOUajLNIVnPIcSNKkdC3cm+4/FbjHzUHJu8Kh3e3c8VrNW49lo20EXiZQ4QmCJU8XwwdSjG9z/Igxe7HYn5ov41bIAOQcDMypXO5a2/ew+/f+EvktJZ3UVA9B3pyEg6vzLw0zua+wD++x3oEJ2loX5sCN/M/sxC6rogrZ9IcydqCXi1GFC1W2xtFGT0+yrQ0346+ZcOp8CYQLLJz1iSECicqip/6vJ9oJyt5lqGZEtVNYlgdxyFi+5ZWOM55rqTkp6DsaNdKawOtayG9s369XtfzZOzamBBc4iRLjeiQS3DsMVzNeih8hxxtSykdA/GugYjt/5cATMADXlpHAKTh0/yK3z526VLth9k4so9XAXzPEQWulrXYwaR7dgHe8SEjRdU/uNZeMgrqdm+s8CD6GgriDqa2AMe5U8IpQY1PLUhqEX9IJW97s20ivTF6finUbKfe3tdQPiuLou9DTkL/GkxsA8HD/tvuMwUHbPLxhyFUOdnO90t8KO6TSzlem3vm788hlcY0r8T14tAi7idmOrgT7om+2CqrtGMa2+3CUtiW5W1kDzcS/7ft8=~-1~-1~-1; _by_l_g_d=6d1b2619-746f-68f2-ac44-38f9dd764171; sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%221975432e4186ed-0535a87d4bc8184-43272f3d-2073600-1975432e4199bd%22%2C%22first_id%22%3A%22%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E7%9B%B4%E6%8E%A5%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC_%E7%9B%B4%E6%8E%A5%E6%89%93%E5%BC%80%22%2C%22%24latest_referrer%22%3A%22%22%2C%22_a_u_v%22%3A%220.0.6%22%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTk3NTQzMmU0MTg2ZWQtMDUzNWE4N2Q0YmM4MTg0LTQzMjcyZjNkLTIwNzM2MDAtMTk3NTQzMmU0MTk5YmQifQ%3D%3D%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%22%2C%22value%22%3A%22%22%7D%7D; deviceId=72610412-fa93-b0f6-fdeb-7a99d4d4fd7d; _fwb=133D6G5KGg6MPh3fpxk6mRy.1752065762979; wcs_bt=135fb0af9baad90:1753106106|17470ac91156420:1753086305; g_state={"i_p":1753689390550,"i_l":3}; _gcl_au=1.1.63225426.1752065811; _ga_SPS4ND2MGC=GS2.1.s1753106078$o7$g1$t1753106106$j32$l0$h0; _ga=GA1.1.191407373.1752065812; __rtbh.uid=%7B%22eventType%22%3A%22uid%22%2C%22id%22%3A%22undefined%22%2C%22expiryDate%22%3A%222026-07-21T13%3A55%3A06.518Z%22%7D; __rtbh.lid=%7B%22eventType%22%3A%22lid%22%2C%22id%22%3A%22G0UdE5BNFGA2tne1jxXP%22%2C%22expiryDate%22%3A%222026-07-21T13%3A55%3A06.518Z%22%7D; MgidSensorNVis=9; MgidSensorHref=https://www.bybit.com/en/bystarter; _fbp=fb.1.1752065811936.845987125314311556; _tt_enable_cookie=1; _ttp=01JZQM59JDHX390T1DV2W4NP5V_.tt.1; ttcsid_CMEEMQRC77UBHLCRLFPG=1753106078504::VMgLaKoLUvoFj3gbP8gU.5.1753106107066; ttcsid=1753106078505::0I1R-jCoKl3EYIHpqBqC.5.1753106106811; tx_token_time=1753106103029; cookies_uuid_report=17d3654f-fe53-4da7-ad7a-e66a6dc0adae; first_collect=true; trace_id_time=1753106103056; _gcl_gs=2.1.k1$i1752763431$u192150713; sensorsdata2015jssdkchannel=%7B%22prop%22%3A%7B%22_sa_channel_landing_url%22%3A%22%22%7D%7D; BYBIT_REG_REF_prod={"lang":"en-US","g":"6d1b2619-746f-68f2-ac44-38f9dd764171","referrer":"www.bybit.com/","source":"bybit.com","medium":"other","url":"https://www.bybit.com/en/","last_refresh_time":"Mon, 21 Jul 2025 08:24:50 GMT","ext_json":{"dtpid":null}}; tx_token_current=BNE; ak_bmsc=956EF7F44723EE989FDB9E8F38979634~000000000000000000000000000000~YAAQdAxAF2md+BmYAQAAvu9DLRzAc10sr5Em7RWtEGPNVKtPcPQIABJTNv/v73Pe6LXZroJsOvj0P4Evh1uAc1hneUp2QTQNQXuu4mkhLJmWy1rbfzF0fij48L7h3dFET0riwEPpOyqLEuSHE416FnDm/za3llsH5mfwT9GLD9NDgLptY8MFX4KYCrElOdAWggyyizqWd37obi2CZpfsdyaZ8IrBv8xFadMjznfZpOj8FOaUy7qdKKp/qFtXdf+TvF2vvSEGdUHPvXYrMC0m+NKWxOFWYbX5LHBYBVCr3zjyYDTDJv+DYUEReqRijPWrhMQtXxrBeQazZgLvooAJAWxCHJlf3/suVTM8EIQNqhXs1YXg41SAhdKNDtAl2MrtffqQffkf47vRxBckaoRTBx8HMdJUd+T8zY5WhO1/EDYjSfd0hJ3YECaNxl0AMaab9ucXjyz03EsqW3qCpaw0cQNPpRip; bm_sz=AE4B241C4A5E4635994BD4684B759C7E~YAAQdAxAF7/j+BmYAQAAD6JELRy4Fp8Dn/EUORXbMsjNEhvc5Z2yGbC0SNJfDh8leiKJqjYbZ3JgNyhsnQzTfQ+Ra1awInZ0rJp+7rN0KQDzhTscdEnrOTl5YXn7oMnuZyxkIM3uugMBN1QGHhGo06niebSEGhaNapztZSl04X4YnrpkM23sJXnC63ZKAcVRL+M2lMcIHdzEW5T0XVcEfTnDN2/IM2neXEekSrbT2ISH161PegVNTkCNXpWb+KaY+iP72vaTVVn+qOK+Rffrc6EZGKK/75ss2VtreRv87AgITiFTC9b10pCrWkgRlyPC94qzRTZG3hOzt8L3nUTS5YcF6Mo+sH10V7XZ9fMgPcyxdMQufXOETG1bHrjhv6pjw6iao8s3wP3aurdwv4BOLyvRdHV6ksvAPStirjDc1qzcLXkA~3162949~3359042; bm_sv=81331CAAC0F63D82B7CF84221C1638E2~YAAQdAxAF77j+BmYAQAAD6JELRyuUzmNkf9gWl/tFoxv39Z2RbZBQPY1XRu+49Bj+NOc0PxWHm1G+PpV6PAO+uXoUdzOsa/BFQegrjTFONfaDaH5Zh72fdkpGB7dkjs0gkfi6HC+pYBd6VZ2SknWNLQvQKf5Vo7wEdDlP8fzUZdSpbU6UhLPZTBbbNXlCGGbjS50uQhYozlcmu1HW456+ejlYYJmFy9cX/uL69Owrt9FeUoF+sn9C3Gu2hDiwQA5~1; trace_id_report=6b4fe843-432f-4582-9e79-c120894e0e06; by_token_print=330ac021c2m0zdcqmj52n5k7482ae3a21; deviceCodeExpire=1753106073176; bm_mi=00C3F0240A4777EF11D74504E3A138E5~YAAQdAxAF9uZ+BmYAQAAH+dDLRzMJEmu80fRLe9v1q9MlNYkF+WoXtyIgWrla1j8Lxv06+kbLMGwjcXZLL7gKoMYXzEOjqmL6Vy2h0Yd0gUYoKa1DoObpzxq6tC7ZQqzmtLksDMW2iOJqqE5FB4Ll4RJl6DEqBqhHL5Lbv/pPNql+5zrPHYaDhdSC4hBHSxjmjbDsAEZZB3eUpjpQbMZyyOwlEJ48buqDIQH87DZhxl+JOSt5aWHVdhSViPrNhShEXp7HyCAtf8ENDRkb3sH/5a4D3Du9o+oBS4/Q7kitrcTwKiZGVjaRCboq5v3M6W1cit1t+oBrlYK~1; _rdt_uuid=1752763441304.dfa4be4d-e387-4262-b653-df3b4d5b6365
TE: trailers
```

The response is a JSON object with the following structure:

```json
{
  "ret_code": 0,
  "ret_msg": null,
  "token": null,
  "result": [
    {
      "projectId": 11,
      "coinIcon": "https://s1.bycsi.com/app/assets/token/59cf762dd85dd240d031650dc8bb13bf.png",
      "coinName": "ZK",
      "projectIntro": "ZKsync leverages ZK Rollup architecture to enhance Ethereum’s scalability and privacy. It facilitates low-cost transactions for ETH and ERC20 tokens by performing computations off-chain while maintaining robust security guarantees on the mainchain. This approach ensures high efficiency and integrity, making ZKsync a pivotal solution for the Ethereum ecosystem.",
      "lockTerms": "No lock-up period",
      "totalSupply": "14700000",
      "participants": "79240",
      "totalInvestment": "7924000",
      "price": "0",
      "minPrice": null,
      "maxPrice": null,
      "amount": "100",
      "minAmount": null,
      "maxAmount": null,
      "currentTime": 1753106130077,
      "projectType": 2,
      "periodList": [
        {
          "periodId": 16,
          "saleStartTime": 1718607600000,
          "saleEndTime": 1721296799000,
          "publishTime": 1721988000000,
          "eligibleParticipants": 1
        }
      ],
      "referralAwardInfo": null,
      "fundingToken": "USDT"
    }
  ],
  "success": true
}
```