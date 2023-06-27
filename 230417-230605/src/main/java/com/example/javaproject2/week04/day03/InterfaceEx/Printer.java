package com.example.javaproject2.week04.day03.InterfaceEx;

import java.io.IOException;

public interface Printer {
    //프린트라는 메소드 는 스트링 배열만 읽음
    void print(String[] lines) throws IOException;
}
