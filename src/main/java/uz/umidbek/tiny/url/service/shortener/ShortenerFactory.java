package uz.umidbek.tiny.url.service.shortener;

import uz.umidbek.tiny.url.enums.Shortener;
import uz.umidbek.tiny.url.service.shortener.impl.Md5Shortener;
import uz.umidbek.tiny.url.service.shortener.impl.Base62Shortener;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ShortenerFactory {
    private static ShortenerFactory shortenerFactory;
    private final Map<Shortener, ShortenerAlgorithm> map = new ConcurrentHashMap<>();

    private ShortenerFactory() {
        map.put(Shortener.MD5, new Md5Shortener());
        map.put(Shortener.BASE62, new Base62Shortener());
    }

    public static ShortenerFactory getInstance() {
        if (shortenerFactory == null) {
            shortenerFactory = new ShortenerFactory();
        }

        return shortenerFactory;
    }

    public ShortenerAlgorithm getAlgorithm(Shortener shortener) {
        return map.get(shortener);
    }
}
