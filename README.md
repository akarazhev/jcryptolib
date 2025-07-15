# jcryptolib

[![Build Status](https://img.shields.io/badge/build-passing-brightgreen.svg)](https://github.com/akarazhev/jcryptolib)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

Java cryptocurrency utility library with reactive programming, HTTP support, and modular design that allows easy 
integration into Java-based trading, analytics, or data ingestion systems.

---

## Features

- **Reactive Streams** via RxJava 3
- **JSON Serialization/Deserialization** with Jackson
- **Logging** with SLF4J and Logback
- **Bybit Exchange Streaming** support
- Java Platform Module System (JPMS) enabled (`module-info.java`)
- MIT License

---

## Getting Started

### Requirements

- Java 23+ (or update `pom.xml` for Java 21 LTS)
- Maven 3.8+

### Installation

Add the dependency to your Maven project:

```xml
<dependency>
    <groupId>com.github.akarazhev.jcryptolib</groupId>
    <artifactId>jcryptolib</artifactId>
    <version>0.0.1</version>
</dependency>
```

---

## Usage

### Example: Subscribing to Data Consumer

```java
final var config = new DataConfig.Builder()
        .type(DataConfig.Type.WEBSOCKET)
        .isUseAuth(true)
        .key(key)
        .secret(secret)
        .url(url)
        .topics(topics)
        .build();
return Flowable.create(e -> DataConsumer.create(client, config).subscribe(e), BackpressureStrategy.BUFFER);
```

### Configuration

You can provide application settings in `src/main/resources/application.properties`.

---

## Development

### Build

```sh
mvn clean install
```

### Run Tests

```sh
mvn test
```

---

## Project Structure

```
src/
  main/
    java/
      module-info.java
      com/github/akarazhev/jcryptolib/
        bybit/
          stream/
        config/
        stream/
        util/
        package-info.java
    resources/
      application.properties
      logback.xml
  test/
    java/
      com/github/akarazhev/jcryptolib/
        bybit/
          stream/
        util/  
```

---

## Versions

- [0.0.1](https://github.com/jcryptolib/jcryptolib/releases/tag/v0.0.1) - Initial release that provides a basic set of
  utilities for working with cryptocurrencies:
  - CMC Market Data: 
    - Market Overview, Spot Market, Derivatives Market, Fear and Greed Index, Altcoin Season Index, Market Cycle Indicator, 
      Bitcoin Dominance, CoinMarketCap 100 Index.
  - Bybit Activities: 
    - Launchpool, Launchpad, Megadrop, ByVotes, Airdrop Hunt, ByStarter.
  - Bybit Trading Data: 
    - Ticker, Kline, Orderbook, All Liquidation.

---

## License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).

---

## Author

**Andrey Karazhev**  
[GitHub](https://github.com/akarazhev)

---

## Contributing

Pull requests and issues are welcome!
