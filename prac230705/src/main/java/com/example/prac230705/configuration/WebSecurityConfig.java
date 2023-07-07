package com.example.prac230705.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

// 5.7 버전 이전: extends WebSecurityConfigurerAdapter
// 6.1 버전 이후: Builder -> Lambda 를 이용 DSL 기반 설정
@Configuration
// @EnableWebSecurity  // 2.1 버전 이후 Spring Boot Starter Security 에서는 필수 아님
public class WebSecurityConfig {
    @Bean  // 메소드의 결과를 Bean 객체로 등록해주는 어노테이션
    // DI 자동으로 설정됨, 빌더 패턴 처럼 쓴다.
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(
                        // HTTP 요청 허가 관련 설정을 하고 싶다.
                        // requestMatchers == 어떤 URL 로 오는 요청에 대하여 설정하는지
                        // permitAll() == 누가 요청해도 허가한다.
                authHttp -> authHttp
                                .requestMatchers("/no-auth")
                                .permitAll()
                                .requestMatchers("/re-auth")
                                .authenticated() //인증 된 사용자만 허가
                                .requestMatchers("/")
                                .anonymous() //인증 되지 않은 사용자만 허가
                )
                .formLogin(
                        formLogin -> formLogin
                                .loginPage("/users/login") //로그인 하는 경로 지정
                                .defaultSuccessUrl("/users/my-profile") //로그인 성공시 이동하는 경로
                                .failureUrl("/users/login?fail") // 로그인 실패시 이동하는 경로
                                .permitAll()
                );

        return http.build();
    }

    @Bean
    public UserDetailsManager userDetailsManager(){
        //임시 유저
        UserDetails tempUser = User.withUsername("tempUser")
                .password(passwordEncoder().encode("password"))
                .build();


        //Spring 에서 미리 만들어 놓은 사용자 인증 서비스
        return new InMemoryUserDetailsManager(tempUser);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        //기본적으로 사용자 비밀번호는 관리자 눈에 보이면 안된다
        //해독 가능한 형태로 데이터베이스에 저장하면 안된다
        //그래서 기본적으로 비밀번호를 단방향 암호화 하는 인코더를 사용한다
        return new BCryptPasswordEncoder();
    }



}