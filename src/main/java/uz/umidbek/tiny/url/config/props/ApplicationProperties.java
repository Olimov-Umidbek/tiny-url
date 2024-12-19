package uz.umidbek.tiny.url.config.props;

import uz.umidbek.tiny.url.enums.Shortener;
import uz.umidbek.tiny.url.enums.StorageType;

import java.time.Duration;

public record ApplicationProperties(
    Duration keepUrl,
    StorageType storageType,
    Shortener shortener
) {
}
