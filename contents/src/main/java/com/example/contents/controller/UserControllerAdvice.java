package com.example.contents.controller;

import com.example.contents.dto.ResponseDto;
import com.example.contents.exceptions.Status400Exception;
import com.example.contents.exceptions.Status404Exception;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class UserControllerAdvice {
    @ExceptionHandler(Status400Exception.class)
    public ResponseEntity<ResponseDto> handle400(Status400Exception exception){
        ResponseDto responseDto = new ResponseDto();
        //responseDto.setMessage("UserControllerAdvice 에서 처리한 예외");
        responseDto.setMessage(exception.getMessage());
        return ResponseEntity
                .badRequest()
                .body(responseDto);
    }

    @ExceptionHandler(Status404Exception.class)
    public ResponseEntity<ResponseDto> handle404(Status404Exception exception){
        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage(exception.getMessage());
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(responseDto);
    }
}
