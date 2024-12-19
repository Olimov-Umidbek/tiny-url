package uz.umidbek.tiny.url.exceptions;

public class TinyUrlException extends RuntimeException {

    public TinyUrlException(String message) {
        super(message);
    }

    public TinyUrlException(String message, Throwable cause) {
        super(message, cause);
    }
}
