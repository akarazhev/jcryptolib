# Bybit Megadrop

Buy Earn products on Bybit to win points and share the new token prize pool.

Request URL with curl:

```bash
curl 'https://www.bybit.com/x-api/spot/api/megadrop/v1/prizePool/tokenList' \
  -H "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8" \
  -H "Accept-Encoding: gzip, deflate, br, zstd" \
  -H "Accept-Language: en-US,en;q=0.5" \
  -H "Alt-Used: www.bybit.com" \
  -H "Priority: u=0, i" \
  -H "Sec-Fetch-Dest: document" \
  -H "Sec-Fetch-Mode: navigate" \
  -H "Sec-Fetch-Site: none" \
  -H "Sec-Fetch-User: ?1" \
  -H "TE: trailers" \
  -H "Upgrade-Insecure-Requests: 1" \
  -H "User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:140.0) Gecko/20100101 Firefox/140.0"
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