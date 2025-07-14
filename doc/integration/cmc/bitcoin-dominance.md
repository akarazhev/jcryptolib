# Bitcoin Dominance

Request URL with curl:
```bash
curl 'https://api.coinmarketcap.com/data-api/v3/global-metrics/dominance/chart?range=all' \
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
  -H 'x-request-id: 7b9f18227481403090a884fae86df26d'
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
          94.172624726753928500,
          0E-18,
          5.827375273246071500
        ],
        "timestamp": "1367193600"
      },
      ...
      {
        "dominance": [
          63.56190000,
          9.65310000,
          26.78500000
        ],
        "timestamp": "1752518100"
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-14T18:38:34.065Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "3",
    "credit_count": 0
  }
}
```