package com.example.contents.service;


import com.example.contents.dto.UserDto;
import com.example.contents.entity.UserEntity;
import com.example.contents.exceptions.UserNotFoundException;
import com.example.contents.exceptions.UsernameExistException;
import com.example.contents.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    // createUser
    public UserDto createUser(UserDto dto) {
        //username 중복여부 확인
        if(repository.existsByUsername(dto.getUsername())) {
            throw new UsernameExistException();
        }

        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(dto.getUsername());
        userEntity.setEmail(dto.getEmail());
        userEntity.setBio(dto.getBio());
        userEntity.setPhone(dto.getPhone());

        return UserDto.fromEntity(repository.save(userEntity));
    }

    // readUserByUsername
    public UserDto readUserByUsername(String username) {


        Optional<UserEntity> optionalUserEntity = repository.findByUsername(username);

        if(optionalUserEntity.isEmpty()){
            throw new UserNotFoundException();
        }

        UserEntity userEntity = optionalUserEntity.get();
        return UserDto.fromEntity(userEntity);
    }

    // updateUser
    public UserDto updateUser(Long id, UserDto dto) {
        //update user 로
        Optional<UserEntity> optionalUserEntity = repository.findById(id);

        if(optionalUserEntity.isEmpty()){
            throw new UserNotFoundException();
        }

        UserEntity modifiedUserEntity = optionalUserEntity.get();

        if(repository.existsByUsername(dto.getUsername())){
            throw new UsernameExistException();
        }

        modifiedUserEntity.setUsername(dto.getUsername());
        modifiedUserEntity.setBio(dto.getBio());
        modifiedUserEntity.setEmail(dto.getEmail());
        modifiedUserEntity.setPhone(dto.getPhone());

        return UserDto.fromEntity(modifiedUserEntity);
    }











    // updateUserAvatar
    public UserDto updateUserAvatar(Long id, MultipartFile avatarImage) {

        //1. 유저 존재 확인
        Optional<UserEntity> optionalUserEntity = repository.findById(id);

        if(optionalUserEntity.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        //2. file 을 어디에 업로드? 예외처리
        //media/{userId}/profile.png
        try{
             Files.createDirectories(Path.of(String.format("media/%d",id)));
        }
        catch (IOException e) {
            log.error(e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        //2-1. 폴더 만들기
        String profileDirection = String.format("media/%d/",id);
        log.info(profileDirection);

        //확장자를 포함한 이미지 이름 만들기
        String originalFilename = avatarImage.getOriginalFilename();

        //queue.png => fileNameSplit = ["queue","png"]
        String[] fileNameSplit = originalFilename.split("\\.");
        String extension = fileNameSplit[fileNameSplit.length-1]; //확장자
        String profileFilename = "profile."+extension;
        log.info(profileFilename);

        //폴더와 파일 경로를 포함한 이름 만들기
        String profilePath = profileDirection + profileFilename;

        //MultipartFile 저장하기
        try{
            avatarImage.transferTo(Path.of(profilePath));
        }
        catch (IOException e){
            log.error(e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        log.info(String.format("/static/%d/%s",id,profileFilename));

        String path1 = "/static"; //절대경로. Localhost:8080바로 뒤에 static 을 써주세요!
        String path2 = "static"; //상대경로. 내가 있는 곳에서 상대적 위치


        //UserEntity 업데이트 (정적 프로필 이미지를 회수할 수 있는 url)
        UserEntity userEntity = optionalUserEntity.get();
        userEntity.setAvatar(String.format("/static/%d/%s",id,profileFilename));

        return UserDto.fromEntity(repository.save(userEntity));
    }
}