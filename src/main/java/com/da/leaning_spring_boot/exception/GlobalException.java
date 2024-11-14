package com.da.leaning_spring_boot.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(value=RuntimeException.class)
    ResponseEntity<String> handlingRuntime(RuntimeException e){
        return ResponseEntity.badRequest().body(e.getMessage());
    }
    @ExceptionHandler(value=MethodArgumentNotValidException.class)
    ResponseEntity<String> handlingArgumentNotValid(MethodArgumentNotValidException e){
        
        return ResponseEntity.badRequest().body(e.getFieldError().getDefaultMessage());
    }
}
