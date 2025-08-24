# Altcoin Season Index (ASI)

Request URL with curl:

```text
GET /data-api/v3/altcoin-season/chart?start=1751995320&end=1752600120&convertId=2781 HTTP/2

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

List of parameters to parse:

- `points`: an array of objects with the following structure:
    - `name`: the name of the altcoin
    - `altcoinIndex`: the altcoin index
    - `altcoinMarketcap`: the altcoin marketcap
    - `timestamp`: the timestamp of the data point
- `historicalValues`: an object with the following structure:
    - `now`: the current altcoin index
        - `name`: the name of the altcoin
        - `altcoinIndex`: the altcoin index
        - `altcoinMarketcap`: the altcoin marketcap
        - `timestamp`: the timestamp of the data point
    - `yesterday`: the altcoin index yesterday
        - `name`: the name of the altcoin
        - `altcoinIndex`: the altcoin index
        - `altcoinMarketcap`: the altcoin marketcap
        - `timestamp`: the timestamp of the data point
    - `lastWeek`: the altcoin index last week
        - `name`: the name of the altcoin
        - `altcoinIndex`: the altcoin index
        - `altcoinMarketcap`: the altcoin marketcap
        - `timestamp`: the timestamp of the data point
    - `lastMonth`: the altcoin index last month
        - `name`: the name of the altcoin
        - `altcoinIndex`: the altcoin index
        - `altcoinMarketcap`: the altcoin marketcap
        - `timestamp`: the timestamp of the data point
    - `yearlyHigh`: the altcoin index yearly high
        - `name`: the name of the altcoin
        - `altcoinIndex`: the altcoin index
        - `altcoinMarketcap`: the altcoin marketcap
        - `timestamp`: the timestamp of the data point
    - `yearlyLow`: the altcoin index yearly low
        - `name`: the name of the altcoin
        - `altcoinIndex`: the altcoin index
        - `altcoinMarketcap`: the altcoin marketcap
        - `timestamp`: the timestamp of the data point
- `dialConfigs`: an array of objects with the following structure:
    - `start`: the start of the dial
    - `end`: the end of the dial
    - `name`: the name of the dial