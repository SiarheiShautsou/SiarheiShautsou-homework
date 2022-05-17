package com.sheva.exception;

public class CarNotFoundException extends RuntimeException{

    private String firstMessage;
    private String secondMessage;

    public CarNotFoundException(String firstMessage, String secondMessage) {
        this.firstMessage = firstMessage;
        this.secondMessage = secondMessage;
    }

    public CarNotFoundException(String message, String firstMessage, String secondMessage) {
        super(message);
        this.firstMessage = firstMessage;
        this.secondMessage = secondMessage;
    }

    public CarNotFoundException(String message, Throwable cause, String firstMessage, String secondMessage) {
        super(message, cause);
        this.firstMessage = firstMessage;
        this.secondMessage = secondMessage;
    }

    public CarNotFoundException(Throwable cause, String firstMessage, String secondMessage) {
        super(cause);
        this.firstMessage = firstMessage;
        this.secondMessage = secondMessage;
    }

    public CarNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace,
                                String firstMessage, String secondMessage) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.firstMessage = firstMessage;
        this.secondMessage = secondMessage;
    }
}
