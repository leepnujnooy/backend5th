package com.example.authentication.service;

import com.example.authentication.entity.CustomUserDetails;
import com.example.authentication.entity.UserEntity;
import com.example.authentication.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Slf4j
@Service // 서비스 빈으로 등록
//UserDetailsManager 인터페이스의 구현체로 만들면 Spring security filter 에서 사용자 정보 회수에 활용가능
public class JpaUserDetailsManager implements UserDetailsManager {

    private final UserRepository userRepository;

    public JpaUserDetailsManager(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    //가장 핵심이 되는 메소드
    //UserDetailsService.loadUserByUsername(String)
    //실제로 Spring security 내부에서 사용하는 반드시 구현해야 정상동작을 기대할수있는 메소드
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserEntity> optional = userRepository.findByUsername(username);

        //optional 에 값이 없다면
        if(optional.isEmpty()){
            throw new UsernameNotFoundException(username);
        }
        UserEntity userEntity = optional.get();

//        return User.withUsername(userEntity.getUsername())
//                .password(userEntity.getPassword())
//                .build();
        return CustomUserDetails.fromEntity(userEntity);
    }

    @Override
    //[선택] 새로운 사용자를 저장하는 메소드
    /**
     재미있는 기능
     */
    public void createUser(UserDetails userDetails) {
        if(this.userExists(userDetails.getUsername())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        try{
            userRepository.save(((CustomUserDetails) userDetails).newEntity());
        }catch (ClassCastException e){
            log.error("failed to Cast to {}",CustomUserDetails.class);
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
//
//        UserEntity userEntity = UserEntity
//                .builder()
//                .username(user.getUsername())
//                .password(user.getPassword())
//                .build();
//        userRepository.save(userEntity);
    }

    @Override
    //[선택] 계정이름을 가진 사용자가 존재하는지 확인하는 메소드
    public boolean userExists(String username) {
        return userRepository.existsByUsername(username);
    }

    @Override
    public void updateUser(UserDetails user) {

    }

    @Override
    public void deleteUser(String username) {

    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {

    }

}