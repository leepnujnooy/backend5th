package com.example.authentication.controller;


import com.example.authentication.jwt.JwtRequestDTO;
import com.example.authentication.jwt.JwtTokenDTO;
import com.example.authentication.jwt.JwtTokenUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
@RestController
@RequestMapping("token") // localhost:8080/token/** 부터시작되는요청
public class TokenController {

    // UserDetailsManager : 사용자 정보 회수
    // PasswordEncoder : 비밀번호 대조용 인코더
    // JwtTokenUtils : jwt 토큰을 발행
    private final UserDetailsManager userDetailsManager;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenUtils jwtTokenUtils;

    //dependency injection
    public TokenController(UserDetailsManager userDetailsManager,PasswordEncoder passwordEncoder,JwtTokenUtils jwtTokenUtils){
        this.userDetailsManager = userDetailsManager;
        this.passwordEncoder = passwordEncoder;
        this.jwtTokenUtils = jwtTokenUtils;
    }

    // /token/issue : JWT 발급용 Endpoint
    @PostMapping("/issue")
    public JwtTokenDTO issueJwt(@RequestBody JwtRequestDTO jwtRequestDTO){
        //사용자 정보 회수
        UserDetails userDetails = userDetailsManager.loadUserByUsername(jwtRequestDTO.getUsername());

        //기록된 비밀번호와 실제 비밀번호가 다를 때

        //passwordEncoder.matches(rawPassword, encodedPassword)

        //평문 비밀번호와 암호화 비밀번호를 비교할 수 있다.

        if(!passwordEncoder.matches(jwtRequestDTO.getPassword(),userDetails.getPassword())){

            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED);

         }

        JwtTokenDTO response = new JwtTokenDTO();

        response.setToken(jwtTokenUtils.generateToken(userDetails));


        return response;
    }
}
