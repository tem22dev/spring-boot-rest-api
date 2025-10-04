package com.tem.restdemo.exception;

public class CLoudVendorNotFoundException extends RuntimeException {
    public CLoudVendorNotFoundException(String message) {
        super(message);
    }

    public CLoudVendorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
