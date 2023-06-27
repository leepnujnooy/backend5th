package com.example.aop.controller;


import com.example.aop.aspect.LogArguments;
import com.example.aop.aspect.LogExecutionTime;
import com.example.aop.dto.ResponseDTO;
import com.example.aop.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserController {

    //controller 코드를 크게 바꾸지 않으면서
    //부수적인 기능을 추가
    @PostMapping("/users")
    @LogArguments
    @LogExecutionTime
    public ResponseDTO addUser(@RequestBody UserDTO userDTO){
        log.info(userDTO.toString());
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setMessage("add user");

        return responseDTO;
    }

    @GetMapping("/users")
    @LogArguments
    public ResponseDTO getUsers(){
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setMessage("hi");

        return responseDTO;
    }
}
