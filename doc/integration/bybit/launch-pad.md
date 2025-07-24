# Launchpad

Gain early access to tokens from promising projects directly on Bybit

## Project Information

Request API with headers:

```text
GET /x-api/spot/api/activity/v2/project/ongoing/list HTTP/3

Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: en-US,en;q=0.5
Alt-Used: www.bybit.com
Priority: u=0, i
Referer: https://www.bybit.com/en/trade/spot/launchpad
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
  "ret_msg": null,
  "result": {
    "totalProjects": 32,
    "totalAmount": 4.342033765E9,
    "totalUser": 2309207,
    "growth": "645",
    "projectList": []
  },
  "token": null,
  "success": true
}
```

## Current Events

Request API with headers:

```text
GET /x-api/spot/api/activity/v2/project/finished/list?current=1&pageSize=3 HTTP/3

Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: en-US,en;q=0.5
Alt-Used: www.bybit.com
Priority: u=0, i
Referer: https://www.bybit.com/en/trade/spot/launchpad
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
  "ret_msg": null,
  "token": null,
  "result": {
    "current": 1,
    "pageSize": 3,
    "total": 32,
    "list": [
      {
        "code": "2024123000001",
        "name": "XTER",
        "title": "XTER Launchpad",
        "icon": "https://s1.bycsi.com/app/assets/token/350169c43d3902940a04f529befb5293.png",
        "issueAmount": 7500000,
        "currencyName": "XTER",
        "totalUser": 158105,
        "totalAmount": "115355709.572",
        "startTime": 1736307000000,
        "endTime": 1736326799000,
        "snapshotStartTime": 1735862400000,
        "snapshotEndTime": 1736294399000,
        "allocationStartTime": 1736326800000,
        "allocationEndTime": 1736330399000,
        "projectStartTime": 1736330400000,
        "projectType": 0,
        "projectActivityList": [
          {
            "icon": "https://static.bymj.io/spot/img/9b6628b609f611eebdc72a133fcf998d.svg",
            "issueAmount": "3750000",
            "limitAmount": "7500",
            "currencyName": "MNT",
            "exchangedPrice": "0.0312",
            "exchangedCurrencyName": "MNT",
            "totalUser": 18916,
            "totalAmount": "79309468",
            "type": 0
          },
          {
            "icon": "https://static.bymj.io/bhop/image/cFohX-nCfjNeQkxkA4zwOfvpOj153Hg6lN9-Byf5nks.svg",
            "issueAmount": "3750000",
            "limitAmount": "375",
            "currencyName": "USDT",
            "exchangedPrice": "0.04",
            "exchangedCurrencyName": "USDT",
            "totalUser": 139189,
            "totalAmount": "13918900",
            "type": 1
          }
        ]
      },
      ...
      {
        "code": "2024050300001",
        "name": "LFT",
        "title": "LFT Launchpad",
        "icon": "https://s1.bycsi.com/app/assets/token/d981d17bca2d99634f1a89ac2c1ee438.png",
        "issueAmount": 10000000,
        "currencyName": "LFT",
        "totalUser": 123152,
        "totalAmount": "95522736.9932",
        "startTime": 1715743800000,
        "endTime": 1715770799000,
        "snapshotStartTime": 1715299200000,
        "snapshotEndTime": 1715731199000,
        "allocationStartTime": 1715770800000,
        "allocationEndTime": 1715774399000,
        "projectStartTime": 1715774400000,
        "projectType": 0,
        "projectActivityList": [
          {
            "icon": "https://static.bymj.io/spot/img/9b6628b609f611eebdc72a133fcf998d.svg",
            "issueAmount": "5000000",
            "limitAmount": "10000",
            "currencyName": "MNT",
            "exchangedPrice": "0.0315",
            "exchangedCurrencyName": "MNT",
            "totalUser": 22769,
            "totalAmount": "89926822",
            "type": 0
          },
          {
            "icon": "https://static.bymj.io/bhop/image/cFohX-nCfjNeQkxkA4zwOfvpOj153Hg6lN9-Byf5nks.svg",
            "issueAmount": "5000000",
            "limitAmount": "500",
            "currencyName": "USDT",
            "exchangedPrice": "0.03",
            "exchangedCurrencyName": "USDT",
            "totalUser": 100383,
            "totalAmount": "10038300",
            "type": 1
          }
        ]
      }
    ]
  },
  "success": true
}
```