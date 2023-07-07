package com.example.authentication.jwt;



import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.time.Instant;
import java.util.Date;


//jwt 관련 기능들을 넣어두기위한 기능성 클래스
@Slf4j
@Component
public class JwtTokenUtils {
    private final Key signingKey;

    //yaml 파일 안에 있는 jwt.secret 값을 가져옴
    public JwtTokenUtils(@Value("${jwt.secret}") String jwtSecret){
        log.info(jwtSecret);
        this.signingKey = Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtSecret));
    }

    //주어진 사용자 정보를 바탕으로 JWT를 문자열로 생성
    public String generateToken(UserDetails userDetails){
        //claims : JWT 에 담기는 정보의 단위를 클레임이라고 한다.
        // 또한 클레임즈는 클레임들을 담기위한 Map 의 상속 인터페이스
        Claims jwtClaims = Jwts.claims()
                .setSubject(userDetails.getUsername())
                .setIssuedAt(Date.from(Instant.now()))
                .setExpiration(Date.from(Instant.now().plusSeconds(3600)));

        return Jwts.builder()
                .setClaims(jwtClaims)
                .signWith(signingKey)
                .compact();
    }
}
