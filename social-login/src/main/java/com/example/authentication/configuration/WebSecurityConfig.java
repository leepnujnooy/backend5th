package com.example.authentication.configuration;

import com.example.authentication.jwt.JwtTokenFilter;
import com.example.authentication.oauth.OAuth2SuccessHandler;
import com.example.authentication.oauth.OAuth2UserServiceImpl;
import lombok.RequiredArgsConstructor;
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
import org.springframework.security.web.access.intercept.AuthorizationFilter;
import org.springframework.web.bind.annotation.RequestMapping;


//5.7 버전 이전 : extends WebSecurityConfigurerAdapter
//6.1 버전 이후 : Builder > Lambda 이용한 DSL 기반 설정
@Configuration
@RequiredArgsConstructor
public class WebSecurityConfig {

    private final JwtTokenFilter jwtTokenFilter;
    private final OAuth2UserServiceImpl oAuth2UserService;
    private final OAuth2SuccessHandler oAuth2SuccessHandler;
    @Bean //메소드의 결과를 Bean 객체로 등록해주는 어노테이션
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
        httpSecurity
                //csrf() : CSRF 공격을 막기위해 토큰을 생성하는건데 , REST API 에서는 stateless 하기 때문에 ( 서버에 인증정보를 저장하는게 아니기 때문에 ) CSRF 로 부터 안전함
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(
                authHttp -> authHttp
                        .requestMatchers("/token/**","/views/**").permitAll()
                )
                .sessionManagement(
                        sessionManagement -> sessionManagement
                                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                )
                .oauth2Login(
                        oauth2Login -> oauth2Login
                                .loginPage("/views/login")
                                .successHandler(oAuth2SuccessHandler)
                                .userInfoEndpoint(
                                        userInfo -> userInfo
                                                .userService(oAuth2UserService)
                                )
                )
                .addFilterBefore(jwtTokenFilter, AuthorizationFilter.class);
        return httpSecurity.build();
    }


}
