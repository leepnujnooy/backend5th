package com.example.javaproject2.week04.day03.Message;


//프린터인데 콘솔에 출력하는 프린터.
//인터페이스의 구현체
//implements > 구현 하겠다는 말
public class ConsolePrinter implements StringPrinter{
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
