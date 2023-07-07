package com.example.authentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    @GetMapping
    public String root(){
        return "hello";
    }

    @GetMapping("/no-auth")
    public String noAuth(){
        return "no auth 누구나 접근가능";
    }

    @GetMapping("/re-auth")
    public String reAuth(){
        return "re auth 인증된 사용자만 접근가능";
    }
}
