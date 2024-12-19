package uz.umidbek.tiny.url.service.storage;

import uz.umidbek.tiny.url.enums.StorageType;
import uz.umidbek.tiny.url.exceptions.StorageNotFoundException;
import uz.umidbek.tiny.url.service.storage.impl.InMemoryStorage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class StorageFactory {

    private static StorageFactory INSTANCE;
    private final Map<StorageType, Storage> map = new ConcurrentHashMap<>();

    private StorageFactory() {
        map.put(StorageType.IN_MEMORY, new InMemoryStorage());
    }

    public static synchronized StorageFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new StorageFactory();
        }

        return INSTANCE;
    }

    public Storage getStorage(StorageType storageType) {
        if (!map.containsKey(storageType)) {
            throw new StorageNotFoundException("Storage implementation not found for " + storageType);
        }

        return map.get(storageType);
    }


}
