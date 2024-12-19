package uz.umidbek.tiny.url.service.storage;

public interface Storage {

    void put(String longUrl, String shortUrl);

    String get(String shortUrl);

    String putAndGet(String longUrl, String shortUrl);
}
