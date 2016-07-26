package com.stnetix.cloudraid.util.exception;

/**
 * @author http://www.codejava.net/coding/how-to-calculate-md5-and-sha-hash-values-in-java
 */
public class HashGenerationException extends RuntimeException {
    public HashGenerationException() {
    }

    public HashGenerationException(String message) {
        super(message);
    }

    public HashGenerationException(String message, Throwable cause) {
        super(message, cause);
    }

    public HashGenerationException(Throwable cause) {
        super(cause);
    }
}
