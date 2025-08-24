# ByVotes Spot (BYV)

Hold USDT, USDC, USDE, USDD, DAI, or CUSD to be able to vote for your favorite tokens and stand to win airdrops.

## Current Events

Request API with headers:

```text
GET /x-api/spot/api/vote/v2/projectList?type=1 HTTP/3

Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: en-US,en;q=0.5
Alt-Used: www.bybit.com
Priority: u=0, i
Referer: https://www.bybit.com/en/vote-home
Origin: https://www.bybit.com
Sec-Fetch-Dest: document
Sec-Fetch-Mode: navigate
Sec-Fetch-Site: none
Sec-Fetch-User: ?1
TE: trailers
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:140.0) "Gecko/20100101 Firefox/140.0
```

The response is a JSON object with the following structure:

```json
{
  "ret_code": 0,
  "ret_msg": null,
  "token": null,
  "result": [],
  "success": true
}
```

List of parameters to parse:

- `coin`
- `icon`
- `voteStartTime`
- `voteEndTime`
- `rewardStartTime`
- `rewardEndTime`
- `introduceContent`

## Past Events

Request API with headers:

```text
GET /x-api/spot/api/vote/v2/projectList?type=2 HTTP/3

Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: en-US,en;q=0.5
Alt-Used: www.bybit.com
Priority: u=0, i
Referer: https://www.bybit.com/en/vote-home
Origin: https://www.bybit.com
Sec-Fetch-Dest: document
Sec-Fetch-Mode: navigate
Sec-Fetch-Site: none
Sec-Fetch-User: ?1
TE: trailers
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:140.0) "Gecko/20100101 Firefox/140.0
```

The response is a JSON object with the following structure:

```json
{
  "ret_code": 0,
  "ret_msg": null,
  "token": null,
  "result": [
    {
      "projectCode": "20250108064213",
      "coin": "HAT",
      "icon": "https://s1.bycsi.com/app/assets/token/fe729c50a712ee782f41ebdaa4403f47.png",
      "labelName": "AI",
      "voteStartTime": 1736416800000,
      "voteEndTime": 1736589600000,
      "rewardStartTime": 1736589601000,
      "rewardEndTime": 1737021600000,
      "introduceContent": "Top Hat is the infrastructure platform for creating multi-purpose AI agents. It enables anyone to build AI agents that interact seamlessly with humans and other agents, efficiently accomplishing tasks and capturing social virality. Most importantly, Top Hat is designed to make agent creation accessible to everyone, regardless of their technical expertise.",
      "hasBudget": 1,
      "tokenType": "SOLANA",
      "rewardPool": "1000000",
      "rewardPoolCoin": "HAT",
      "prizePoolValue": "70000",
      "price": null,
      "prizeCardId": null,
      "prizeCardValue": null,
      "assignableLimit": null,
      "voteLimit": 200000000,
      "singleUserVoteDown": 100,
      "singleUserVoteUp": 10000,
      "listingRate": "100",
      "totalPrizePool": "70000",
      "totalVoteNum": 311392641,
      "totalVoteUser": 69030,
      "userVotes": 0,
      "rewardCount": "0",
      "period": 4,
      "sort": 3,
      "eftdUser": 0,
      "eftdDay": 0
    },
    ...
    {
      "projectCode": "2022042200101",
      "coin": "FLOKI",
      "icon": "https://static.bymj.io/bhop/image/d0MIqiquKSLfA3mozelyHiWSN-v1x2a9U3KnAxfICeQ.svg",
      "labelName": null,
      "voteStartTime": 1650931200000,
      "voteEndTime": 1651103999000,
      "rewardStartTime": 1651104000000,
      "rewardEndTime": 1651118400000,
      "introduceContent": "FLOKI is the utility token of the Floki Ecosystem. The Floki Ecosystem is a community-powered ecosystem that aims to give people control of their finances through four key utility offerings: - The Valhalla NFT Metaverse Game. - The Floki University Crypto Education platform. - DeFi. - The FlokiPlaces NFT & Merchandise Marketplace.",
      "hasBudget": 2,
      "tokenType": " ETH & BNB ",
      "rewardPool": "2187500000",
      "rewardPoolCoin": "FLOKI",
      "prizePoolValue": "0",
      "price": null,
      "prizeCardId": null,
      "prizeCardValue": null,
      "assignableLimit": null,
      "voteLimit": 16055883,
      "singleUserVoteDown": 0,
      "singleUserVoteUp": 0,
      "listingRate": "74",
      "totalPrizePool": "0",
      "totalVoteNum": 12041912,
      "totalVoteUser": 15788,
      "userVotes": 0,
      "rewardCount": "0",
      "period": 4,
      "sort": 77,
      "eftdUser": 0,
      "eftdDay": 0
    }
  ],
  "success": true
}
```

List of parameters to parse:

- `coin`
- `icon`
- `voteStartTime`
- `voteEndTime`
- `rewardStartTime`
- `rewardEndTime`
- `introduceContent`