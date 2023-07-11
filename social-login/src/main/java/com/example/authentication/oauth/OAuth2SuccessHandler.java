package com.example.authentication.oauth;

import com.example.authentication.jwt.JwtTokenUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Slf4j
@RequiredArgsConstructor
public class OAuth2SuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
    //Oauth2 통신이 잘 마무리되면 사용되는 클래스이다.
    //JWT 를 활용한 인증
    //ID Provider 에게 받은 정보를 바탕으로 JWT 를 발급하는 역할
    //JWT 를 발급하고 클라이언트가 저장할 수 있도록 특정 URL 로 redirect

    //JWT 토큰을 generate 하기 위해 정의
    private final JwtTokenUtils jwtTokenUtils;


    @Override
    //인증 success 시 호출되는 method
    public void onAuthenticationSuccess(
            HttpServletRequest request,
            HttpServletResponse response,
            Authentication authentication) throws IOException, ServletException {

        // OAuth2UserServiceImpl 에서 반환한 DefaultOAuth2User 가 저장된다.
        OAuth2User oAuth2User = (OAuth2User) authentication.getPrincipal();

        // JWT 토큰 생성
        String jwt = jwtTokenUtils.generateToken(User
                .withUsername(oAuth2User.getName())
                .password(oAuth2User.getAttribute("id").toString())
                .build());

        // URL 목적지 설정
        String targetUrl = String.format("http://localhost:8080/token/val?token=%s",jwt);

        // Redirect response 생성
        getRedirectStrategy().sendRedirect(request,response,targetUrl);

    }
}
