# Bybit Megadrop (MD)

Buy Earn products on Bybit to win points and share the new token prize pool.

## Project Information

Request API with headers:

```text
GET /x-api/spot/api/megadrop/v1/prizePool/tokenList HTTP/3

Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: en-US,en;q=0.5
Alt-Used: www.bybit.com
Priority: u=0, i
Referer: https://www.bybit.com/en/trade/spot/megadrop
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
      "activityId": 9,
      "tokenName": "TAC",
      "tokenIcon": "https://s1.bycsi.com/app/assets/token/a17254e5d1964ea260f89179f85a029f.png",
      "tokenInfoList": [],
      "startTime": 1752148800000,
      "endTime": 1752451199000,
      "claimStartTime": 1752501600000,
      "claimEndTime": 1752588000000,
      "totalPrizePool": "50000000",
      "activityStatus": 1,
      "userMaxNum": "0.01",
      "totalNumberAwards": 1,
      "awardInterval": 0,
      "minRewardAmount": "0.0001"
    }
  ],
  "success": true
}
```

List of parameters to parse:

- `tokenName`: the token name
- `tokenIcon`: the token icon
- `startTime`: the start time of the pool
- `endTime`: the end time of the pool
- `claimStartTime`: the start time of the claim
- `claimEndTime`: the end time of the claim