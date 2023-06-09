package com.amuse.www.demo.exception;

import lombok.Getter;
import org.springframework.validation.FieldError;

@Getter
public class SimpleFieldError extends FieldError {

    public SimpleFieldError(String field, String message) {
        super(field, field, message);
    }
}
