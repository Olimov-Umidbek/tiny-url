package uz.umidbek.tiny.url.service.shortener.impl;

import uz.umidbek.tiny.url.enums.Shortener;
import uz.umidbek.tiny.url.service.shortener.ShortenerAlgorithm;

public class Base62Shortener implements ShortenerAlgorithm {
    @Override
    public String getShort(String link) {
        return null;
    }

    @Override
    public Shortener shortener() {
        return Shortener.BASE62;
    }
}
