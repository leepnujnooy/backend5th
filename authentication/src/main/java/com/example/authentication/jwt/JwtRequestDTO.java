package com.example.authentication.jwt;

import lombok.Data;

@Data
public class JwtRequestDTO {
    //Jwt 요청 안에 있는 아이디와 패스워드. 서버의 유저가 맞는지 확인하기위한 DTO f이 다
    private String username;
    private String password;
}
