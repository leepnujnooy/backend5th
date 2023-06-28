package com.example.contents;

import com.example.contents.dto.UserDto;
import com.example.contents.entity.UserEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTests {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    //UserDto(id==null) 을 입력받아 UserDto(id!=null) 반환
    @Test
    @DisplayName("UserDto 로 createUser")
    public void createUserTest(){

        //given

        //1.UserRepository 에 전달받을 UserEntity 정의
        String username = "jun_peel";
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(username);

        //2.UserRepository 에 반환할 USerEntity 정의
        Long userId = 1L;
        UserEntity userEntity2 = new UserEntity();
        userEntity2.setId(userId);
        userEntity2.setUsername(username);

        //3.UserRepository 의 기능을 수동 설정하기
        when(userRepository.save(userEntity))
                .thenReturn(userEntity2);

        when(userRepository.existsByUsername(username))
                .thenReturn(false);

        //when
        UserDto userDto = new UserDto();
        userDto.setUsername(username);
        UserDto result = userService.createUser(userDto);

        //then
        assertEquals(userId, result.getId());
        assertEquals(username, result.getUsername());
    }
}
