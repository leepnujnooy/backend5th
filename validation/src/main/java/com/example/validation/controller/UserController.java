package com.example.validation.controller;

import com.example.validation.dto.UserDto;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class UserController {
    @PostMapping("/users")
    public ResponseEntity<Map<String, String>> addUser(@Valid @RequestBody UserDto userDto){
        log.info(userDto.toString());
        Map<String, String> responseBody = new HashMap<>();//@Vaild 는 UserDto가 우리가 정의한 요구사항을 지키는지검사
        responseBody.put("message","SUCCESS");

        return ResponseEntity.ok(responseBody);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleValidationException(MethodArgumentNotValidException exception) {
        Map<String, String> errors = new HashMap<>();
        for (FieldError error: exception
                .getBindingResult().getFieldErrors()) {
            errors.put(error.getField(), error.getDefaultMessage());
        }
        return errors;
    }

}
