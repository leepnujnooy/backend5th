package com.example.authentication.repository;

import com.example.authentication.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    //1. 사용자 계정이름으로 사용자 정보를 회수하는 기능
    //2. 사용자 계정이름을 가진 사용자 정보가 존재하는지 판단하는 기능
    //filter chain 으로 굴러감
    Optional<UserEntity> findByUsername(String username);
    boolean existsByUsername (String username);
}
