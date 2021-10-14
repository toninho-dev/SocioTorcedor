package com.everis.socioTorecedor.Socio_Torcedor.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler (DataIntegrityViolationException.class)
    public ResponseEntity<StandardError> handleDataIntegritViolationException(DataIntegrityViolationException e){
        StandardError st = new StandardError("Dados já cadastrado no sistema");
        return ResponseEntity.status(HttpStatus.CONFLICT).body(st);
    }
}
