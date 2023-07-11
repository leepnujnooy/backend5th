package com.example.authentication.jwt;


import com.example.authentication.entity.CustomUserDetails;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.ArrayList;

@Slf4j
@Component
//사용자가 헤더에 포함한 JWT 를 해석하고, 그에 따라 사용자가 인증된 상태인지를 확인하는 용도로 사용
public class JwtTokenFilter extends OncePerRequestFilter { //비동기 , 폼 등 데이터 요청시 필터를 한번만 거치도록해주는 인터파이스
    private final JwtTokenUtils jwtTokenUtils;

    public JwtTokenFilter(JwtTokenUtils jwtTokenUtils) {
        this.jwtTokenUtils = jwtTokenUtils;
    }

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain) throws ServletException, IOException {

        //jwt 가 포함되어 있으면 포함된 헤더를 요청함
        String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);

        //authHeader 가 null 이 아니면서 "Bearer" 로 구성되어 있어야 정상적인 인증정보
        if(authHeader != null && authHeader.startsWith("Bearer ")){
            //JWT 토큰 정보를 회수하여 정상적인 놈인지 확인
            String token = authHeader.split(" ")[1];
            if(jwtTokenUtils.validate(token)){
                //웹상에서 많은 예시
                //SecurityContextHolder.getContext().setAuthentication();
                //공식 문서 추천
                SecurityContext securityContext = SecurityContextHolder.createEmptyContext();

                //JWT 에서 사용자 이름 갖고오기
                String username = jwtTokenUtils
                        .parseClaims(token)
                        .getSubject();

                //사용자 인증 정보 생성
                AbstractAuthenticationToken abstractAuthenticationToken =
                        new UsernamePasswordAuthenticationToken(
                                CustomUserDetails.builder()
                                        .username(username)
                                        .build(),
                                token,
                                new ArrayList<>()
                        );

                securityContext.setAuthentication(abstractAuthenticationToken);
                SecurityContextHolder.setContext(securityContext);
            }
            else{
                log.warn("jwt 유효성 검증 실패");
            }
        }
        filterChain.doFilter(request,response);
    }
}
