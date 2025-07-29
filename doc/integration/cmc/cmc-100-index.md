# CMC100 Index

API endpoints for CoinMarketCap100 Index. This category currently includes 2 endpoints:

- /v3/index/cmc100-latest - Latest CoinMarketCap 100 Index
- /v3/index/cmc100-historical - Historical CoinMarketCap 100 Index

## CoinMarketCap 100 Index Latest (CMC100L)

Request API with headers:

```text
GET /v3/index/cmc100-latest HTTP/3

Accept: application/json
X-CMC_PRO_API_KEY: API_KEY
```

The response is a JSON object with the following structure:

```json
{
  "data": {
    "value": 240.28,
    "constituents": [
      {
        "weight": 65.81,
        "id": 1,
        "name": "Bitcoin",
        "symbol": "BTC",
        "url": "https://coinmarketcap.com/currencies/bitcoin"
      },
      ...
      {
        "weight": 0.02,
        "id": 8425,
        "name": "JasmyCoin",
        "symbol": "JASMY",
        "url": "https://coinmarketcap.com/currencies/jasmy"
      }
    ],
    "value_24h_percentage_change": 2.52,
    "last_update": "2025-07-26T15:20:00Z",
    "next_update": "2025-07-26T15:25:00Z"
  },
  "status": {
    "timestamp": "2025-07-26T15:23:11.465Z",
    "error_code": "0",
    "error_message": "",
    "elapsed": 3,
    "credit_count": 1
  }
}
```

List of parameters to parse:

- `value`: the value of the index
- `constituents`: an array of objects with the following structure:
    - `weight`: the weight of the constituent
    - `id`: the id of the constituent
    - `name`: the name of the constituent
    - `symbol`: the symbol of the constituent
    - `url`: the url of the constituent
- `value_24h_percentage_change`: the value of the index change in the last 24 hours
- `last_update`: the last update of the index
- `next_update`: the next update of the index

## CoinMarketCap 100 Index Historical (CMC100H)

Request API with headers:

```text
GET /v3/index/cmc100-historical HTTP/3

Accept: application/json
X-CMC_PRO_API_KEY: API_KEY
```

The response is a JSON object with the following structure:

```json
{
  "data": [
    {
      "value": 239.42,
      "constituents": [
        {
          "weight": 66.02,
          "id": 1,
          "name": "Bitcoin",
          "symbol": "BTC",
          "url": "https://coinmarketcap.com/currencies/bitcoin"
        },
        {
          "weight": 12.21,
          "id": 1027,
          "name": "Ethereum",
          "symbol": "ETH",
          "url": "https://coinmarketcap.com/currencies/ethereum"
        },
        {
          "weight": 5.71,
          "id": 52,
          "name": "XRP",
          "symbol": "XRP",
          "url": "https://coinmarketcap.com/currencies/xrp"
        },
        {
          "weight": 2.88,
          "id": 1839,
          "name": "BNB",
          "symbol": "BNB",
          "url": "https://coinmarketcap.com/currencies/bnb"
        },
        {
          "weight": 2.68,
          "id": 5426,
          "name": "Solana",
          "symbol": "SOL",
          "url": "https://coinmarketcap.com/currencies/solana"
        },
        {
          "weight": 1.02,
          "id": 74,
          "name": "Dogecoin",
          "symbol": "DOGE",
          "url": "https://coinmarketcap.com/currencies/dogecoin"
        },
        {
          "weight": 0.85,
          "id": 1958,
          "name": "TRON",
          "symbol": "TRX",
          "url": "https://coinmarketcap.com/currencies/tron"
        },
        {
          "weight": 0.83,
          "id": 2010,
          "name": "Cardano",
          "symbol": "ADA",
          "url": "https://coinmarketcap.com/currencies/cardano"
        },
        {
          "weight": 0.42,
          "id": 32196,
          "name": "Hyperliquid",
          "symbol": "HYPE",
          "url": "https://coinmarketcap.com/currencies/hyperliquid"
        },
        {
          "weight": 0.40,
          "id": 512,
          "name": "Stellar",
          "symbol": "XLM",
          "url": "https://coinmarketcap.com/currencies/stellar"
        },
        {
          "weight": 0.37,
          "id": 20947,
          "name": "Sui",
          "symbol": "SUI",
          "url": "https://coinmarketcap.com/currencies/sui"
        },
        {
          "weight": 0.35,
          "id": 1975,
          "name": "Chainlink",
          "symbol": "LINK",
          "url": "https://coinmarketcap.com/currencies/chainlink"
        },
        {
          "weight": 0.32,
          "id": 4642,
          "name": "Hedera",
          "symbol": "HBAR",
          "url": "https://coinmarketcap.com/currencies/hedera"
        },
        {
          "weight": 0.29,
          "id": 1831,
          "name": "Bitcoin Cash",
          "symbol": "BCH",
          "url": "https://coinmarketcap.com/currencies/bitcoin-cash"
        },
        {
          "weight": 0.29,
          "id": 5805,
          "name": "Avalanche",
          "symbol": "AVAX",
          "url": "https://coinmarketcap.com/currencies/avalanche"
        },
        {
          "weight": 0.25,
          "id": 5994,
          "name": "Shiba Inu",
          "symbol": "SHIB",
          "url": "https://coinmarketcap.com/currencies/shiba-inu"
        },
        {
          "weight": 0.24,
          "id": 2,
          "name": "Litecoin",
          "symbol": "LTC",
          "url": "https://coinmarketcap.com/currencies/litecoin"
        },
        {
          "weight": 0.23,
          "id": 3957,
          "name": "UNUS SED LEO",
          "symbol": "LEO",
          "url": "https://coinmarketcap.com/currencies/unus-sed-leo"
        },
        {
          "weight": 0.22,
          "id": 11419,
          "name": "Toncoin",
          "symbol": "TON",
          "url": "https://coinmarketcap.com/currencies/toncoin"
        },
        {
          "weight": 0.20,
          "id": 6636,
          "name": "Polkadot",
          "symbol": "DOT",
          "url": "https://coinmarketcap.com/currencies/polkadot-new"
        },
        {
          "weight": 0.18,
          "id": 7083,
          "name": "Uniswap",
          "symbol": "UNI",
          "url": "https://coinmarketcap.com/currencies/uniswap"
        },
        {
          "weight": 0.17,
          "id": 328,
          "name": "Monero",
          "symbol": "XMR",
          "url": "https://coinmarketcap.com/currencies/monero"
        },
        {
          "weight": 0.16,
          "id": 11092,
          "name": "Bitget Token",
          "symbol": "BGB",
          "url": "https://coinmarketcap.com/currencies/bitget-token-new"
        },
        {
          "weight": 0.16,
          "id": 24478,
          "name": "Pepe",
          "symbol": "PEPE",
          "url": "https://coinmarketcap.com/currencies/pepe"
        },
        {
          "weight": 0.14,
          "id": 7278,
          "name": "Aave",
          "symbol": "AAVE",
          "url": "https://coinmarketcap.com/currencies/aave"
        },
        {
          "weight": 0.11,
          "id": 3635,
          "name": "Cronos",
          "symbol": "CRO",
          "url": "https://coinmarketcap.com/currencies/cronos"
        },
        {
          "weight": 0.11,
          "id": 22974,
          "name": "Bittensor",
          "symbol": "TAO",
          "url": "https://coinmarketcap.com/currencies/bittensor"
        },
        {
          "weight": 0.10,
          "id": 21794,
          "name": "Aptos",
          "symbol": "APT",
          "url": "https://coinmarketcap.com/currencies/aptos"
        },
        {
          "weight": 0.10,
          "id": 1321,
          "name": "Ethereum Classic",
          "symbol": "ETC",
          "url": "https://coinmarketcap.com/currencies/ethereum-classic"
        },
        {
          "weight": 0.10,
          "id": 35697,
          "name": "Pi",
          "symbol": "PI",
          "url": "https://coinmarketcap.com/currencies/pi"
        },
        {
          "weight": 0.10,
          "id": 6535,
          "name": "NEAR Protocol",
          "symbol": "NEAR",
          "url": "https://coinmarketcap.com/currencies/near-protocol"
        },
        {
          "weight": 0.09,
          "id": 21159,
          "name": "Ondo",
          "symbol": "ONDO",
          "url": "https://coinmarketcap.com/currencies/ondo-finance"
        },
        {
          "weight": 0.09,
          "id": 8916,
          "name": "Internet Computer",
          "symbol": "ICP",
          "url": "https://coinmarketcap.com/currencies/internet-computer"
        },
        {
          "weight": 0.08,
          "id": 23095,
          "name": "Bonk",
          "symbol": "BONK",
          "url": "https://coinmarketcap.com/currencies/bonk1"
        },
        {
          "weight": 0.08,
          "id": 3897,
          "name": "OKB",
          "symbol": "OKB",
          "url": "https://coinmarketcap.com/currencies/okb"
        },
        {
          "weight": 0.08,
          "id": 27075,
          "name": "Mantle",
          "symbol": "MNT",
          "url": "https://coinmarketcap.com/currencies/mantle"
        },
        {
          "weight": 0.08,
          "id": 30171,
          "name": "Ethena",
          "symbol": "ENA",
          "url": "https://coinmarketcap.com/currencies/ethena"
        },
        {
          "weight": 0.07,
          "id": 3077,
          "name": "VeChain",
          "symbol": "VET",
          "url": "https://coinmarketcap.com/currencies/vechain"
        },
        {
          "weight": 0.07,
          "id": 11841,
          "name": "Arbitrum",
          "symbol": "ARB",
          "url": "https://coinmarketcap.com/currencies/arbitrum"
        },
        {
          "weight": 0.07,
          "id": 28321,
          "name": "POL (prev. MATIC)",
          "symbol": "POL",
          "url": "https://coinmarketcap.com/currencies/polygon-ecosystem-token"
        },
        {
          "weight": 0.07,
          "id": 20396,
          "name": "Kaspa",
          "symbol": "KAS",
          "url": "https://coinmarketcap.com/currencies/kaspa"
        },
        {
          "weight": 0.07,
          "id": 4030,
          "name": "Algorand",
          "symbol": "ALGO",
          "url": "https://coinmarketcap.com/currencies/algorand"
        },
        {
          "weight": 0.06,
          "id": 35336,
          "name": "OFFICIAL TRUMP",
          "symbol": "TRUMP",
          "url": "https://coinmarketcap.com/currencies/official-trump"
        },
        {
          "weight": 0.06,
          "id": 5690,
          "name": "Render",
          "symbol": "RENDER",
          "url": "https://coinmarketcap.com/currencies/render"
        },
        {
          "weight": 0.06,
          "id": 23149,
          "name": "Sei",
          "symbol": "SEI",
          "url": "https://coinmarketcap.com/currencies/sei"
        },
        {
          "weight": 0.06,
          "id": 4269,
          "name": "GateToken",
          "symbol": "GT",
          "url": "https://coinmarketcap.com/currencies/gatetoken"
        },
        {
          "weight": 0.06,
          "id": 13502,
          "name": "Worldcoin",
          "symbol": "WLD",
          "url": "https://coinmarketcap.com/currencies/worldcoin-org"
        },
        {
          "weight": 0.06,
          "id": 3794,
          "name": "Cosmos",
          "symbol": "ATOM",
          "url": "https://coinmarketcap.com/currencies/cosmos"
        },
        {
          "weight": 0.05,
          "id": 33038,
          "name": "Sky",
          "symbol": "SKY",
          "url": "https://coinmarketcap.com/currencies/sky"
        },
        {
          "weight": 0.05,
          "id": 29210,
          "name": "Jupiter",
          "symbol": "JUP",
          "url": "https://coinmarketcap.com/currencies/jupiter-ag"
        },
        {
          "weight": 0.05,
          "id": 34466,
          "name": "Pudgy Penguins",
          "symbol": "PENGU",
          "url": "https://coinmarketcap.com/currencies/pudgy-penguins"
        },
        {
          "weight": 0.05,
          "id": 28081,
          "name": "SPX6900",
          "symbol": "SPX",
          "url": "https://coinmarketcap.com/currencies/spx6900"
        },
        {
          "weight": 0.05,
          "id": 3773,
          "name": "Artificial Superintelligence Alliance",
          "symbol": "FET",
          "url": "https://coinmarketcap.com/currencies/artificial-superintelligence-alliance"
        },
        {
          "weight": 0.05,
          "id": 2280,
          "name": "Filecoin",
          "symbol": "FIL",
          "url": "https://coinmarketcap.com/currencies/filecoin"
        },
        {
          "weight": 0.04,
          "id": 7950,
          "name": "Flare",
          "symbol": "FLR",
          "url": "https://coinmarketcap.com/currencies/flare"
        },
        {
          "weight": 0.04,
          "id": 2087,
          "name": "KuCoin Token",
          "symbol": "KCS",
          "url": "https://coinmarketcap.com/currencies/kucoin-token"
        },
        {
          "weight": 0.04,
          "id": 35626,
          "name": "Story",
          "symbol": "IP",
          "url": "https://coinmarketcap.com/currencies/story-protocol"
        },
        {
          "weight": 0.04,
          "id": 10804,
          "name": "FLOKI",
          "symbol": "FLOKI",
          "url": "https://coinmarketcap.com/currencies/floki-inu"
        },
        {
          "weight": 0.04,
          "id": 7226,
          "name": "Injective",
          "symbol": "INJ",
          "url": "https://coinmarketcap.com/currencies/injective"
        },
        {
          "weight": 0.04,
          "id": 33597,
          "name": "Fartcoin",
          "symbol": "FARTCOIN",
          "url": "https://coinmarketcap.com/currencies/fartcoin"
        },
        {
          "weight": 0.04,
          "id": 11840,
          "name": "Optimism",
          "symbol": "OP",
          "url": "https://coinmarketcap.com/currencies/optimism-ethereum"
        },
        {
          "weight": 0.04,
          "id": 2634,
          "name": "XDC Network",
          "symbol": "XDC",
          "url": "https://coinmarketcap.com/currencies/xdc-network"
        },
        {
          "weight": 0.04,
          "id": 22861,
          "name": "Celestia",
          "symbol": "TIA",
          "url": "https://coinmarketcap.com/currencies/celestia"
        },
        {
          "weight": 0.04,
          "id": 23635,
          "name": "Four",
          "symbol": "FORM",
          "url": "https://coinmarketcap.com/currencies/binaryx-new"
        },
        {
          "weight": 0.04,
          "id": 3155,
          "name": "Quant",
          "symbol": "QNT",
          "url": "https://coinmarketcap.com/currencies/quant"
        },
        {
          "weight": 0.04,
          "id": 6538,
          "name": "Curve DAO Token",
          "symbol": "CRV",
          "url": "https://coinmarketcap.com/currencies/curve-dao-token"
        },
        {
          "weight": 0.04,
          "id": 4847,
          "name": "Stacks",
          "symbol": "STX",
          "url": "https://coinmarketcap.com/currencies/stacks"
        },
        {
          "weight": 0.03,
          "id": 7186,
          "name": "PancakeSwap",
          "symbol": "CAKE",
          "url": "https://coinmarketcap.com/currencies/pancakeswap"
        },
        {
          "weight": 0.03,
          "id": 13855,
          "name": "Ethereum Name Service",
          "symbol": "ENS",
          "url": "https://coinmarketcap.com/currencies/ethereum-name-service"
        },
        {
          "weight": 0.03,
          "id": 6719,
          "name": "The Graph",
          "symbol": "GRT",
          "url": "https://coinmarketcap.com/currencies/the-graph"
        },
        {
          "weight": 0.03,
          "id": 8000,
          "name": "Lido DAO",
          "symbol": "LDO",
          "url": "https://coinmarketcap.com/currencies/lido-dao"
        },
        {
          "weight": 0.03,
          "id": 28752,
          "name": "dogwifhat",
          "symbol": "WIF",
          "url": "https://coinmarketcap.com/currencies/dogwifhat"
        },
        {
          "weight": 0.03,
          "id": 4705,
          "name": "PAX Gold",
          "symbol": "PAXG",
          "url": "https://coinmarketcap.com/currencies/pax-gold"
        },
        {
          "weight": 0.03,
          "id": 10603,
          "name": "Immutable",
          "symbol": "IMX",
          "url": "https://coinmarketcap.com/currencies/immutable-x"
        },
        {
          "weight": 0.03,
          "id": 36462,
          "name": "Vaulta",
          "symbol": "A",
          "url": "https://coinmarketcap.com/currencies/vaulta"
        },
        {
          "weight": 0.03,
          "id": 2416,
          "name": "Theta Network",
          "symbol": "THETA",
          "url": "https://coinmarketcap.com/currencies/theta-network"
        },
        {
          "weight": 0.03,
          "id": 32880,
          "name": "Kaia",
          "symbol": "KAIA",
          "url": "https://coinmarketcap.com/currencies/kaia"
        },
        {
          "weight": 0.03,
          "id": 32684,
          "name": "Sonic",
          "symbol": "S",
          "url": "https://coinmarketcap.com/currencies/sonic"
        },
        {
          "weight": 0.03,
          "id": 1720,
          "name": "IOTA",
          "symbol": "IOTA",
          "url": "https://coinmarketcap.com/currencies/iota"
        },
        {
          "weight": 0.03,
          "id": 2011,
          "name": "Tezos",
          "symbol": "XTZ",
          "url": "https://coinmarketcap.com/currencies/tezos"
        },
        {
          "weight": 0.03,
          "id": 29420,
          "name": "Virtuals Protocol",
          "symbol": "VIRTUAL",
          "url": "https://coinmarketcap.com/currencies/virtual-protocol"
        },
        {
          "weight": 0.02,
          "id": 9481,
          "name": "Pendle",
          "symbol": "PENDLE",
          "url": "https://coinmarketcap.com/currencies/pendle"
        },
        {
          "weight": 0.02,
          "id": 28177,
          "name": "Pyth Network",
          "symbol": "PYTH",
          "url": "https://coinmarketcap.com/currencies/pyth-network"
        },
        {
          "weight": 0.02,
          "id": 3602,
          "name": "Bitcoin SV",
          "symbol": "BSV",
          "url": "https://coinmarketcap.com/currencies/bitcoin-sv"
        },
        {
          "weight": 0.02,
          "id": 36119,
          "name": "Walrus",
          "symbol": "WAL",
          "url": "https://coinmarketcap.com/currencies/walrus-xyz"
        },
        {
          "weight": 0.02,
          "id": 3871,
          "name": "AB",
          "symbol": "AB",
          "url": "https://coinmarketcap.com/currencies/newton"
        },
        {
          "weight": 0.02,
          "id": 5176,
          "name": "Tether Gold",
          "symbol": "XAUt",
          "url": "https://coinmarketcap.com/currencies/tether-gold"
        },
        {
          "weight": 0.02,
          "id": 6210,
          "name": "The Sandbox",
          "symbol": "SAND",
          "url": "https://coinmarketcap.com/currencies/the-sandbox"
        },
        {
          "weight": 0.02,
          "id": 8526,
          "name": "Raydium",
          "symbol": "RAY",
          "url": "https://coinmarketcap.com/currencies/raydium"
        },
        {
          "weight": 0.02,
          "id": 29270,
          "name": "Aerodrome Finance",
          "symbol": "AERO",
          "url": "https://coinmarketcap.com/currencies/aerodrome-finance"
        },
        {
          "weight": 0.02,
          "id": 28541,
          "name": "Jito",
          "symbol": "JTO",
          "url": "https://coinmarketcap.com/currencies/jito"
        },
        {
          "weight": 0.02,
          "id": 2694,
          "name": "Nexo",
          "symbol": "NEXO",
          "url": "https://coinmarketcap.com/currencies/nexo"
        },
        {
          "weight": 0.02,
          "id": 1437,
          "name": "Zcash",
          "symbol": "ZEC",
          "url": "https://coinmarketcap.com/currencies/zcash"
        },
        {
          "weight": 0.02,
          "id": 7326,
          "name": "DeXe",
          "symbol": "DEXE",
          "url": "https://coinmarketcap.com/currencies/dexe"
        },
        {
          "weight": 0.02,
          "id": 7080,
          "name": "Gala",
          "symbol": "GALA",
          "url": "https://coinmarketcap.com/currencies/gala"
        },
        {
          "weight": 0.02,
          "id": 4558,
          "name": "Flow",
          "symbol": "FLOW",
          "url": "https://coinmarketcap.com/currencies/flow"
        },
        {
          "weight": 0.02,
          "id": 23254,
          "name": "Core",
          "symbol": "CORE",
          "url": "https://coinmarketcap.com/currencies/core-dao"
        },
        {
          "weight": 0.02,
          "id": 16086,
          "name": "BitTorrent [New]",
          "symbol": "BTT",
          "url": "https://coinmarketcap.com/currencies/bittorrent-new"
        },
        {
          "weight": 0.02,
          "id": 8425,
          "name": "JasmyCoin",
          "symbol": "JASMY",
          "url": "https://coinmarketcap.com/currencies/jasmy"
        },
        {
          "weight": 0.01,
          "id": 33824,
          "name": "Maple Finance",
          "symbol": "SYRUP",
          "url": "https://coinmarketcap.com/currencies/maple-finance"
        }
      ],
      "update_time": "2025-07-20T00:00:00Z"
    },
    ...
    {
      "value": 240.18,
      "constituents": [
        {
          "weight": 65.83,
          "id": 1,
          "name": "Bitcoin",
          "symbol": "BTC",
          "url": "https://coinmarketcap.com/currencies/bitcoin"
        },
        {
          "weight": 12.83,
          "id": 1027,
          "name": "Ethereum",
          "symbol": "ETH",
          "url": "https://coinmarketcap.com/currencies/ethereum"
        },
        {
          "weight": 5.18,
          "id": 52,
          "name": "XRP",
          "symbol": "XRP",
          "url": "https://coinmarketcap.com/currencies/xrp"
        },
        {
          "weight": 3.21,
          "id": 1839,
          "name": "BNB",
          "symbol": "BNB",
          "url": "https://coinmarketcap.com/currencies/bnb"
        },
        {
          "weight": 2.75,
          "id": 5426,
          "name": "Solana",
          "symbol": "SOL",
          "url": "https://coinmarketcap.com/currencies/solana"
        },
        {
          "weight": 0.95,
          "id": 74,
          "name": "Dogecoin",
          "symbol": "DOGE",
          "url": "https://coinmarketcap.com/currencies/dogecoin"
        },
        {
          "weight": 0.86,
          "id": 1958,
          "name": "TRON",
          "symbol": "TRX",
          "url": "https://coinmarketcap.com/currencies/tron"
        },
        {
          "weight": 0.79,
          "id": 2010,
          "name": "Cardano",
          "symbol": "ADA",
          "url": "https://coinmarketcap.com/currencies/cardano"
        },
        {
          "weight": 0.41,
          "id": 32196,
          "name": "Hyperliquid",
          "symbol": "HYPE",
          "url": "https://coinmarketcap.com/currencies/hyperliquid"
        },
        {
          "weight": 0.38,
          "id": 20947,
          "name": "Sui",
          "symbol": "SUI",
          "url": "https://coinmarketcap.com/currencies/sui"
        },
        {
          "weight": 0.36,
          "id": 512,
          "name": "Stellar",
          "symbol": "XLM",
          "url": "https://coinmarketcap.com/currencies/stellar"
        },
        {
          "weight": 0.34,
          "id": 1975,
          "name": "Chainlink",
          "symbol": "LINK",
          "url": "https://coinmarketcap.com/currencies/chainlink"
        },
        {
          "weight": 0.32,
          "id": 4642,
          "name": "Hedera",
          "symbol": "HBAR",
          "url": "https://coinmarketcap.com/currencies/hedera"
        },
        {
          "weight": 0.32,
          "id": 1831,
          "name": "Bitcoin Cash",
          "symbol": "BCH",
          "url": "https://coinmarketcap.com/currencies/bitcoin-cash"
        },
        {
          "weight": 0.30,
          "id": 5805,
          "name": "Avalanche",
          "symbol": "AVAX",
          "url": "https://coinmarketcap.com/currencies/avalanche"
        },
        {
          "weight": 0.23,
          "id": 2,
          "name": "Litecoin",
          "symbol": "LTC",
          "url": "https://coinmarketcap.com/currencies/litecoin"
        },
        {
          "weight": 0.23,
          "id": 3957,
          "name": "UNUS SED LEO",
          "symbol": "LEO",
          "url": "https://coinmarketcap.com/currencies/unus-sed-leo"
        },
        {
          "weight": 0.22,
          "id": 5994,
          "name": "Shiba Inu",
          "symbol": "SHIB",
          "url": "https://coinmarketcap.com/currencies/shiba-inu"
        },
        {
          "weight": 0.22,
          "id": 11419,
          "name": "Toncoin",
          "symbol": "TON",
          "url": "https://coinmarketcap.com/currencies/toncoin"
        },
        {
          "weight": 0.18,
          "id": 7083,
          "name": "Uniswap",
          "symbol": "UNI",
          "url": "https://coinmarketcap.com/currencies/uniswap"
        },
        {
          "weight": 0.18,
          "id": 6636,
          "name": "Polkadot",
          "symbol": "DOT",
          "url": "https://coinmarketcap.com/currencies/polkadot-new"
        },
        {
          "weight": 0.16,
          "id": 328,
          "name": "Monero",
          "symbol": "XMR",
          "url": "https://coinmarketcap.com/currencies/monero"
        },
        {
          "weight": 0.15,
          "id": 11092,
          "name": "Bitget Token",
          "symbol": "BGB",
          "url": "https://coinmarketcap.com/currencies/bitget-token-new"
        },
        {
          "weight": 0.14,
          "id": 24478,
          "name": "Pepe",
          "symbol": "PEPE",
          "url": "https://coinmarketcap.com/currencies/pepe"
        },
        {
          "weight": 0.13,
          "id": 3635,
          "name": "Cronos",
          "symbol": "CRO",
          "url": "https://coinmarketcap.com/currencies/cronos"
        },
        {
          "weight": 0.12,
          "id": 7278,
          "name": "Aave",
          "symbol": "AAVE",
          "url": "https://coinmarketcap.com/currencies/aave"
        },
        {
          "weight": 0.11,
          "id": 22974,
          "name": "Bittensor",
          "symbol": "TAO",
          "url": "https://coinmarketcap.com/currencies/bittensor"
        },
        {
          "weight": 0.11,
          "id": 30171,
          "name": "Ethena",
          "symbol": "ENA",
          "url": "https://coinmarketcap.com/currencies/ethena"
        },
        {
          "weight": 0.10,
          "id": 35697,
          "name": "Pi",
          "symbol": "PI",
          "url": "https://coinmarketcap.com/currencies/pi"
        },
        {
          "weight": 0.10,
          "id": 6535,
          "name": "NEAR Protocol",
          "symbol": "NEAR",
          "url": "https://coinmarketcap.com/currencies/near-protocol"
        },
        {
          "weight": 0.09,
          "id": 1321,
          "name": "Ethereum Classic",
          "symbol": "ETC",
          "url": "https://coinmarketcap.com/currencies/ethereum-classic"
        },
        {
          "weight": 0.09,
          "id": 21159,
          "name": "Ondo",
          "symbol": "ONDO",
          "url": "https://coinmarketcap.com/currencies/ondo-finance"
        },
        {
          "weight": 0.08,
          "id": 21794,
          "name": "Aptos",
          "symbol": "APT",
          "url": "https://coinmarketcap.com/currencies/aptos"
        },
        {
          "weight": 0.08,
          "id": 3897,
          "name": "OKB",
          "symbol": "OKB",
          "url": "https://coinmarketcap.com/currencies/okb"
        },
        {
          "weight": 0.08,
          "id": 27075,
          "name": "Mantle",
          "symbol": "MNT",
          "url": "https://coinmarketcap.com/currencies/mantle"
        },
        {
          "weight": 0.08,
          "id": 8916,
          "name": "Internet Computer",
          "symbol": "ICP",
          "url": "https://coinmarketcap.com/currencies/internet-computer"
        },
        {
          "weight": 0.07,
          "id": 23095,
          "name": "Bonk",
          "symbol": "BONK",
          "url": "https://coinmarketcap.com/currencies/bonk1"
        },
        {
          "weight": 0.07,
          "id": 28321,
          "name": "POL (prev. MATIC)",
          "symbol": "POL",
          "url": "https://coinmarketcap.com/currencies/polygon-ecosystem-token"
        },
        {
          "weight": 0.07,
          "id": 34466,
          "name": "Pudgy Penguins",
          "symbol": "PENGU",
          "url": "https://coinmarketcap.com/currencies/pudgy-penguins"
        },
        {
          "weight": 0.07,
          "id": 20396,
          "name": "Kaspa",
          "symbol": "KAS",
          "url": "https://coinmarketcap.com/currencies/kaspa"
        },
        {
          "weight": 0.06,
          "id": 3077,
          "name": "VeChain",
          "symbol": "VET",
          "url": "https://coinmarketcap.com/currencies/vechain"
        },
        {
          "weight": 0.06,
          "id": 5690,
          "name": "Render",
          "symbol": "RENDER",
          "url": "https://coinmarketcap.com/currencies/render"
        },
        {
          "weight": 0.06,
          "id": 11841,
          "name": "Arbitrum",
          "symbol": "ARB",
          "url": "https://coinmarketcap.com/currencies/arbitrum"
        },
        {
          "weight": 0.06,
          "id": 4269,
          "name": "GateToken",
          "symbol": "GT",
          "url": "https://coinmarketcap.com/currencies/gatetoken"
        },
        {
          "weight": 0.06,
          "id": 28081,
          "name": "SPX6900",
          "symbol": "SPX",
          "url": "https://coinmarketcap.com/currencies/spx6900"
        },
        {
          "weight": 0.06,
          "id": 13502,
          "name": "Worldcoin",
          "symbol": "WLD",
          "url": "https://coinmarketcap.com/currencies/worldcoin-org"
        },
        {
          "weight": 0.06,
          "id": 4030,
          "name": "Algorand",
          "symbol": "ALGO",
          "url": "https://coinmarketcap.com/currencies/algorand"
        },
        {
          "weight": 0.05,
          "id": 35336,
          "name": "OFFICIAL TRUMP",
          "symbol": "TRUMP",
          "url": "https://coinmarketcap.com/currencies/official-trump"
        },
        {
          "weight": 0.05,
          "id": 7950,
          "name": "Flare",
          "symbol": "FLR",
          "url": "https://coinmarketcap.com/currencies/flare"
        },
        {
          "weight": 0.05,
          "id": 33038,
          "name": "Sky",
          "symbol": "SKY",
          "url": "https://coinmarketcap.com/currencies/sky"
        },
        {
          "weight": 0.05,
          "id": 29210,
          "name": "Jupiter",
          "symbol": "JUP",
          "url": "https://coinmarketcap.com/currencies/jupiter-ag"
        },
        {
          "weight": 0.05,
          "id": 35626,
          "name": "Story",
          "symbol": "IP",
          "url": "https://coinmarketcap.com/currencies/story-protocol"
        },
        {
          "weight": 0.05,
          "id": 23149,
          "name": "Sei",
          "symbol": "SEI",
          "url": "https://coinmarketcap.com/currencies/sei"
        },
        {
          "weight": 0.05,
          "id": 3773,
          "name": "Artificial Superintelligence Alliance",
          "symbol": "FET",
          "url": "https://coinmarketcap.com/currencies/artificial-superintelligence-alliance"
        },
        {
          "weight": 0.05,
          "id": 3794,
          "name": "Cosmos",
          "symbol": "ATOM",
          "url": "https://coinmarketcap.com/currencies/cosmos"
        },
        {
          "weight": 0.05,
          "id": 2280,
          "name": "Filecoin",
          "symbol": "FIL",
          "url": "https://coinmarketcap.com/currencies/filecoin"
        },
        {
          "weight": 0.04,
          "id": 2087,
          "name": "KuCoin Token",
          "symbol": "KCS",
          "url": "https://coinmarketcap.com/currencies/kucoin-token"
        },
        {
          "weight": 0.04,
          "id": 7226,
          "name": "Injective",
          "symbol": "INJ",
          "url": "https://coinmarketcap.com/currencies/injective"
        },
        {
          "weight": 0.04,
          "id": 11840,
          "name": "Optimism",
          "symbol": "OP",
          "url": "https://coinmarketcap.com/currencies/optimism-ethereum"
        },
        {
          "weight": 0.04,
          "id": 2634,
          "name": "XDC Network",
          "symbol": "XDC",
          "url": "https://coinmarketcap.com/currencies/xdc-network"
        },
        {
          "weight": 0.04,
          "id": 22861,
          "name": "Celestia",
          "symbol": "TIA",
          "url": "https://coinmarketcap.com/currencies/celestia"
        },
        {
          "weight": 0.04,
          "id": 23635,
          "name": "Four",
          "symbol": "FORM",
          "url": "https://coinmarketcap.com/currencies/binaryx-new"
        },
        {
          "weight": 0.04,
          "id": 3155,
          "name": "Quant",
          "symbol": "QNT",
          "url": "https://coinmarketcap.com/currencies/quant"
        },
        {
          "weight": 0.04,
          "id": 6538,
          "name": "Curve DAO Token",
          "symbol": "CRV",
          "url": "https://coinmarketcap.com/currencies/curve-dao-token"
        },
        {
          "weight": 0.04,
          "id": 4847,
          "name": "Stacks",
          "symbol": "STX",
          "url": "https://coinmarketcap.com/currencies/stacks"
        },
        {
          "weight": 0.03,
          "id": 7186,
          "name": "PancakeSwap",
          "symbol": "CAKE",
          "url": "https://coinmarketcap.com/currencies/pancakeswap"
        },
        {
          "weight": 0.03,
          "id": 13855,
          "name": "Ethereum Name Service",
          "symbol": "ENS",
          "url": "https://coinmarketcap.com/currencies/ethereum-name-service"
        },
        {
          "weight": 0.03,
          "id": 10804,
          "name": "FLOKI",
          "symbol": "FLOKI",
          "url": "https://coinmarketcap.com/currencies/floki-inu"
        },
        {
          "weight": 0.03,
          "id": 33597,
          "name": "Fartcoin",
          "symbol": "FARTCOIN",
          "url": "https://coinmarketcap.com/currencies/fartcoin"
        },
        {
          "weight": 0.03,
          "id": 6719,
          "name": "The Graph",
          "symbol": "GRT",
          "url": "https://coinmarketcap.com/currencies/the-graph"
        },
        {
          "weight": 0.03,
          "id": 8000,
          "name": "Lido DAO",
          "symbol": "LDO",
          "url": "https://coinmarketcap.com/currencies/lido-dao"
        },
        {
          "weight": 0.03,
          "id": 28752,
          "name": "dogwifhat",
          "symbol": "WIF",
          "url": "https://coinmarketcap.com/currencies/dogwifhat"
        },
        {
          "weight": 0.03,
          "id": 4705,
          "name": "PAX Gold",
          "symbol": "PAXG",
          "url": "https://coinmarketcap.com/currencies/pax-gold"
        },
        {
          "weight": 0.03,
          "id": 10603,
          "name": "Immutable",
          "symbol": "IMX",
          "url": "https://coinmarketcap.com/currencies/immutable-x"
        },
        {
          "weight": 0.03,
          "id": 32880,
          "name": "Kaia",
          "symbol": "KAIA",
          "url": "https://coinmarketcap.com/currencies/kaia"
        },
        {
          "weight": 0.03,
          "id": 32684,
          "name": "Sonic",
          "symbol": "S",
          "url": "https://coinmarketcap.com/currencies/sonic"
        },
        {
          "weight": 0.03,
          "id": 2011,
          "name": "Tezos",
          "symbol": "XTZ",
          "url": "https://coinmarketcap.com/currencies/tezos"
        },
        {
          "weight": 0.03,
          "id": 29420,
          "name": "Virtuals Protocol",
          "symbol": "VIRTUAL",
          "url": "https://coinmarketcap.com/currencies/virtual-protocol"
        },
        {
          "weight": 0.02,
          "id": 9481,
          "name": "Pendle",
          "symbol": "PENDLE",
          "url": "https://coinmarketcap.com/currencies/pendle"
        },
        {
          "weight": 0.02,
          "id": 28177,
          "name": "Pyth Network",
          "symbol": "PYTH",
          "url": "https://coinmarketcap.com/currencies/pyth-network"
        },
        {
          "weight": 0.02,
          "id": 3602,
          "name": "Bitcoin SV",
          "symbol": "BSV",
          "url": "https://coinmarketcap.com/currencies/bitcoin-sv"
        },
        {
          "weight": 0.02,
          "id": 36119,
          "name": "Walrus",
          "symbol": "WAL",
          "url": "https://coinmarketcap.com/currencies/walrus-xyz"
        },
        {
          "weight": 0.02,
          "id": 3871,
          "name": "AB",
          "symbol": "AB",
          "url": "https://coinmarketcap.com/currencies/newton"
        },
        {
          "weight": 0.02,
          "id": 33824,
          "name": "Maple Finance",
          "symbol": "SYRUP",
          "url": "https://coinmarketcap.com/currencies/maple-finance"
        },
        {
          "weight": 0.02,
          "id": 5176,
          "name": "Tether Gold",
          "symbol": "XAUt",
          "url": "https://coinmarketcap.com/currencies/tether-gold"
        },
        {
          "weight": 0.02,
          "id": 6210,
          "name": "The Sandbox",
          "symbol": "SAND",
          "url": "https://coinmarketcap.com/currencies/the-sandbox"
        },
        {
          "weight": 0.02,
          "id": 8526,
          "name": "Raydium",
          "symbol": "RAY",
          "url": "https://coinmarketcap.com/currencies/raydium"
        },
        {
          "weight": 0.02,
          "id": 29270,
          "name": "Aerodrome Finance",
          "symbol": "AERO",
          "url": "https://coinmarketcap.com/currencies/aerodrome-finance"
        },
        {
          "weight": 0.02,
          "id": 36462,
          "name": "Vaulta",
          "symbol": "A",
          "url": "https://coinmarketcap.com/currencies/vaulta"
        },
        {
          "weight": 0.02,
          "id": 2416,
          "name": "Theta Network",
          "symbol": "THETA",
          "url": "https://coinmarketcap.com/currencies/theta-network"
        },
        {
          "weight": 0.02,
          "id": 28541,
          "name": "Jito",
          "symbol": "JTO",
          "url": "https://coinmarketcap.com/currencies/jito"
        },
        {
          "weight": 0.02,
          "id": 2694,
          "name": "Nexo",
          "symbol": "NEXO",
          "url": "https://coinmarketcap.com/currencies/nexo"
        },
        {
          "weight": 0.02,
          "id": 1437,
          "name": "Zcash",
          "symbol": "ZEC",
          "url": "https://coinmarketcap.com/currencies/zcash"
        },
        {
          "weight": 0.02,
          "id": 7326,
          "name": "DeXe",
          "symbol": "DEXE",
          "url": "https://coinmarketcap.com/currencies/dexe"
        },
        {
          "weight": 0.02,
          "id": 7080,
          "name": "Gala",
          "symbol": "GALA",
          "url": "https://coinmarketcap.com/currencies/gala"
        },
        {
          "weight": 0.02,
          "id": 1720,
          "name": "IOTA",
          "symbol": "IOTA",
          "url": "https://coinmarketcap.com/currencies/iota"
        },
        {
          "weight": 0.02,
          "id": 4558,
          "name": "Flow",
          "symbol": "FLOW",
          "url": "https://coinmarketcap.com/currencies/flow"
        },
        {
          "weight": 0.02,
          "id": 23254,
          "name": "Core",
          "symbol": "CORE",
          "url": "https://coinmarketcap.com/currencies/core-dao"
        },
        {
          "weight": 0.02,
          "id": 16086,
          "name": "BitTorrent [New]",
          "symbol": "BTT",
          "url": "https://coinmarketcap.com/currencies/bittorrent-new"
        },
        {
          "weight": 0.02,
          "id": 8425,
          "name": "JasmyCoin",
          "symbol": "JASMY",
          "url": "https://coinmarketcap.com/currencies/jasmy"
        }
      ],
      "update_time": "2025-07-29T00:00:00Z"
    }
  ],
  "status": {
    "timestamp": "2025-07-29T10:22:25.389Z",
    "error_code": "0",
    "error_message": "",
    "elapsed": 7,
    "credit_count": 1
  }
}
```

List of parameters to parse:

- `value`: the value of the index
- `constituents`: an array of objects with the following structure:
    - `weight`: the weight of the constituent
    - `id`: the id of the constituent
    - `name`: the name of the constituent (can be null)
    - `symbol`: the symbol of the constituent (can be null)
    - `url`: the url of the constituent (can be null)
- `update_time`: the last update of the index

## CoinMarketCap 100 Index (CMC100)

Request URL with curl:

```text
GET /data-api/v3/top100/historical/chart?range=24h HTTP/2

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
    "constituents": {
      "configs": [
        {
          "id": 1,
          "name": "Bitcoin",
          "slug": "bitcoin",
          "symbol": "BTC"
        },
        {
          "id": 1027,
          "name": "Ethereum",
          "slug": "ethereum",
          "symbol": "ETH"
        },
        {
          "id": 52,
          "name": "XRP",
          "slug": "xrp",
          "symbol": "XRP"
        },
        {
          "id": 1839,
          "name": "BNB",
          "slug": "bnb",
          "symbol": "BNB"
        },
        {
          "id": 5426,
          "name": "Solana",
          "slug": "solana",
          "symbol": "SOL"
        },
        {
          "id": 74,
          "name": "Dogecoin",
          "slug": "dogecoin",
          "symbol": "DOGE"
        },
        {
          "id": 1958,
          "name": "TRON",
          "slug": "tron",
          "symbol": "TRX"
        },
        {
          "id": 2010,
          "name": "Cardano",
          "slug": "cardano",
          "symbol": "ADA"
        },
        {
          "id": 32196,
          "name": "Hyperliquid",
          "slug": "hyperliquid",
          "symbol": "HYPE"
        },
        {
          "id": 512,
          "name": "Stellar",
          "slug": "stellar",
          "symbol": "XLM"
        },
        {
          "id": 0,
          "name": "Others",
          "slug": "others",
          "symbol": "OTHERS"
        }
      ],
      "points": [
        {
          "timestamp": "1752521100",
          "points": [
            {
              "cryptoId": 1,
              "name": "Bitcoin",
              "slug": "bitcoin",
              "symbol": "BTC",
              "weight": 69.25
            },
            {
              "cryptoId": 1027,
              "name": "Ethereum",
              "slug": "ethereum",
              "symbol": "ETH",
              "weight": 10.51
            },
            {
              "cryptoId": 52,
              "name": "XRP",
              "slug": "xrp",
              "symbol": "XRP",
              "weight": 5.03
            },
            {
              "cryptoId": 1839,
              "name": "BNB",
              "slug": "bnb",
              "symbol": "BNB",
              "weight": 2.79
            },
            {
              "cryptoId": 5426,
              "name": "Solana",
              "slug": "solana",
              "symbol": "SOL",
              "weight": 2.55
            },
            {
              "cryptoId": 74,
              "name": "Dogecoin",
              "slug": "dogecoin",
              "symbol": "DOGE",
              "weight": 0.86
            },
            {
              "cryptoId": 1958,
              "name": "TRON",
              "slug": "tron",
              "symbol": "TRX",
              "weight": 0.83
            },
            {
              "cryptoId": 2010,
              "name": "Cardano",
              "slug": "cardano",
              "symbol": "ADA",
              "weight": 0.75
            },
            {
              "cryptoId": 32196,
              "name": "Hyperliquid",
              "slug": "hyperliquid",
              "symbol": "HYPE",
              "weight": 0.45
            },
            {
              "cryptoId": 512,
              "name": "Stellar",
              "slug": "stellar",
              "symbol": "XLM",
              "weight": 0.41
            },
            {
              "cryptoId": 0,
              "name": "Others",
              "slug": "others",
              "symbol": "OTHERS",
              "weight": 6.57
            }
          ]
        },
        ...
        {
          "timestamp": "1752607500",
          "points": [
            {
              "cryptoId": 1,
              "name": "Bitcoin",
              "slug": "bitcoin",
              "symbol": "BTC",
              "weight": 68.51
            },
            {
              "cryptoId": 1027,
              "name": "Ethereum",
              "slug": "ethereum",
              "symbol": "ETH",
              "weight": 10.94
            },
            {
              "cryptoId": 52,
              "name": "XRP",
              "slug": "xrp",
              "symbol": "XRP",
              "weight": 5.08
            },
            {
              "cryptoId": 1839,
              "name": "BNB",
              "slug": "bnb",
              "symbol": "BNB",
              "weight": 2.82
            },
            {
              "cryptoId": 5426,
              "name": "Solana",
              "slug": "solana",
              "symbol": "SOL",
              "weight": 2.56
            },
            {
              "cryptoId": 74,
              "name": "Dogecoin",
              "slug": "dogecoin",
              "symbol": "DOGE",
              "weight": 0.86
            },
            {
              "cryptoId": 1958,
              "name": "TRON",
              "slug": "tron",
              "symbol": "TRX",
              "weight": 0.84
            },
            {
              "cryptoId": 2010,
              "name": "Cardano",
              "slug": "cardano",
              "symbol": "ADA",
              "weight": 0.77
            },
            {
              "cryptoId": 32196,
              "name": "Hyperliquid",
              "slug": "hyperliquid",
              "symbol": "HYPE",
              "weight": 0.47
            },
            {
              "cryptoId": 512,
              "name": "Stellar",
              "slug": "stellar",
              "symbol": "XLM",
              "weight": 0.41
            },
            {
              "cryptoId": 0,
              "name": "Others",
              "slug": "others",
              "symbol": "OTHERS",
              "weight": 6.74
            }
          ]
        }
      ]
    },
    "values": [
      {
        "timestamp": "1752521100",
        "value": 231.70
      },
      ...
      {
        "timestamp": "1752607500",
        "value": 228.85
      }
    ]
  },
  "status": {
    "timestamp": "2025-07-15T19:28:53.941Z",
    "error_code": "0",
    "error_message": "SUCCESS",
    "elapsed": "5",
    "credit_count": 0
  }
}
```

List of parameters to parse:

- `constituents`: an object with the following structure:
    - `configs`: an array of objects with the following structure:
        - `id`: the ID of the crypto
        - `name`: the name of the crypto
        - `slug`: the slug of the crypto
        - `symbol`: the symbol of the crypto
    - `points`: an array of objects with the following structure:
        - `timestamp`: the timestamp of the data point
        - `points`: an array of objects with the following structure:
            - `cryptoId`: the crypto ID
            - `name`: the name of the crypto
            - `slug`: the slug of the crypto
            - `symbol`: the symbol of the crypto
            - `weight`: the weight of the crypto
- `values`: an array of objects with the following structure:
    - `timestamp`: the timestamp of the data point
    - `value`: the value of the data point