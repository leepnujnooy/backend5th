package com.example.contents;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ExtendWith(MockitoExtension.class)
public class UserControllerTests {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    //controller 가 있을 때 HTTP 요청이 보내졌다 가정해주는 객체
    private MockMvc mockMvc;

    @BeforeEach
    public void beforeEach(){
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
        // UserDto > JSON
        // JSON > UserDto   >>>> 직렬화 역직렬화 , Serialization
    }

    @Test
    @DisplayName("UserDto 를 나타내는 JSON 요청을 보낼 시 id != null 인 UserDto JSON 응답")
    public void createTest() throws Exception{
        //given

        //when
        //then
    }

}
