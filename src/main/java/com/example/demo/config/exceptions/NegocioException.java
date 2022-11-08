package com.example.demo.config.exceptions;

public class NegocioException extends RuntimeException {

    public NegocioException(String s, Exception e) {
        super(s);
    }
}
