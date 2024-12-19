package uz.umidbek.tiny.url.service.shortener;

import uz.umidbek.tiny.url.enums.Shortener;

public interface ShortenerAlgorithm {

    String getShort(String link);

    Shortener shortener();
}
