# Market Cycle Indicators

## Market Cycle Top Indicators (IND)

Request URL with curl:

```text
GET /data-api/v3/market-cycles/indicators?convertId=2781&sortBy=index&sortType=asc HTTP/2

Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: en-US,en;q=0.5
Cache-Control: no-cache
Origin: https://coinmarketcap.com/
Platform: web
Priority: u=0, i
Referer: https://coinmarketcap.com/
Sec-Fetch-Dest: document
Sec-Fetch-Mode: navigate
Sec-Fetch-Site: none
Sec-Fetch-User: ?1
TE: trailers
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:140.0) "Gecko/20100101 Firefox/140.0
x-request-id: [X-Request-ID]
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "indicators": [
      {
        "indicatorName": "Bitcoin Ahr999 Index",
        "time": "1752516000000",
        "currentValue": "1.26",
        "targetValue": "4",
        "comparisonType": ">=",
        "percentChange24h": 3.27868852459000,
        "hitStatus": false,
        "index": 1
      },
      ...
      {
        "indicatorName": "Smithson's Bitcoin Price Forecast",
        "time": "1752516000000",
        "currentValue": "123020.55",
        "targetValue": "175000.00",
        "comparisonType": ">=",
        "percentChange24h": 4.44616737682400,
        "hitStatus": false,
        "index": 30
      }
    ],
    "totalHitCount": 30,
    "triggeredCount": 0
  },
  "status": {
    "timestamp": "2025-07-14T18:25:28.156Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "2",
    "credit_count": 0
  }
}
```

List of parameters to parse:

- `indicators` - an array of objects with the following structure:
    - `indicatorName` - the name of the indicator
    - `time` - the time of the indicator
    - `currentValue` - the current value of the indicator
    - `targetValue` - the target value of the indicator
    - `comparisonType` - the comparison type of the indicator
    - `percentChange24h` - the percent change of the indicator
    - `hitStatus` - the hit status of the indicator
    - `index` - the index of the indicator
- `totalHitCount` - the total number of hit indicators
- `triggeredCount` - the number of triggered indicators

## Market Cycle Latest (MCL)

Request URL with curl:

```text
GET /data-api/v3/market-cycles/latest?convertId=2781 HTTP/2

Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: en-US,en;q=0.5
Cache-Control: no-cache
Origin: https://coinmarketcap.com/
Platform: web
Priority: u=0, i
Referer: https://coinmarketcap.com/
Sec-Fetch-Dest: document
Sec-Fetch-Mode: navigate
Sec-Fetch-Site: none
Sec-Fetch-User: ?1
TE: trailers
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:140.0) "Gecko/20100101 Firefox/140.0
x-request-id: [X-Request-ID]
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "puellMultiple": 1.398919650302141,
    "piCycleTop": {
      "ma110": 98696.95,
      "ma350mu2": 172988.74
    },
    "likelihood": {
      "totalCount": 30,
      "holdCount": 30,
      "sellCount": 0
    }
  },
  "status": {
    "timestamp": "2025-07-14T18:23:14.813Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "1",
    "credit_count": 0
  }
}
```

List of parameters to parse:

- `puellMultiple` - the Puell Multiple
- `piCycleTop` - the top of the PI cycle
    - `ma110` - the MA110
    - `ma350mu2` - the MA350Mu2
- `likelihood` - the likelihood
    - `totalCount` - the total count
    - `holdCount` - the hold count
    - `sellCount` - the sell count

## Puell Multiple (PM)

Request URL with curl:

```text
GET /data-api/v3/market-cycles/puell-multiple?range=30d&convertId=2781 HTTP/2

Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: en-US,en;q=0.5
Cache-Control: no-cache
Origin: https://coinmarketcap.com/
Platform: web
Priority: u=0, i
Referer: https://coinmarketcap.com/
Sec-Fetch-Dest: document
Sec-Fetch-Mode: navigate
Sec-Fetch-Site: none
Sec-Fetch-User: ?1
TE: trailers
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:140.0) "Gecko/20100101 Firefox/140.0
x-request-id: [X-Request-ID]
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "points": [
      {
        "puellMultiple": 1.1939571467490602,
        "btcUsdPrice": 105464.84,
        "timestamp": "1749945600000"
      },
      ...
      {
        "puellMultiple": 1.3026878687829473,
        "btcUsdPrice": 117432.20,
        "timestamp": "1752364800000"
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-15T17:38:13.769Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "2",
    "credit_count": 0
  }
}
```

List of parameters to parse:

- `points` - an array of objects with the following structure:
    - `puellMultiple` - the Puell Multiple
    - `btcUsdPrice` - the BTC/USD price
    - `timestamp` - the timestamp

## Pi Cycle Top Indicator (PCT)

Request URL with curl:

```text
GET /data-api/v3/market-cycles/pi-cycle-top?range=30d&convertId=2781 HTTP/2

Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: en-US,en;q=0.5
Cache-Control: no-cache
Origin: https://coinmarketcap.com/
Platform: web
Priority: u=0, i
Referer: https://coinmarketcap.com/
Sec-Fetch-Dest: document
Sec-Fetch-Mode: navigate
Sec-Fetch-Site: none
Sec-Fetch-User: ?1
TE: trailers
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:140.0) "Gecko/20100101 Firefox/140.0
x-request-id: [X-Request-ID]
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "points": [
      {
        "ma110": 93465.40,
        "ma350mu2": 166262.31,
        "price": 105464.84,
        "timestamp": "1749945600000"
      },
      ...
      {
        "ma110": 98997.22,
        "ma350mu2": 173280.53,
        "price": 117432.20,
        "timestamp": "1752364800000"
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-15T17:38:17.811Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "1",
    "credit_count": 0
  }
}
```

## Bitcoin Rainbow Price Chart Indicator (BRPC)

Request URL with curl:

```text
GET /data-api/v3/market-cycles/rainbow?range=30d&convertId=2781 HTTP/2

Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: en-US,en;q=0.5
Cache-Control: no-cache
Origin: https://coinmarketcap.com/
Platform: web
Priority: u=0, i
Referer: https://coinmarketcap.com/
Sec-Fetch-Dest: document
Sec-Fetch-Mode: navigate
Sec-Fetch-Site: none
Sec-Fetch-User: ?1
TE: trailers
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:140.0) "Gecko/20100101 Firefox/140.0
x-request-id: [X-Request-ID]
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "points": [
      {
        "layers": [
          51501.30,
          68633.77,
          93286.93,
          128064.28,
          172886.78,
          233397.16,
          320653.62,
          441506.01,
          592703.28,
          806250.47
        ],
        "btcUsdPrice": 105464.84,
        "timestamp": "1749945600000"
      },
      ...
      {
        "layers": [
          53099.32,
          70763.39,
          96181.51,
          132037.96,
          178251.25,
          240639.18,
          330603.10,
          455205.40,
          611094.13,
          831267.44
        ],
        "timestamp": "1752537600000"
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-15T17:43:15.742Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "2",
    "credit_count": 0
  }
}
```