package com.example.javaproject2.week01;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {

    public void readAChar() throws IOException {

        // 인풋 스트림리더 라는 클래스를 is 라는 이름으로 선언
        InputStreamReader is;

        // 인풋 스트림리더를 인스턴스화
        is = new InputStreamReader(System.in);

        // 인풋 스트림리더에서 한 글자를 읽어 옴
        int asciiCode = is.read();

        // 읽어 온 문자열 코드를 출력
        System.out.println(asciiCode);
    }

    public void readTwoChars() throws IOException {

        //인풋 스트림리더 라는 클래스를 is 라는 이름으로 선언 및 인스턴스화
        InputStreamReader is = new InputStreamReader(System.in);

        //하나씩
        int asciiCode1 = is.read();
        int asciiCode2 = is.read();

        System.out.println("asciiCode1 = " + asciiCode1);
        System.out.println("asciiCode2 = " + asciiCode2);
    }

}


