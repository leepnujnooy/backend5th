package com.example.aop.dto;

import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String passwordCheck;
    private String phone;
}
