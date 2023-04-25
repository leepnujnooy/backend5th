package com.example.javaproject2.week02.day02;

import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeAscii {
    InputStreamReader is = new InputStreamReader(System.in);

    public static void main(String[] args) throws IOException {
        //인풋스트림리더 클래스 사용
        ChangeAscii ca = new ChangeAscii();
        System.out.println(ca.is.read());
    }
}
