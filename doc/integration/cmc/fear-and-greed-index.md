# CMC Crypto Fear and Greed Index (FG)

Request URL with curl:

```bash
curl 'https://api.coinmarketcap.com/data-api/v3/fear-greed/chart?start=1750007940&end=1752599940&convertId=2781' \
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
  -H 'x-request-id: 300f52d212274aeeb404cdd8f09b0d2f'
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "dataList": [
      {
        "score": 51,
        "name": "Neutral",
        "timestamp": "1750032000",
        "btcPrice": "105555.59",
        "btcVolume": "50366626944.57"
      },
      ...
      {
        "score": 70,
        "name": "Greed",
        "timestamp": "1752599290",
        "btcPrice": "117252.49",
        "btcVolume": "94531413434.83"
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
        "timestamp": "1752599290"
      },
      "yesterday": {
        "score": 70,
        "name": "Greed",
        "timestamp": "1752451200"
      },
      "lastWeek": {
        "score": 50,
        "name": "Neutral",
        "timestamp": "1751932800"
      },
      "lastMonth": {
        "score": 50,
        "name": "Neutral",
        "timestamp": "1749945600"
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
    "timestamp": "2025-07-15T17:19:10.609Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "1",
    "credit_count": 0
  }
}
```