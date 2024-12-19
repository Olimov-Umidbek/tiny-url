package uz.umidbek.tiny.url.enums;

import uz.umidbek.tiny.url.exceptions.UnknownStorageTypeException;

public enum StorageType {
    IN_MEMORY,
    REDIS,
    DB,
    CLOUD;

    public StorageType getStorageTypeByName(String name) {
        try {
            return StorageType.valueOf(name);
        } catch (IllegalArgumentException e) {
            throw new UnknownStorageTypeException("Unknown storage type, value = " + name);
        }
    }
}
