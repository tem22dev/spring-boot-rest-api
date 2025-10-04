package com.tem.restdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CLoudVendorExceptionHandler {
    @ExceptionHandler(value = {CLoudVendorNotFoundException.class})
    public ResponseEntity<Object> handleCloudVendorNotFoundException(CLoudVendorNotFoundException cLoudVendorNotFoundException) {
        CLoudVendorException cLoudVendorException = new CLoudVendorException(
                cLoudVendorNotFoundException.getMessage(),
                cLoudVendorNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(cLoudVendorException, HttpStatus.NOT_FOUND);
    }
}
