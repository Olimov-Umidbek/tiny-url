package uz.umidbek.tiny.url.exceptions;

public class ShortenerAlgorithmNotFoundException extends TinyUrlException {
    public ShortenerAlgorithmNotFoundException(String message) {
        super(message);
    }

    public ShortenerAlgorithmNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
