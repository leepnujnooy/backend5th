package com.example.contents;

import com.example.contents.entity.UserEntity;
import org.apache.catalina.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@DataJpaTest
public class UserRepositoryTests {
    //오토와이어드로 의존성주입하는건 지양하라

    @Autowired //의존성주입이 필요하다 라는것을 알려주는 어노테이션
    private UserRepository userRepository;


    // [Test] Create New UserEntity on DataBase
    @Test
    @DisplayName("[성공] 새 엔티티를 데이터베이스에 추가 성공")
    public void saveEntityTest(){ // 기웬덴 패턴

        // given : 테스트가 진행되기 위한 기본 조건
        String username = "jun.dev";
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(username);

        // when : 테스트 하고싶은 실제 기능을 작성하는 구간
        userRepository.save(userEntity);

        // then : 실행한 결과가 기대한 것과 같은지 검증하는 구간
        // 기대하는 바
        // 1. 새로 반환받은 user 의 Id는 not Null
        assertNotNull(userEntity.getId());
        // 2. 새로 반환받은 user 의 username 은 "jun.dev"
        assertEquals(username, userEntity.getUsername());

    }

    @Test
    @DisplayName("[실패] 새 엔티티를 데이터베이스에 추가 실패")
    public void saveEntityTestFail(){

        //given
        String username = "junpeel";
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(username);
        userRepository.save(userEntity);

        //when 같은 userName을 가진 새 엔티티 save 시도
        UserEntity userEntity2 = new UserEntity();
        userEntity2.setUsername(username);

        //then 예외처리
        assertThrows(Exception.class, () -> userRepository.save(userEntity2));

    }

    @Test
    @DisplayName("username 으로 UserEntity 찾기")
    public void findByUsernameTest(){
        //given
        String username = "junpeel";
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(username);
        userRepository.save(userEntity);

        //when
        Optional<UserEntity> optional = userRepository.findByUsername(username);

        //then
        assertTrue(optional.isPresent());
    }
}
