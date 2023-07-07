package com.example.authentication.controller;


import com.example.authentication.entity.CustomUserDetails;
import com.example.authentication.jwt.JwtRequestDTO;
import com.example.authentication.jwt.JwtTokenDTO;
import com.example.authentication.jwt.JwtTokenUtils;
import com.example.authentication.service.JpaUserDetailsManager;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
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
    private final UserDetailsManager userDetailsManager;
    private final PasswordEncoder passwordEncoder;

    //로그인 페이지
    @GetMapping("/login")
    public String loginForm(){

        return "login-form";
    }

    //로그인 후 페이지
    @GetMapping("/my-profile")
    public String profileForm(Model model, Authentication authentication){
        model.addAttribute("username", authentication.getName());
        CustomUserDetails customUserDetails = (CustomUserDetails) authentication.getPrincipal();
        return "my-profile";
    }


    //회원가입 페이지
    @GetMapping("/register")
    public String registerForm(){return "register-form";}

    //회원가입 post
    @PostMapping("/register")
    public String registerPost(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            @RequestParam("password-check") String passwordCheck
    ){

        userDetailsManager.createUser(
                CustomUserDetails.builder()
                        .username(username)
                        .password(passwordEncoder.encode(password))
                        .build());
        return "redirect:/users/login";
    }

}
