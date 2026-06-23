package com.example.Custom.Exception.Exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public String NotUserNotFoundException(UserNotFoundException ex)
    {
        return ex.getMessage();
    }
}
