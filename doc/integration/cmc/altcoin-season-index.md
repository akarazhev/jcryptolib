# Altcoin Season Index

Request URL with curl:
```bash
curl 'https://api.coinmarketcap.com/data-api/v3/altcoin-season/chart?start=1744741380&end=1752517380&convertId=2781' \
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
  -H 'x-request-id: 00552d7dce444ef9a8475c33177ade7f'
```

The response is a JSON object with the following structure:
```json
{
  "data": {
    "points": [
      {
        "name": "Bitcoin Season",
        "altcoinIndex": "15",
        "altcoinMarketcap": "977153699477.37",
        "timestamp": "1744761600"
      },
      ...
      {
        "name": "",
        "altcoinIndex": "31",
        "altcoinMarketcap": "1361767030895.50",
        "timestamp": "1752517101"
      }
    ],
    "historicalValues": {
      "now": {
        "name": "",
        "altcoinIndex": "31",
        "altcoinMarketcap": "1361767030895.50",
        "timestamp": "1752517101"
      },
      "yesterday": {
        "name": "",
        "altcoinIndex": "29",
        "altcoinMarketcap": "1323262354393.94",
        "timestamp": "1752364800"
      },
      "lastWeek": {
        "name": "",
        "altcoinIndex": "26",
        "altcoinMarketcap": "1196432472712.21",
        "timestamp": "1751846400"
      },
      "lastMonth": {
        "name": "",
        "altcoinIndex": "27",
        "altcoinMarketcap": "1194283064489.16",
        "timestamp": "1749859200"
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
        "altcoinMarketcap": "1079193710003.17",
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
        "id": 35491,
        "name": "MemeCore",
        "symbol": "M",
        "slug": "memecore",
        "percentChange": 554.99845670
      },
      ...
      {
        "id": 7326,
        "name": "DeXe",
        "symbol": "DEXE",
        "slug": "dexe",
        "percentChange": -46.61261523
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-14T18:23:00.597Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "1",
    "credit_count": 0
  }
}
```