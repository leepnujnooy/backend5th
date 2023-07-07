package com.example.authentication.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.bind.annotation.RequestMapping;


//5.7 버전 이전 : extends WebSecurityConfigurerAdapter
//6.1 버전 이후 : Builder > Lambda 이용한 DSL 기반 설정
@Configuration
public class WebSecurityConfig {
    @Bean //메소드의 결과를 Bean 객체로 등록해주는 어노테이션
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
        httpSecurity
                //csrf() : CSRF 공격을 막기위해 토큰을 생성하는건데 , REST API 에서는 stateless 하기 때문에 ( 서버에 인증정보를 저장하는게 아니기 때문에 ) CSRF 로 부터 안전함
                .csrf(AbstractHttpConfigurer::disable)
                //requestMatchers() : URL 지정
                //permitAll() : 인증되지 않은 사용자 & 인증된 사용자 모두 접근 가능
                //authenticated() : 인증된 사용자만 접근 가능
                //anonymous() : 로그인 되지 않은 사용자만 접근 가능
                .authorizeHttpRequests(
                authHttp -> authHttp
//                        .requestMatchers("/users")
//                        .permitAll()
//                        .requestMatchers("/users/my-profile" , "/users/logout")
//                        .authenticated()
//                        .requestMatchers("/users/register")
//                        .anonymous()
                        .requestMatchers("/token/issue").permitAll()
                        .requestMatchers("/users/my-profile").authenticated()
                        .requestMatchers("/").anonymous()
                )
//                .formLogin(
//                        formLogin -> formLogin
//                                .loginPage("/users/login")
//                                .defaultSuccessUrl("/users/my-profile")
//                                .failureUrl("/users/login?fail")
//                                .permitAll()
//                )
//                .logout(
//                        logOut -> logOut
//                                .logoutUrl("/users/logout")
//                                .logoutSuccessUrl("/users/login")
//                )
                .sessionManagement(
                        sessionManagement -> sessionManagement
                                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                )
        ;

        return httpSecurity.build();
    }

//    @Bean //사용자 관리를 위한 인터페이스 구현체 빈
//    public UserDetailsManager userDetailsManager(){
//        //temp
//        UserDetails temp = User.withUsername("temp")
//                .password(passwordEncoder().encode("password"))
//                .build();
//        return new InMemoryUserDetailsManager();
//    }

    @Bean //비밀번호 암호화를 위한 빈
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
