package com.dt.SpringBootAngularJpa.exception;

public class UserNotFondException extends RuntimeException {
    public UserNotFondException(String message) {
        super(message);
    }
}
