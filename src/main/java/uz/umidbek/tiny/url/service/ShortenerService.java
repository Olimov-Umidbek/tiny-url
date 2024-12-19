package uz.umidbek.tiny.url.service;

import uz.umidbek.tiny.url.config.props.ApplicationProperties;
import uz.umidbek.tiny.url.service.shortener.ShortenerAlgorithm;
import uz.umidbek.tiny.url.service.shortener.ShortenerFactory;
import uz.umidbek.tiny.url.service.storage.Storage;
import uz.umidbek.tiny.url.service.storage.StorageFactory;

import java.util.logging.Logger;

public class ShortenerService {
    private final Storage storage;
    private final ShortenerAlgorithm algorithm;

    private final Logger logger = Logger.getLogger(ShortenerService.class.getName());

    public ShortenerService(ApplicationProperties properties) {
        this.storage = StorageFactory.getInstance().getStorage(properties.storageType());
        this.algorithm = ShortenerFactory.getInstance().getAlgorithm(properties.shortener());
    }

    public String shortener(String longUrl) {
        String shortUrl = algorithm.getShort(longUrl);
        return storage.putAndGet(longUrl, shortUrl);
    }

    public String getOriginal(String shortUrl) {
        return storage.get(shortUrl);
    }
}
