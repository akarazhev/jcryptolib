# Airdrop Hunt

Request API with headers:

```text
GET /x-api/spot/api/airdrop-splash/v1/project/home HTTP/3

Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: en-US,en;q=0.5
Alt-Used: www.bybit.com
Priority: u=0, i
Referer: https://www.bybit.com/en/trade/spot/airdrop-hunt
Origin: https://www.bybit.com
Sec-Fetch-Dest: document
Sec-Fetch-Mode: navigate
Sec-Fetch-Site: none
Sec-Fetch-User: ?1
TE: trailers
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:140.0) "Gecko/20100101 Firefox/140.0
```

The response is a JSON object with the following structure:

```json
{
  "ret_code": 0,
  "ret_msg": "OK",
  "result": {
    "participants": 1978468,
    "projects": 17,
    "totalPrizePool": "10650753"
  },
  "ext_code": "",
  "ext_info": null,
  "time_now": "1753108645.931391"
}
```

## Airdrop Hunt Current

Request API with headers:

```text
GET /x-api/spot/api/airdrop-splash/v1/project/list?requestCategory=0 HTTP/3

Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: en-US,en;q=0.5
Alt-Used: www.bybit.com
Priority: u=0, i
Referer: https://www.bybit.com/en/trade/spot/airdrop-hunt
Origin: https://www.bybit.com
Sec-Fetch-Dest: document
Sec-Fetch-Mode: navigate
Sec-Fetch-Site: none
Sec-Fetch-User: ?1
TE: trailers
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:140.0) "Gecko/20100101 Firefox/140.0
```

The response is a JSON object with the following structure:

```json
{
  "ret_code": 0,
  "ret_msg": "OK",
  "result": {
    "current": 0,
    "list": [],
    "pageSize": 0,
    "total": 0
  },
  "ext_code": "",
  "ext_info": null,
  "time_now": "1753108645.951461"
}
```

## Airdrop Hunt Past Events

Request API with headers:

```text
GET /x-api/spot/api/airdrop-splash/v1/project/list?pageSize=10&pageNo=1&requestCategory=2 HTTP/3

Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: en-US,en;q=0.5
Alt-Used: www.bybit.com
Priority: u=0, i
Referer: https://www.bybit.com/en/trade/spot/airdrop-hunt
Origin: https://www.bybit.com
Sec-Fetch-Dest: document
Sec-Fetch-Mode: navigate
Sec-Fetch-Site: none
Sec-Fetch-User: ?1
TE: trailers
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:140.0) "Gecko/20100101 Firefox/140.0
```

The response is a JSON object with the following structure:

```json
{
  "ret_code": 0,
  "ret_msg": "OK",
  "result": {
    "current": 1,
    "list": [
      {
        "airdropEndTime": 1737878400000,
        "averageBenefits": "40",
        "kycType": 1,
        "participants": 73294,
        "poolEnd": 1737532800000,
        "poolList": [
          {
            "beginTime": 1736928000000,
            "eachQty": "40",
            "endTime": 1737532800000,
            "poolStatus": 3,
            "poolType": 1,
            "poolValue": "50000",
            "prizeCount": "2500",
            "prizePoolQty": "100000",
            "prizePoolToken": "J",
            "rewardTime": 10800000
          }
        ],
        "poolStart": 1736928000000,
        "premarketProject": 1,
        "projectId": 19,
        "systemTime": 1753108645969,
        "tokenIcon": "https://s1.bycsi.com/app/assets/token/b03aad8a07cd3b7a9d05f07b5377f8d5.png",
        "tokenId": "J",
        "totalPoolValue": "100000"
      },
      {
        "airdropEndTime": 1732089600000,
        "averageBenefits": "200",
        "kycType": 1,
        "participants": 50480,
        "poolEnd": 1731398400000,
        "poolList": [
          {
            "beginTime": 1730196000000,
            "eachQty": "200",
            "endTime": 1731398400000,
            "poolStatus": 3,
            "poolType": 1,
            "poolValue": "300000",
            "prizeCount": "25000",
            "prizePoolQty": "5000000",
            "prizePoolToken": "KRO",
            "rewardTime": 10800000
          },
          {
            "beginTime": 1730196000000,
            "eachQty": "100",
            "endTime": 1731398400000,
            "poolStatus": 3,
            "poolType": 2,
            "poolValue": "48000",
            "prizeCount": "8000",
            "prizePoolQty": "800000",
            "prizePoolToken": "KRO",
            "rewardTime": 1731495600000
          },
          {
            "beginTime": 1730196000000,
            "eachQty": "100",
            "endTime": 1731398400000,
            "poolStatus": 3,
            "poolType": 3,
            "poolValue": "48000",
            "prizeCount": "8000",
            "prizePoolQty": "800000",
            "prizePoolToken": "KRO",
            "rewardTime": 1731495600000
          }
        ],
        "poolStart": 1730196000000,
        "premarketProject": 0,
        "projectId": 18,
        "systemTime": 1753108645969,
        "tokenIcon": "https://s1.bycsi.com/app/assets/token/00fdb75e71d2ad47afd57f9b4b468f81.png",
        "tokenId": "KRO",
        "totalPoolValue": "5800000"
      },
      {
        "airdropEndTime": 1730448000000,
        "averageBenefits": "80000",
        "kycType": 1,
        "participants": 48668,
        "poolEnd": 1729756800000,
        "poolList": [
          {
            "beginTime": 1729152000000,
            "eachQty": "80000",
            "endTime": 1729756800000,
            "poolStatus": 3,
            "poolType": 1,
            "poolValue": "80000",
            "prizeCount": "3000",
            "prizePoolQty": "240000000",
            "prizePoolToken": "X",
            "rewardTime": 10800000
          }
        ],
        "poolStart": 1729152000000,
        "premarketProject": 1,
        "projectId": 17,
        "systemTime": 1753108645969,
        "tokenIcon": "https://s1.bycsi.com/app/assets/token/617ac11f4befc5e1952b0f1ff2fa04da.png",
        "tokenId": "X",
        "totalPoolValue": "240000000"
      },
      {
        "airdropEndTime": 1722420000000,
        "averageBenefits": "25",
        "kycType": 1,
        "participants": 180169,
        "poolEnd": 1722412800000,
        "poolList": [
          {
            "beginTime": 1721210400000,
            "eachQty": "25",
            "endTime": 1722412800000,
            "poolStatus": 3,
            "poolType": 1,
            "poolValue": "100000",
            "prizeCount": "4000",
            "prizePoolQty": "100000",
            "prizePoolToken": "USDT",
            "rewardTime": 10800000
          },
          {
            "beginTime": 1721210400000,
            "eachQty": "5",
            "endTime": 1722412800000,
            "poolStatus": 3,
            "poolType": 2,
            "poolValue": "50000",
            "prizeCount": "10000",
            "prizePoolQty": "50000",
            "prizePoolToken": "USDT",
            "rewardTime": 1722510000000
          },
          {
            "beginTime": 1721210400000,
            "eachQty": "5",
            "endTime": 1722412800000,
            "poolStatus": 3,
            "poolType": 3,
            "poolValue": "50000",
            "prizeCount": "10000",
            "prizePoolQty": "50000",
            "prizePoolToken": "USDT",
            "rewardTime": 1722510000000
          }
        ],
        "poolStart": 1721210400000,
        "premarketProject": 0,
        "projectId": 15,
        "systemTime": 1753108645969,
        "tokenIcon": "https://s1.bycsi.com/app/assets/token/88cdfa8e50e2b398528a94653f14408b.png",
        "tokenId": "PIXFI",
        "totalPoolValue": "150000"
      },
      {
        "airdropEndTime": 1721296800000,
        "averageBenefits": "2000",
        "kycType": 1,
        "participants": 181628,
        "poolEnd": 1721289600000,
        "poolList": [
          {
            "beginTime": 1720087200000,
            "eachQty": "2000",
            "endTime": 1721289600000,
            "poolStatus": 3,
            "poolType": 1,
            "poolValue": "400000",
            "prizeCount": "20000",
            "prizePoolQty": "40000000",
            "prizePoolToken": "DOP1",
            "rewardTime": 10800000
          },
          {
            "beginTime": 1720087200000,
            "eachQty": "500",
            "endTime": 1721289600000,
            "poolStatus": 3,
            "poolType": 2,
            "poolValue": "50000",
            "prizeCount": "10000",
            "prizePoolQty": "5000000",
            "prizePoolToken": "DOP1",
            "rewardTime": 1721386800000
          },
          {
            "beginTime": 1720087200000,
            "eachQty": "500",
            "endTime": 1721289600000,
            "poolStatus": 3,
            "poolType": 3,
            "poolValue": "50000",
            "prizeCount": "10000",
            "prizePoolQty": "5000000",
            "prizePoolToken": "DOP1",
            "rewardTime": 1721386800000
          }
        ],
        "poolStart": 1720087200000,
        "premarketProject": 0,
        "projectId": 14,
        "systemTime": 1753108645969,
        "tokenIcon": "https://s1.bycsi.com/app/assets/token/2a3fbe0bfc407dac6db802a1e3e05189.png",
        "tokenId": "DOP1",
        "totalPoolValue": "45000000"
      },
      {
        "airdropEndTime": 1720087200000,
        "averageBenefits": "4300",
        "kycType": 1,
        "participants": 163461,
        "poolEnd": 1719388800000,
        "poolList": [
          {
            "beginTime": 1718179200000,
            "eachQty": "4300",
            "endTime": 1719388800000,
            "poolStatus": 3,
            "poolType": 1,
            "poolValue": "314115",
            "prizeCount": "10000",
            "prizePoolQty": "43000000",
            "prizePoolToken": "BUBBLE",
            "rewardTime": 10800000
          },
          {
            "beginTime": 1718179200000,
            "eachQty": "850",
            "endTime": 1719388800000,
            "poolStatus": 3,
            "poolType": 2,
            "poolValue": "55883",
            "prizeCount": "9000",
            "prizePoolQty": "7650000",
            "prizePoolToken": "BUBBLE",
            "rewardTime": 1720090800000
          },
          {
            "beginTime": 1718179200000,
            "eachQty": "850",
            "endTime": 1719388800000,
            "poolStatus": 3,
            "poolType": 3,
            "poolValue": "55883",
            "prizeCount": "9000",
            "prizePoolQty": "7650000",
            "prizePoolToken": "BUBBLE",
            "rewardTime": 1720090800000
          }
        ],
        "poolStart": 1718179200000,
        "premarketProject": 0,
        "projectId": 13,
        "systemTime": 1753108645969,
        "tokenIcon": "https://s1.bycsi.com/app/assets/token/05064b80ff9377c73c2676243e01f1ac.png",
        "tokenId": "BUBBLE",
        "totalPoolValue": "50650000"
      },
      {
        "airdropEndTime": 1719399600000,
        "averageBenefits": "46400",
        "kycType": 1,
        "participants": 134960,
        "poolEnd": 1718784000000,
        "poolList": [
          {
            "beginTime": 1716976800000,
            "eachQty": "46400",
            "endTime": 1718784000000,
            "poolStatus": 3,
            "poolType": 1,
            "poolValue": "87000",
            "prizeCount": "3750",
            "prizePoolQty": "174000000",
            "prizePoolToken": "ZERO",
            "rewardTime": 10800000
          },
          {
            "beginTime": 1716976800000,
            "eachQty": "16000",
            "endTime": 1718787600000,
            "poolStatus": 3,
            "poolType": 2,
            "poolValue": "10000",
            "prizeCount": "1250",
            "prizePoolQty": "20000000",
            "prizePoolToken": "ZERO",
            "rewardTime": 1719399600000
          },
          {
            "beginTime": 1716976800000,
            "eachQty": "12000",
            "endTime": 1718787600000,
            "poolStatus": 3,
            "poolType": 3,
            "poolValue": "3000",
            "prizeCount": "500",
            "prizePoolQty": "6000000",
            "prizePoolToken": "ZERO",
            "rewardTime": 1719399600000
          }
        ],
        "poolStart": 1716976800000,
        "premarketProject": 0,
        "projectId": 11,
        "systemTime": 1753108645969,
        "tokenIcon": "https://s1.bycsi.com/app/assets/token/01bb9e603e72c3be6bacf704b346d27d.png",
        "tokenId": "ZERO",
        "totalPoolValue": "194000000"
      },
      {
        "airdropEndTime": 1719396000000,
        "averageBenefits": "4",
        "kycType": 1,
        "participants": 168651,
        "poolEnd": 1719302400000,
        "poolList": [
          {
            "beginTime": 1718092800000,
            "eachQty": "4",
            "endTime": 1719302400000,
            "poolStatus": 3,
            "poolType": 1,
            "poolValue": "2000000",
            "prizeCount": "50000",
            "prizePoolQty": "200000",
            "prizePoolToken": "SPEC",
            "rewardTime": 10800000
          },
          {
            "beginTime": 1718092800000,
            "eachQty": "1",
            "endTime": 1719302400000,
            "poolStatus": 3,
            "poolType": 2,
            "poolValue": "20000",
            "prizeCount": "20000",
            "prizePoolQty": "20000",
            "prizePoolToken": "SPEC",
            "rewardTime": 1719399600000
          },
          {
            "beginTime": 1718092800000,
            "eachQty": "1",
            "endTime": 1719302400000,
            "poolStatus": 3,
            "poolType": 3,
            "poolValue": "200000",
            "prizeCount": "20000",
            "prizePoolQty": "20000",
            "prizePoolToken": "SPEC",
            "rewardTime": 1719399600000
          }
        ],
        "poolStart": 1718092800000,
        "premarketProject": 0,
        "projectId": 12,
        "systemTime": 1753108645969,
        "tokenIcon": "https://s1.bycsi.com/app/assets/token/10bf9ceed87394867f7d409ea443c7e0.png",
        "tokenId": "SPEC",
        "totalPoolValue": "220000"
      },
      {
        "airdropEndTime": 1718877600000,
        "averageBenefits": "2500",
        "kycType": 1,
        "participants": 163842,
        "poolEnd": 1718265600000,
        "poolList": [
          {
            "beginTime": 1716465600000,
            "eachQty": "2500",
            "endTime": 1718265600000,
            "poolStatus": 3,
            "poolType": 1,
            "poolValue": "350000",
            "prizeCount": "28000",
            "prizePoolQty": "70000000",
            "prizePoolToken": "HLG",
            "rewardTime": 10800000
          },
          {
            "beginTime": 1716458400000,
            "eachQty": "250",
            "endTime": 1718265600000,
            "poolStatus": 3,
            "poolType": 2,
            "poolValue": "5",
            "prizeCount": "10000",
            "prizePoolQty": "2500000",
            "prizePoolToken": "HLG",
            "rewardTime": 1718881200000
          },
          {
            "beginTime": 1716458400000,
            "eachQty": "250",
            "endTime": 1718265600000,
            "poolStatus": 3,
            "poolType": 3,
            "poolValue": "5",
            "prizeCount": "10000",
            "prizePoolQty": "2500000",
            "prizePoolToken": "HLG",
            "rewardTime": 1718881200000
          }
        ],
        "poolStart": 1716465600000,
        "premarketProject": 0,
        "projectId": 10,
        "systemTime": 1753108645969,
        "tokenIcon": "https://s1.bycsi.com/app/assets/token/b27b06cbeb4d058fe0db6d767ddb8259.png",
        "tokenId": "HLG",
        "totalPoolValue": "72500000"
      },
      {
        "airdropEndTime": 1717668000000,
        "averageBenefits": "2000",
        "kycType": 1,
        "participants": 113662,
        "poolEnd": 1717056000000,
        "poolList": [
          {
            "beginTime": 1715760000000,
            "eachQty": "2000",
            "endTime": 1717056000000,
            "poolStatus": 3,
            "poolType": 1,
            "poolValue": "800000",
            "prizeCount": "40000",
            "prizePoolQty": "80000000",
            "prizePoolToken": "FOXY",
            "rewardTime": 10800000
          },
          {
            "beginTime": 1715760000000,
            "eachQty": "500",
            "endTime": 1717056000000,
            "poolStatus": 3,
            "poolType": 2,
            "poolValue": "200000",
            "prizeCount": "40000",
            "prizePoolQty": "20000000",
            "prizePoolToken": "FOXY",
            "rewardTime": 1717671600000
          }
        ],
        "poolStart": 1715760000000,
        "premarketProject": 0,
        "projectId": 9,
        "systemTime": 1753108645969,
        "tokenIcon": "https://s1.bycsi.com/app/assets/token/8c071d7f96ebfdfdd7e59d1fb2f9054f.png",
        "tokenId": "FOXY",
        "totalPoolValue": "100000000"
      }
    ],
    "pageSize": 10,
    "total": 17
  },
  "ext_code": "",
  "ext_info": null,
  "time_now": "1753108645.969664"
}
```