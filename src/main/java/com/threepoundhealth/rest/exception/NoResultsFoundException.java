package com.threepoundhealth.rest.exception;

/**
 * @author Kyle
 * @version 1.0
 */
public class NoResultsFoundException extends Exception {

    public NoResultsFoundException() {
    }

    public NoResultsFoundException(String message) {
        super(message);
    }

    public NoResultsFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoResultsFoundException(Throwable cause) {
        super(cause);
    }
}
