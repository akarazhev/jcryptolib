# jcryptolib

[![Build Status](https://img.shields.io/badge/build-passing-brightgreen.svg)](https://github.com/akarazhev/jcryptolib)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

Java cryptocurrency utility library with reactive programming, HTTP support, and modular design.

---

## Features

- **Reactive Streams** via RxJava 3
- **HTTP Client** integration using OkHttp
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
    <version>1.0-SNAPSHOT</version>
</dependency>
```

---

## Usage

### Example: Subscribing to Bybit Data Stream

```java
BybitDataStream dataStream = new BybitDataStream(new BybitConfig(...));
dataStream.subscribe(...); // Implement your logic here
```

### Configuration

You can provide application settings in `src/main/resources/application.properties` or `src/test/resources/application.properties` for tests.

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
        util/
    resources/
      application.properties
  test/
    java/
    resources/
      application.properties
```

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
