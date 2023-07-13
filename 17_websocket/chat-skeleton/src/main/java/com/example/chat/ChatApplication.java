package com.example.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatApplication.class, args);
	}

}
//일반적인 HTTP 통신의 경우 클라이언트의 요청에서 통신이 시작됩니다.
// 즉 사용자가 저희 서버를 사용하지 않는다면 저희가 먼저 사용자에게 데이터를 전달할 방법이 존재하지 않습니다.
// 그래서 HTTP 규약만 활용해서 서비스를 개발할 경우 채팅과 같이 서버 측에서 발생한 데이터를 사용자에게 전달해야 하는 기능을
// 만들기는 어렵습니다.
// 대신 저희가 사용할 수 있는 통신 규약으로 WebSocket 을 사용할 수 있습니다.