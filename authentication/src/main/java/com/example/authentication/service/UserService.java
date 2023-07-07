package com.example.authentication.service;

import com.example.authentication.entity.UserEntity;
import com.example.authentication.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserDetailsManager userDetailsManager;
    private final PasswordEncoder passwordEncoder;

    //회원가입 요청 처리
    public void createUser(String username, String password, String passwordCheck){

        //비밀번호 다시입력 == 비밀번호 인지 아닌지
        if(!password.equals(passwordCheck)){
            throw new IllegalArgumentException("비밀번호를 확인하세요");
        }

        userDetailsManager.createUser(
                User.withUsername(username)
                    .password(passwordEncoder.encode(password))
                    .build());

        userRepository.save(
                UserEntity
                        .builder()
                        .username(username)
                        .password(password)
                        .build());
    }
}
