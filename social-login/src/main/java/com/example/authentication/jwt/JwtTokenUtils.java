package com.example.authentication.jwt;



import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtParser;
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
    private final JwtParser jwtParser;

    //yaml 파일 안에 있는 jwt.secret 값을 가져옴
    public JwtTokenUtils(@Value("${jwt.secret}") String jwtSecret){

        this.signingKey = Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtSecret));

        this.jwtParser = Jwts.parserBuilder()
                            .setSigningKey(this.signingKey)
                            .build();
    }

    //주어진 사용자 정보를 바탕으로 JWT를 문자열로 생성
    public String generateToken(UserDetails userDetails){
        //claims : JWT 에 담기는 정보의 단위를 클레임이라고 한다.
        // 또한 클레임즈는 클레임들을 담기위한 Map 의 상속 인터페이스
        Claims jwtClaims = Jwts.claims()
                .setSubject(userDetails.getUsername())
                .setIssuedAt(Date.from(Instant.now()))
                .setExpiration(Date.from(Instant.now().plusSeconds(5)));

        return Jwts.builder()
                .setClaims(jwtClaims)
                .signWith(signingKey)
                .compact();
    }


    //JWT 가 유효한지 판단하는 메서드
    //jjwt library 에서는 JWT를 해석하는 과정에서
    //유효하지 않으면 예외발생

    public boolean validate(String token){
        //알맞은 JWT 면 참 . 아니면 거짓
        //parseClaimsJws : 아모화된 JWT 를 해석하기 위한 메소드
        try{
            jwtParser.parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //JWT를 인자로 받고, 그 JWT를 해석해서 사용자 정보를 회수하는 메서드
    public Claims parseClaims(String token){
        return jwtParser
                .parseClaimsJws(token)
                .getBody();
    }

}
//1 요청에 authorization 헤더가 있나 확인. 없으면 비인증 사용자
//2 jwt 해석 ( 헤더가 베어러로 시작하는지 ... )
//3 인증상태 기록