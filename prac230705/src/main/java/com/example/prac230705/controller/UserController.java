package com.example.prac230705.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/users")
public class UserController {

    //1 . 로그인 페이지로 온다.
    //2 . 로그인 페이지에 아이디 비밀번호를 입력한다.
    //3 . 성공하면 마이 프로필로 이동한다.




    //로그인 페이지를 위한 겟매핑
    @GetMapping("/login")
    public String loginForm(){
        return "login-form";
    }

    //로그인 성공 후 로그인 여부를 판단하기위한 겟매핑
    @GetMapping("/my-profile")
    public String myProfile(){
        return "my-profile";
    }
}
