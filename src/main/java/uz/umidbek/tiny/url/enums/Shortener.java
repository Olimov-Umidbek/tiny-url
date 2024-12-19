package uz.umidbek.tiny.url.enums;

import uz.umidbek.tiny.url.exceptions.ShortenerAlgorithmNotFoundException;

public enum Shortener {
    BASE62,
    MD5,
    UUID;

    public Shortener getByName(String name) {
        try {
            return Shortener.valueOf(name);
        } catch (IllegalArgumentException e) {
            throw new ShortenerAlgorithmNotFoundException("Shortener algroithm not found, value=" + name);
        }
    }
}
