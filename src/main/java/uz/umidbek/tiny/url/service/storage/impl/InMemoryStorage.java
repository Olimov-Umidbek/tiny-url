package uz.umidbek.tiny.url.service.storage.impl;

import uz.umidbek.tiny.url.service.storage.Storage;

public class InMemoryStorage implements Storage {

    @Override
    public void put(String longUrl, String shortUrl) {

    }

    @Override
    public String get(String shortUrl) {
        return null;
    }

    @Override
    public String putAndGet(String longUrl, String shortUrl) {
        return null;
    }
}
