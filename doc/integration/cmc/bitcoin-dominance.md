# Bitcoin Dominance

## Bitcoin Dominance Overview (BDO)

Request URL with curl:

```text
GET /data-api/v3/global-metrics/dominance/overview HTTP/2
  
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
    "configs": [
      {
        "id": 1,
        "name": "Bitcoin",
        "symbol": "BTC"
      },
      {
        "id": 1027,
        "name": "Ethereum",
        "symbol": "ETH"
      },
      {
        "name": "Others"
      }
    ],
    "dominance": [
      {
        "mcChangePct30d": -0.77006279427000,
        "mcProportion": 63.10543720573000
      },
      {
        "mcChangePct30d": 0.61538916693200,
        "mcProportion": 9.97618916693200
      },
      {
        "mcChangePct30d": 0.15467362733800,
        "mcProportion": 26.91837362733800
      }
    ],
    "dominanceLastMonth": [
      {
        "mcProportion": 64.0106
      },
      {
        "mcProportion": 9.3358
      },
      {
        "mcProportion": 26.6536
      }
    ],
    "dominanceLastWeek": [
      {
        "mcProportion": 64.4749
      },
      {
        "mcProportion": 9.189
      },
      {
        "mcProportion": 26.3361
      }
    ],
    "dominanceYearlyHigh": [
      {
        "timestamp": "1750982400",
        "mcProportion": 65.1177
      },
      {
        "timestamp": "1750982400",
        "mcProportion": 8.9298
      },
      {
        "timestamp": "1750982400",
        "mcProportion": 25.9525
      }
    ],
    "dominanceYearlyLow": [
      {
        "timestamp": "1721001600",
        "mcProportion": 53.6361
      },
      {
        "timestamp": "1721001600",
        "mcProportion": 17.4509
      },
      {
        "timestamp": "1721001600",
        "mcProportion": 28.9130
      }
    ],
    "dominanceYesterday": [
      {
        "mcProportion": 63.7605
      },
      {
        "mcProportion": 9.6578
      },
      {
        "mcProportion": 26.5817
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-15T17:26:01.489Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "2",
    "credit_count": 0
  }
}
```

List of parameter to parse:

- `configs`: an array of objects with the following structure:
  - `name`: the name of the altcoin
- `dominance`: an array of objects with the following structure:
  - `mcChangePct30d`: the market cap change percentage in the last 30 days
  - `mcProportion`: the market cap proportion
- `dominanceLastMonth`: an array of objects with the following structure:
  - `mcProportion`: the market cap proportion
- `dominanceLastWeek`: an array of objects with the following structure:
  - `mcProportion`: the market cap proportion
- `dominanceYearlyHigh`: an array of objects with the following structure:
  - `timestamp`: the timestamp of the data point
  - `mcProportion`: the market cap proportion
- `dominanceYearlyLow`: an array of objects with the following structure:
  - `timestamp`: the timestamp of the data point
  - `mcProportion`: the market cap proportion
- `dominanceYesterday`: an array of objects with the following structure:
  - `mcProportion`: the market cap proportion

## Bitcoin Dominance (BD)

Request URL with curl:

```text
GET /data-api/v3/global-metrics/dominance/chart?range=30d HTTP/2

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
    "configs": [
      {
        "name": "Bitcoin Dominance"
      },
      {
        "name": "Ethereum Dominance"
      },
      {
        "name": "Others"
      }
    ],
    "points": [
      {
        "dominance": [
          64.015646085693666200,
          9.335034658280523900,
          26.649319256025809900
        ],
        "timestamp": "1749945600"
      },
      ...
      {
        "dominance": [
          63.15980000,
          9.98150000,
          26.85870000
        ],
        "timestamp": "1752600000"
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-15T17:28:21.468Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "1",
    "credit_count": 0
  }
}
```

List of parameter to parse:

- `configs`: an array of objects with the following structure:
  - `name`: the name of the altcoin
- `points`: an array of objects with the following structure:
  - `dominance`: an array of market cap proportions
  - `timestamp`: the timestamp of the data point