package com.example.contents.service;


import com.example.contents.dto.UserDto;
import com.example.contents.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    // createUser
    public UserDto createUser(UserDto dto) {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }

    // readUserByUsername
    public UserDto readUserByUsername(String username) {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }

    // updateUser
    public UserDto updateUser(Long id, UserDto dto) {

        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }

    // updateUserAvatar
    public UserDto updateUserAvatar(Long id, MultipartFile avatarImage) {
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }
}