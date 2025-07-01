package com.github.akarazhev.jcryptolib.stream;

public interface DataFetcher {

    void fetch();

    void cancel();
}
