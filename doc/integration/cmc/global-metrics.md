# Global Metrics

API endpoints for global aggregate market data. This category currently includes 2 endpoints:
- /v1/global-metrics/quotes/latest - Latest global metrics
- /v1/global-metrics/quotes/historical - Historical global metrics

## Latest CMC Crypto Fear and Greed Index (GML)

Request API with headers:

```text
GET /v1/global-metrics/quotes/latest?convert_id=2781 HTTP/3

Accept: application/json
X-CMC_PRO_API_KEY: API_KEY
```

The response is a JSON object with the following structure:

```json
{
  "status": {
    "timestamp": "2025-07-26T13:21:59.910Z",
    "error_code": 0,
    "error_message": null,
    "elapsed": 13,
    "credit_count": 1,
    "notice": null
  },
  "data": {
    "active_cryptocurrencies": 9460,
    "total_cryptocurrencies": 35426,
    "active_market_pairs": 106179,
    "active_exchanges": 835,
    "total_exchanges": 10769,
    "eth_dominance": 11.64880877455,
    "btc_dominance": 60.551289841446,
    "eth_dominance_yesterday": 11.72323751,
    "btc_dominance_yesterday": 60.49266896,
    "eth_dominance_24h_percentage_change": -0.07442873545,
    "btc_dominance_24h_percentage_change": 0.058620881446,
    "defi_volume_24h": 4.031332411725151E10,
    "defi_volume_24h_reported": 8.851474601194867E10,
    "defi_market_cap": 1.13364790849146E11,
    "defi_24h_percentage_change": -16.169850370142,
    "stablecoin_volume_24h": 1.4449371509541577E11,
    "stablecoin_volume_24h_reported": 7.274370225908739E11,
    "stablecoin_market_cap": 2.4698011342198828E11,
    "stablecoin_24h_percentage_change": -33.88418278661,
    "derivatives_volume_24h": 1.4438367955931663E12,
    "derivatives_volume_24h_reported": 1.4438367955931663E12,
    "derivatives_24h_percentage_change": -33.445630934268,
    "total_crypto_dex_currencies": 18847525,
    "today_incremental_crypto_number": 0,
    "past_24h_incremental_crypto_number": 26398,
    "past_7d_incremental_crypto_number": 180331,
    "past_30d_incremental_crypto_number": 1153760,
    "today_change_percent": 0.021965266752,
    "tracked_yearly_number": {
      "maxIncrementalNumber": 184087,
      "minIncrementalNumber": 4140,
      "maxIncrementalDate": "2025-04-17T00:00:00.000Z",
      "minIncrementalDate": "2025-07-26T00:00:00.000Z"
    },
    "quote": {
      "2781": {
        "total_market_cap": 3.885178841234972E12,
        "total_volume_24h": 1.5220378513907E11,
        "total_volume_24h_reported": 7.4464865773788E11,
        "altcoin_volume_24h": 8.886377132498178E10,
        "altcoin_volume_24h_reported": 5.1665678168553345E11,
        "altcoin_market_cap": 1.5326529402202395E12,
        "defi_volume_24h": 4.031332411725151E10,
        "defi_volume_24h_reported": 8.851474601194867E10,
        "defi_24h_percentage_change": -16.169850370142,
        "defi_market_cap": 1.13364790849146E11,
        "stablecoin_volume_24h": 1.4449371509541577E11,
        "stablecoin_volume_24h_reported": 7.274370225908739E11,
        "stablecoin_24h_percentage_change": -33.88418278661,
        "stablecoin_market_cap": 2.4698011342198828E11,
        "derivatives_volume_24h": 1.4438367955931663E12,
        "derivatives_volume_24h_reported": 1.4438367955931663E12,
        "derivatives_24h_percentage_change": -33.445630934268,
        "total_market_cap_yesterday": 3.8194882255983643E12,
        "total_volume_24h_yesterday": 2.2855243250888E11,
        "total_market_cap_yesterday_percentage_change": 1.7198800403767933,
        "total_volume_24h_yesterday_percentage_change": -33.40530946518962,
        "last_updated": "2025-07-26T13:19:59.999Z"
      }
    },
    "last_updated": "2025-07-26T13:19:59.999Z"
  }
}
```