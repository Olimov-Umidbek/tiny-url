package uz.umidbek.tiny.url.exceptions;

public class StorageNotFoundException extends TinyUrlException{

    public StorageNotFoundException(String message) {
        super(message);
    }

    public StorageNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
