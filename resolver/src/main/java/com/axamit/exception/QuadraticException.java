package com.axamit.exception;

public class QuadraticException extends Exception {
    public QuadraticException(Throwable cause, String message) {
        super(message, cause);
    }

    public QuadraticException(String message) {
        super(message);
    }
}
