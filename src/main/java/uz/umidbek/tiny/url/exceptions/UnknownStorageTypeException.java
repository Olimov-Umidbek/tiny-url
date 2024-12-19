package uz.umidbek.tiny.url.exceptions;

public class UnknownStorageTypeException extends TinyUrlException {
    public UnknownStorageTypeException(String message) {
        super(message);
    }

    public UnknownStorageTypeException(String message, Throwable cause) {
        super(message, cause);
    }
}
