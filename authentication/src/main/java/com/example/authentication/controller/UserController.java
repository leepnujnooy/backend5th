package com.example.authentication.controller;


import com.example.authentication.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    //Dependency Injection
    private final UserService userService;

    //로그인 페이지
    @GetMapping("/login")
    public String loginForm(){return "login-form";}

    //로그인 후 페이지
    @GetMapping("/my-profile")
    public String profileForm(Model model, Authentication authentication){
        model.addAttribute("username", authentication.getName());
        return "my-profile";
    }


    //회원가입 페이지
    @GetMapping("/register")
    public String registerForm(){return "register-form";}

    //회원가입 창의 Parameter 포스트 요청 처리
    @PostMapping("/register")
    public String registerPost(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            @RequestParam("password-check") String passwordCheck
    ){
        userService.createUser(username,password,passwordCheck);
        return "redirect:/users/login";
    }

}
