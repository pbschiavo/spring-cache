package com.example.infrastructure.exception;

import com.example.dominio.adaptadores.dtos.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ResponseDTO> handleBadRequestException(BadRequestException ex) {
        return ResponseEntity.badRequest().body(new ResponseDTO(ex.getMessage()));
    }

    // Adicione métodos para lidar com outras exceções conforme necessário
}
