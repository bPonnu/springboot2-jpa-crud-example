package net.guides.springboot2.springboot2jpacrudexample.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// is used in GlobalExceptionHandler.class
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {

    // to prevent InvalidClassExceptions while serialization
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException (String message){
        super(message);
    }
}
