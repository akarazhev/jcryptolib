# CMC Crypto Fear and Greed Index

Request URL with curl:
```bash
curl 'https://api.coinmarketcap.com/data-api/v3/fear-greed/chart?start=1367193600&end=1752526800&convertId=2781' \
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
  -H 'x-request-id: b166b93a1da44a5aad0a12b1cdf0ea6b'
```

The response is a JSON object with the following structure:
```json
{
  "data": {
    "dataList": [
      {
        "score": 59,
        "name": "Neutral",
        "timestamp": "1687996800",
        "btcPrice": "30086.19",
        "btcVolume": "13180860821.04"
      },
      ...
      {
        "score": 70,
        "name": "Greed",
        "timestamp": "1752515590",
        "btcPrice": "119781.41",
        "btcVolume": "178306444512.13"
      }
    ],
    "dialConfig": [
      {
        "start": 0,
        "end": 20,
        "name": "Extreme fear"
      },
      {
        "start": 20,
        "end": 40,
        "name": "Fear"
      },
      {
        "start": 40,
        "end": 60,
        "name": "Neutral"
      },
      {
        "start": 60,
        "end": 80,
        "name": "Greed"
      },
      {
        "start": 80,
        "end": 100,
        "name": "Extreme greed"
      }
    ],
    "historicalValues": {
      "now": {
        "score": 70,
        "name": "Greed",
        "timestamp": "1752515590"
      },
      "yesterday": {
        "score": 68,
        "name": "Greed",
        "timestamp": "1752364800"
      },
      "lastWeek": {
        "score": 52,
        "name": "Neutral",
        "timestamp": "1751846400"
      },
      "lastMonth": {
        "score": 52,
        "name": "Neutral",
        "timestamp": "1749859200"
      },
      "yearlyHigh": {
        "score": 88,
        "name": "Extreme greed",
        "timestamp": "1732147200"
      },
      "yearlyLow": {
        "score": 15,
        "name": "Extreme fear",
        "timestamp": "1741651200"
      }
    }
  },
  "status": {
    "timestamp": "2025-07-14T18:12:03.242Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "2",
    "credit_count": 0
  }
}
```