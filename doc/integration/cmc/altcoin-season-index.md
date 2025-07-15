# Altcoin Season Index (AS)

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v3/altcoin-season/chart?start=1751995320&end=1752600120&convertId=2781' \
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
  -H 'x-request-id: 3d3c8f13d8c143eda1d7adbcb30eb746'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "points": [
      {
        "name": "",
        "altcoinIndex": "28",
        "altcoinMarketcap": "1205096162295.70",
        "timestamp": "1752019200"
      },
      ...
      {
        "name": "",
        "altcoinIndex": "35",
        "altcoinMarketcap": "1363375291866.42",
        "timestamp": "1752600121"
      }
    ],
    "historicalValues": {
      "now": {
        "name": "",
        "altcoinIndex": "35",
        "altcoinMarketcap": "1363375291866.42",
        "timestamp": "1752600121"
      },
      "yesterday": {
        "name": "",
        "altcoinIndex": "32",
        "altcoinMarketcap": "1346736387703.65",
        "timestamp": "1752451200"
      },
      "lastWeek": {
        "name": "Bitcoin Season",
        "altcoinIndex": "22",
        "altcoinMarketcap": "1186712659110.31",
        "timestamp": "1751932800"
      },
      "lastMonth": {
        "name": "Bitcoin Season",
        "altcoinIndex": "25",
        "altcoinMarketcap": "1178789747839.10",
        "timestamp": "1749945600"
      },
      "yearlyHigh": {
        "name": "Altcoin Season",
        "altcoinIndex": "87",
        "altcoinMarketcap": "0",
        "timestamp": "1733270400"
      },
      "yearlyLow": {
        "name": "Bitcoin Season",
        "altcoinIndex": "12",
        "altcoinMarketcap": "0",
        "timestamp": "1745625600"
      }
    },
    "dialConfigs": [
      {
        "start": 0,
        "end": 25,
        "name": "Bitcoin Season"
      },
      {
        "start": 26,
        "end": 74,
        "name": ""
      },
      {
        "start": 75,
        "end": 100,
        "name": "Altcoin Season"
      }
    ],
    "topCryptos": [
      {
        "id": 34466,
        "name": "Pudgy Penguins",
        "symbol": "PENGU",
        "slug": "pudgy-penguins",
        "percentChange": 662.83147386
      },
      ...
      {
        "id": 7326,
        "name": "DeXe",
        "symbol": "DEXE",
        "slug": "dexe",
        "percentChange": -45.67619750
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-15T17:22:01.812Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "32",
    "credit_count": 0
  }
}
```