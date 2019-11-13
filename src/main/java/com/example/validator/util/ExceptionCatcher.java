package com.example.validator.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ExceptionCatcher {


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> catchMethodArgumentNotValid(MethodArgumentNotValidException ex) {
        System.out.println(ex.getMessage());

        List<String> errores = new ArrayList<>();

        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
            errores.add(
                    error.getObjectName() + "." +
                            error.getField() + " : " +
                            error.getDefaultMessage()
            );
        }

        return new ResponseEntity<>(errores, HttpStatus.BAD_REQUEST);
    }
}
