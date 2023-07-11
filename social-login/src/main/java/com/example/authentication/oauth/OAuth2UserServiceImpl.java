package com.example.authentication.oauth;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


@Service
public class OAuth2UserServiceImpl extends DefaultOAuth2UserService {

    @Override
    public OAuth2User loadUser(OAuth2UserRequest request) throws OAuth2AuthenticationException {
        OAuth2User oAuth2User = super.loadUser(request);

        //사용할 데이터를 재정의

        //사용할 데이터를 정리하는 목적의 Map
        Map<String , Object> attributes = new HashMap<>();

        //attributes.get("provider") -> "naver" 하기 위한 목적
        attributes.put("provider","naver");

        //받은 사용자의 데이터를 정리
        Map<String,Object> responseMap = oAuth2User.getAttribute("response");
        attributes.put("id",responseMap.get("id"));
        attributes.put("email",responseMap.get("email"));
        attributes.put("nickname",responseMap.get("nickname"));
        String nameAttribute = "email";

        return new DefaultOAuth2User(
                Collections.singleton(new SimpleGrantedAuthority("USER")),
                attributes,
                nameAttribute
        );
    }

}
