# Airdrop Hunt (ADHP)

Perform Tasks for a Chance to Win Tokens!

## Project Information

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

## Current Events

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

List of parameters to parse:

- `airdropEndTime`: the airdrop end time of the data point
- `poolEnd`: the pool end of the data point
- `poolStart`: the pool start of the data point
- `tokenIcon`: the token icon of the data point
- `tokenId`: the token id of the data point

## Past Events

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
      ...
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

List of parameters to parse:

- `airdropEndTime`: the airdrop end time of the data point
- `poolEnd`: the pool end of the data point
- `poolStart`: the pool start of the data point
- `tokenIcon`: the token icon of the data point
- `tokenId`: the token id of the data point