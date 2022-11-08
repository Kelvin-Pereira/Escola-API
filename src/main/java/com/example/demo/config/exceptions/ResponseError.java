package com.example.demo.config.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class ResponseError {

    private int code;
    private String description;
    private Map<String, String> fields = new HashMap<>();
}
