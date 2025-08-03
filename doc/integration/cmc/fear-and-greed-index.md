# CMC Crypto Fear and Greed

API endpoints for cryptocurrencies. This category currently includes 2 endpoints:

- /v3/fear-and-greed/latest - Latest CMC Crypto Fear and Greed Index
- /v3/fear-and-greed/historical - Historical CMC Crypto Fear and Greed Index

## Latest CMC Crypto Fear and Greed Index Api Pro (FG_API_PRO_L)

Request API with headers:

```text
GET /v3/fear-and-greed/latest HTTP/3

Accept: application/json
X-CMC_PRO_API_KEY: API_KEY
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "value": 64,
    "update_time": "2025-07-26T14:53:10.028Z",
    "value_classification": "Greed"
  },
  "status": {
    "timestamp": "2025-07-26T15:04:05.498Z",
    "error_code": "0",
    "error_message": "",
    "elapsed": 2,
    "credit_count": 1
  }
}
```

List of parameters to parse:

- `value`: the value of the index
- `update_time`: the timestamp of the update
- `value_classification`: the classification of the index

## Historical CMC Crypto Fear and Greed Index Api Pro (FG_API_PRO_H)

Request API with headers:

```text
GET /v3/fear-and-greed/historical?start=1&limit=500 HTTP/3

Accept: application/json
X-CMC_PRO_API_KEY: API_KEY
```

The response is a JSON object with the following structure:

```json
{
  "data": [
    {
      "timestamp": "1753401600",
      "value": 66,
      "value_classification": "Greed"
    },
    ...
    {
      "timestamp": "1710288000",
      "value": 90,
      "value_classification": "Extreme greed"
    }
  ],
  "status": {
    "timestamp": "2025-07-26T20:43:41.845Z",
    "error_code": "0",
    "error_message": "",
    "elapsed": 5,
    "credit_count": 1
  }
}
```

List of parameters to parse:

- `timestamp`: the timestamp of the data point
- `value`: the value of the index
- `value_classification`: the classification of the index

## CMC Crypto Fear and Greed Index (FG)

Request URL with curl:

```text
GET /data-api/v3/fear-greed/chart?start=1750007940&end=1752599940&convertId=2781 HTTP/2

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

List of parameters to parse:

- `dataList`: an array of objects with the following structure:
    - `score`: the score of the data point
    - `name`: the name of the data point
    - `timestamp`: the timestamp of the data point
    - `btcPrice`: the BTC price of the data point
    - `btcVolume`: the BTC volume of the data point
- `dialConfig`: an array of objects with the following structure:
    - `start`: the start of the dial
    - `end`: the end of the dial
    - `name`: the name of the dial
- `historicalValues`: an object with the following structure:
    - `now`: an object with the following structure:
        - `score`: the score of the data point
        - `name`: the name of the data point
        - `timestamp`: the timestamp of the data point
    - `yesterday`: an object with the following structure:
        - `score`: the score of the data point
        - `name`: the name of the data point
        - `timestamp`: the timestamp of the data point
    - `lastWeek`: an object with the following structure:
        - `score`: the score of the data point
        - `name`: the name of the data point
        - `timestamp`: the timestamp of the data point
    - `lastMonth`: an object with the following structure:
        - `score`: the score of the data point
        - `name`: the name of the data point
        - `timestamp`: the timestamp of the data point
    - `yearlyHigh`: an object with the following structure:
        - `score`: the score of the data point
        - `name`: the name of the data point
        - `timestamp`: the timestamp of the data point
    - `yearlyLow`: an object with the following structure:
        - `score`: the score of the data point
        - `name`: the name of the data point
        - `timestamp`: the timestamp of the data point