# CMC Altcoin Season Index

The CMC Altcoin Season Index page provides real-time insights into whether the cryptocurrency market is currently in 
Altcoin Season, based on the performance of the top 100 altcoins relative to Bitcoin over the past 90 days, 
with detailed charts and metrics for tracking market trends and altcoin dominance.

Request URL with curl:
```bash
curl 'https://api.coinmarketcap.com/data-api/v3/altcoin-season/chart?start=1751906520&end=1752511320&convertId=2781' \
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
  -H 'x-request-id: a8b8b074fcd74a62a4ba56e7f52070a2'
```
The response is a JSON object with the following structure:
```json
{
  "data": {
    "points": [
      {
        "name": "Bitcoin Season",
        "altcoinIndex": "22",
        "altcoinMarketcap": "1186712659110.31",
        "timestamp": "1751932800"
      },
      {
        "name": "",
        "altcoinIndex": "28",
        "altcoinMarketcap": "1205096162295.70",
        "timestamp": "1752019200"
      },
      {
        "name": "",
        "altcoinIndex": "30",
        "altcoinMarketcap": "1248645269979.66",
        "timestamp": "1752105600"
      },
      {
        "name": "",
        "altcoinIndex": "28",
        "altcoinMarketcap": "1306629291502.13",
        "timestamp": "1752192000"
      },
      {
        "name": "",
        "altcoinIndex": "27",
        "altcoinMarketcap": "1327826391037.82",
        "timestamp": "1752278400"
      },
      {
        "name": "",
        "altcoinIndex": "29",
        "altcoinMarketcap": "1323262354393.94",
        "timestamp": "1752364800"
      },
      {
        "name": "",
        "altcoinIndex": "32",
        "altcoinMarketcap": "1346736387703.65",
        "timestamp": "1752451200"
      },
      {
        "name": "",
        "altcoinIndex": "33",
        "altcoinMarketcap": "1366412672436.80",
        "timestamp": "1752511150"
      }
    ],
    "historicalValues": {
      "now": {
        "name": "",
        "altcoinIndex": "33",
        "altcoinMarketcap": "1366412672436.80",
        "timestamp": "1752511150"
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
        "id": 35491,
        "name": "MemeCore",
        "symbol": "M",
        "slug": "memecore",
        "percentChange": 597.85020825
      },
      {
        "id": 34466,
        "name": "Pudgy Penguins",
        "symbol": "PENGU",
        "slug": "pudgy-penguins",
        "percentChange": 490.31544672
      },
      {
        "id": 27659,
        "name": "Mog Coin",
        "symbol": "MOG",
        "slug": "mog-coin",
        "percentChange": 275.98288727
      },
      {
        "id": 28081,
        "name": "SPX6900",
        "symbol": "SPX",
        "slug": "spx6900",
        "percentChange": 229.65133745
      },
      {
        "id": 32196,
        "name": "Hyperliquid",
        "symbol": "HYPE",
        "slug": "hyperliquid",
        "percentChange": 203.32420244
      },
      {
        "id": 29420,
        "name": "Virtuals Protocol",
        "symbol": "VIRTUAL",
        "slug": "virtual-protocol",
        "percentChange": 193.59919674
      },
      {
        "id": 28752,
        "name": "dogwifhat",
        "symbol": "WIF",
        "slug": "dogwifhat",
        "percentChange": 154.67110561
      },
      {
        "id": 7278,
        "name": "Aave",
        "symbol": "AAVE",
        "slug": "aave",
        "percentChange": 133.29810583
      },
      {
        "id": 33391,
        "name": "DeepBook Protocol",
        "symbol": "DEEP",
        "slug": "deepbook-protocol",
        "percentChange": 126.51732159
      },
      {
        "id": 23095,
        "name": "Bonk",
        "symbol": "BONK",
        "slug": "bonk1",
        "percentChange": 115.29730614
      },
      {
        "id": 29270,
        "name": "Aerodrome Finance",
        "symbol": "AERO",
        "slug": "aerodrome-finance",
        "percentChange": 100.35824912
      },
      {
        "id": 512,
        "name": "Stellar",
        "symbol": "XLM",
        "slug": "stellar",
        "percentChange": 93.35210319
      },
      {
        "id": 23149,
        "name": "Sei",
        "symbol": "SEI",
        "slug": "sei",
        "percentChange": 87.42513771
      },
      {
        "id": 1027,
        "name": "Ethereum",
        "symbol": "ETH",
        "slug": "ethereum",
        "percentChange": 86.09436604
      },
      {
        "id": 20947,
        "name": "Sui",
        "symbol": "SUI",
        "slug": "sui",
        "percentChange": 80.60518401
      },
      {
        "id": 10804,
        "name": "FLOKI",
        "symbol": "FLOKI",
        "slug": "floki-inu",
        "percentChange": 77.17032597
      },
      {
        "id": 7083,
        "name": "Uniswap",
        "symbol": "UNI",
        "slug": "uniswap",
        "percentChange": 74.32515835
      },
      {
        "id": 22974,
        "name": "Bittensor",
        "symbol": "TAO",
        "slug": "bittensor",
        "percentChange": 73.80134065
      },
      {
        "id": 24478,
        "name": "Pepe",
        "symbol": "PEPE",
        "slug": "pepe",
        "percentChange": 71.81758831
      },
      {
        "id": 3155,
        "name": "Quant",
        "symbol": "QNT",
        "slug": "quant",
        "percentChange": 70.03049953
      },
      {
        "id": 23635,
        "name": "Four",
        "symbol": "FORM",
        "slug": "binaryx-new",
        "percentChange": 64.20808407
      },
      {
        "id": 328,
        "name": "Monero",
        "symbol": "XMR",
        "slug": "monero",
        "percentChange": 59.94333566
      },
      {
        "id": 13855,
        "name": "Ethereum Name Service",
        "symbol": "ENS",
        "slug": "ethereum-name-service",
        "percentChange": 58.71396095
      },
      {
        "id": 7226,
        "name": "Injective",
        "symbol": "INJ",
        "slug": "injective",
        "percentChange": 58.27697403
      },
      {
        "id": 1831,
        "name": "Bitcoin Cash",
        "symbol": "BCH",
        "slug": "bitcoin-cash",
        "percentChange": 56.38032222
      },
      {
        "id": 3773,
        "name": "Artificial Superintelligence Alliance",
        "symbol": "FET",
        "slug": "artificial-superintelligence-alliance",
        "percentChange": 56.27368842
      },
      {
        "id": 4030,
        "name": "Algorand",
        "symbol": "ALGO",
        "slug": "algorand",
        "percentChange": 55.93380920
      },
      {
        "id": 32880,
        "name": "Kaia",
        "symbol": "KAIA",
        "slug": "kaia",
        "percentChange": 54.63665945
      },
      {
        "id": 33597,
        "name": "Fartcoin",
        "symbol": "FARTCOIN",
        "slug": "fartcoin",
        "percentChange": 51.92218774
      },
      {
        "id": 4642,
        "name": "Hedera",
        "symbol": "HBAR",
        "slug": "hedera",
        "percentChange": 49.11428924
      },
      {
        "id": 1437,
        "name": "Zcash",
        "symbol": "ZEC",
        "slug": "zcash",
        "percentChange": 43.53496402
      },
      {
        "id": 13502,
        "name": "Worldcoin",
        "symbol": "WLD",
        "slug": "worldcoin-org",
        "percentChange": 43.51228117
      },
      {
        "id": 11841,
        "name": "Arbitrum",
        "symbol": "ARB",
        "slug": "arbitrum",
        "percentChange": 42.07884727
      },
      {
        "id": 1,
        "name": "Bitcoin",
        "symbol": "BTC",
        "slug": "bitcoin",
        "percentChange": 41.14289582
      },
      {
        "id": 52,
        "name": "XRP",
        "symbol": "XRP",
        "slug": "xrp",
        "percentChange": 38.57905354
      },
      {
        "id": 1720,
        "name": "IOTA",
        "symbol": "IOTA",
        "slug": "iota",
        "percentChange": 37.76444643
      },
      {
        "id": 33038,
        "name": "Sky",
        "symbol": "SKY",
        "slug": "sky",
        "percentChange": 35.52033709
      },
      {
        "id": 29210,
        "name": "Jupiter",
        "symbol": "JUP",
        "slug": "jupiter-ag",
        "percentChange": 34.25042951
      },
      {
        "id": 4847,
        "name": "Stacks",
        "symbol": "STX",
        "slug": "stacks",
        "percentChange": 33.79445660
      },
      {
        "id": 8526,
        "name": "Raydium",
        "symbol": "RAY",
        "slug": "raydium",
        "percentChange": 30.76360816
      },
      {
        "id": 7186,
        "name": "PancakeSwap",
        "symbol": "CAKE",
        "slug": "pancakeswap",
        "percentChange": 30.53970086
      },
      {
        "id": 2011,
        "name": "Tezos",
        "symbol": "XTZ",
        "slug": "tezos",
        "percentChange": 30.45584145
      },
      {
        "id": 9481,
        "name": "Pendle",
        "symbol": "PENDLE",
        "slug": "pendle",
        "percentChange": 29.74760491
      },
      {
        "id": 1975,
        "name": "Chainlink",
        "symbol": "LINK",
        "slug": "chainlink",
        "percentChange": 29.56107745
      },
      {
        "id": 2694,
        "name": "Nexo",
        "symbol": "NEXO",
        "slug": "nexo",
        "percentChange": 29.47970079
      },
      {
        "id": 3635,
        "name": "Cronos",
        "symbol": "CRO",
        "slug": "cronos",
        "percentChange": 29.19944465
      },
      {
        "id": 10603,
        "name": "Immutable",
        "symbol": "IMX",
        "slug": "immutable-x",
        "percentChange": 29.05236874
      },
      {
        "id": 6719,
        "name": "The Graph",
        "symbol": "GRT",
        "slug": "the-graph",
        "percentChange": 28.18738200
      },
      {
        "id": 74,
        "name": "Dogecoin",
        "symbol": "DOGE",
        "slug": "dogecoin",
        "percentChange": 27.89135625
      },
      {
        "id": 28321,
        "name": "POL (prev. MATIC)",
        "symbol": "POL",
        "slug": "polygon-ecosystem-token",
        "percentChange": 27.11515696
      },
      {
        "id": 2,
        "name": "Litecoin",
        "symbol": "LTC",
        "slug": "litecoin",
        "percentChange": 27.10043491
      },
      {
        "id": 6535,
        "name": "NEAR Protocol",
        "symbol": "NEAR",
        "slug": "near-protocol",
        "percentChange": 26.78774879
      },
      {
        "id": 8000,
        "name": "Lido DAO",
        "symbol": "LDO",
        "slug": "lido-dao",
        "percentChange": 26.75547774
      },
      {
        "id": 5426,
        "name": "Solana",
        "symbol": "SOL",
        "slug": "solana",
        "percentChange": 26.48580465
      },
      {
        "id": 1321,
        "name": "Ethereum Classic",
        "symbol": "ETC",
        "slug": "ethereum-classic",
        "percentChange": 24.64955944
      },
      {
        "id": 6210,
        "name": "The Sandbox",
        "symbol": "SAND",
        "slug": "the-sandbox",
        "percentChange": 23.58752178
      },
      {
        "id": 30171,
        "name": "Ethena",
        "symbol": "ENA",
        "slug": "ethena",
        "percentChange": 21.62966429
      },
      {
        "id": 1958,
        "name": "TRON",
        "symbol": "TRX",
        "slug": "tron",
        "percentChange": 21.39647890
      },
      {
        "id": 35336,
        "name": "OFFICIAL TRUMP",
        "symbol": "TRUMP",
        "slug": "official-trump",
        "percentChange": 20.08715059
      },
      {
        "id": 7080,
        "name": "Gala",
        "symbol": "GALA",
        "slug": "gala",
        "percentChange": 19.53732459
      },
      {
        "id": 2416,
        "name": "Theta Network",
        "symbol": "THETA",
        "slug": "theta-network",
        "percentChange": 19.49319266
      },
      {
        "id": 1839,
        "name": "BNB",
        "symbol": "BNB",
        "slug": "bnb",
        "percentChange": 18.51303063
      },
      {
        "id": 2010,
        "name": "Cardano",
        "symbol": "ADA",
        "slug": "cardano",
        "percentChange": 18.48550651
      },
      {
        "id": 28541,
        "name": "Jito",
        "symbol": "JTO",
        "slug": "jito",
        "percentChange": 18.01888356
      },
      {
        "id": 6538,
        "name": "Curve DAO Token",
        "symbol": "CRV",
        "slug": "curve-dao-token",
        "percentChange": 16.94723251
      },
      {
        "id": 16086,
        "name": "BitTorrent [New]",
        "symbol": "BTT",
        "slug": "bittorrent-new",
        "percentChange": 14.54808518
      },
      {
        "id": 1966,
        "name": "Decentraland",
        "symbol": "MANA",
        "slug": "decentraland",
        "percentChange": 14.16891906
      },
      {
        "id": 3794,
        "name": "Cosmos",
        "symbol": "ATOM",
        "slug": "cosmos",
        "percentChange": 13.59921109
      },
      {
        "id": 8916,
        "name": "Internet Computer",
        "symbol": "ICP",
        "slug": "internet-computer",
        "percentChange": 12.79092496
      },
      {
        "id": 5994,
        "name": "Shiba Inu",
        "symbol": "SHIB",
        "slug": "shiba-inu",
        "percentChange": 12.55592558
      },
      {
        "id": 4558,
        "name": "Flow",
        "symbol": "FLOW",
        "slug": "flow",
        "percentChange": 12.24890973
      },
      {
        "id": 20396,
        "name": "Kaspa",
        "symbol": "KAS",
        "slug": "kaspa",
        "percentChange": 12.06158833
      },
      {
        "id": 2634,
        "name": "XDC Network",
        "symbol": "XDC",
        "slug": "xdc-network",
        "percentChange": 11.75103407
      },
      {
        "id": 6636,
        "name": "Polkadot",
        "symbol": "DOT",
        "slug": "polkadot-new",
        "percentChange": 11.37016750
      },
      {
        "id": 2087,
        "name": "KuCoin Token",
        "symbol": "KCS",
        "slug": "kucoin-token",
        "percentChange": 10.73880015
      },
      {
        "id": 5805,
        "name": "Avalanche",
        "symbol": "AVAX",
        "slug": "avalanche",
        "percentChange": 10.14675483
      },
      {
        "id": 7950,
        "name": "Flare",
        "symbol": "FLR",
        "slug": "flare",
        "percentChange": 8.90622974
      },
      {
        "id": 3077,
        "name": "VeChain",
        "symbol": "VET",
        "slug": "vechain",
        "percentChange": 7.47291627
      },
      {
        "id": 21794,
        "name": "Aptos",
        "symbol": "APT",
        "slug": "aptos",
        "percentChange": 7.19000478
      },
      {
        "id": 21159,
        "name": "Ondo",
        "symbol": "ONDO",
        "slug": "ondo-finance",
        "percentChange": 6.49673793
      },
      {
        "id": 8425,
        "name": "JasmyCoin",
        "symbol": "JASMY",
        "slug": "jasmy",
        "percentChange": 6.07368331
      },
      {
        "id": 2280,
        "name": "Filecoin",
        "symbol": "FIL",
        "slug": "filecoin",
        "percentChange": 5.83079636
      },
      {
        "id": 35626,
        "name": "Story",
        "symbol": "IP",
        "slug": "story-protocol",
        "percentChange": 4.50854843
      },
      {
        "id": 5176,
        "name": "Tether Gold",
        "symbol": "XAUt",
        "slug": "tether-gold",
        "percentChange": 3.55081111
      },
      {
        "id": 4705,
        "name": "PAX Gold",
        "symbol": "PAXG",
        "slug": "pax-gold",
        "percentChange": 3.52234683
      },
      {
        "id": 11840,
        "name": "Optimism",
        "symbol": "OP",
        "slug": "optimism-ethereum",
        "percentChange": 2.82410870
      },
      {
        "id": 11092,
        "name": "Bitget Token",
        "symbol": "BGB",
        "slug": "bitget-token-new",
        "percentChange": 2.41555828
      },
      {
        "id": 11419,
        "name": "Toncoin",
        "symbol": "TON",
        "slug": "toncoin",
        "percentChange": 2.37515066
      },
      {
        "id": 27075,
        "name": "Mantle",
        "symbol": "MNT",
        "slug": "mantle",
        "percentChange": 0.47572588
      },
      {
        "id": 5690,
        "name": "Render",
        "symbol": "RENDER",
        "slug": "render",
        "percentChange": -2.76406116
      },
      {
        "id": 3957,
        "name": "UNUS SED LEO",
        "symbol": "LEO",
        "slug": "unus-sed-leo",
        "percentChange": -3.74853598
      },
      {
        "id": 18679,
        "name": "Onyxcoin",
        "symbol": "XCN",
        "slug": "onyxcoin",
        "percentChange": -5.76893567
      },
      {
        "id": 3897,
        "name": "OKB",
        "symbol": "OKB",
        "slug": "okb",
        "percentChange": -6.82888944
      },
      {
        "id": 28177,
        "name": "Pyth Network",
        "symbol": "PYTH",
        "slug": "pyth-network",
        "percentChange": -8.75034158
      },
      {
        "id": 22861,
        "name": "Celestia",
        "symbol": "TIA",
        "slug": "celestia",
        "percentChange": -22.09784291
      },
      {
        "id": 36462,
        "name": "Vaulta",
        "symbol": "A",
        "slug": "vaulta",
        "percentChange": -28.73504654
      },
      {
        "id": 32684,
        "name": "Sonic",
        "symbol": "S",
        "slug": "sonic",
        "percentChange": -29.64196270
      },
      {
        "id": 4269,
        "name": "GateToken",
        "symbol": "GT",
        "slug": "gatetoken",
        "percentChange": -30.02068680
      },
      {
        "id": 35697,
        "name": "Pi",
        "symbol": "PI",
        "slug": "pi",
        "percentChange": -30.31780446
      },
      {
        "id": 7326,
        "name": "DeXe",
        "symbol": "DEXE",
        "slug": "dexe",
        "percentChange": -47.38370572
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-14T16:42:57.400Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "2",
    "credit_count": 0
  }
}
```