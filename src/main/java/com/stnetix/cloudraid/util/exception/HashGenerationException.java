package com.stnetix.cloudraid.util.exception;

/**
 * Created by Vladislav Gasanov on 25.07.2016.
 */
public class HashGenerationException extends Exception {
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
