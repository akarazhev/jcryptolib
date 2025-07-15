# Bitcoin Dominance

## Bitcoin Dominance Overview (BDO)

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v3/global-metrics/dominance/overview' \
  -H 'accept: application/json, text/plain, */*' \
  -H 'accept-language: en-US,en;q=0.9' \
  -H 'cache-control: no-cache' \
  -H 'origin: https://coinmarketcap.com' \
  -H 'platform: web' \
  -H 'priority: u=1, i' \
  -H 'referer: https://coinmarketcap.com/' \
  -H 'sec-ch-ua: "Not)A;Brand";v="8", "Chromium";v="138", "Google Chrome";v="138"' \
  -H 'sec-ch-ua-mobile: ?0' \
  -H 'sec-ch-ua-platform: "macOS"' \
  -H 'sec-fetch-dest: empty' \
  -H 'sec-fetch-mode: cors' \
  -H 'sec-fetch-site: same-site' \
  -H 'user-agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36' \
  -H 'x-request-id: e803791c11b04044a3c56f72e47bea4a'
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

## Bitcoin Dominance (BD)

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v3/global-metrics/dominance/chart?range=30d' \
  -H 'accept: application/json, text/plain, */*' \
  -H 'accept-language: en-US,en;q=0.9' \
  -H 'cache-control: no-cache' \
  -H 'origin: https://coinmarketcap.com' \
  -H 'platform: web' \
  -H 'priority: u=1, i' \
  -H 'referer: https://coinmarketcap.com/' \
  -H 'sec-ch-ua: "Not)A;Brand";v="8", "Chromium";v="138", "Google Chrome";v="138"' \
  -H 'sec-ch-ua-mobile: ?0' \
  -H 'sec-ch-ua-platform: "macOS"' \
  -H 'sec-fetch-dest: empty' \
  -H 'sec-fetch-mode: cors' \
  -H 'sec-fetch-site: same-site' \
  -H 'user-agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36' \
  -H 'x-request-id: 05eef0ce4b364bdf9a2e2ed2842c938d'
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