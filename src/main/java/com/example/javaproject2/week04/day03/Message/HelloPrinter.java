package com.example.javaproject2.week04.day03.Message;

import java.io.IOException;

public class HelloPrinter {

    StringPrinter stringPrinter;

    //생성자
    public HelloPrinter(StringPrinter stringPrinter){
        this.stringPrinter = stringPrinter;
    }

    //인터페이스를 가져와서 쓰기때문에 필요없어짐
//    public void print(String message){
//        System.out.println(message);
//    }

    public void repeatMessage(String message,int i) throws IOException {
        stringPrinter.print(message,i);
    }
    public static void main(String[] args) throws IOException {
        HelloPrinter hp = new HelloPrinter(new ConsolePrinter());
        hp.repeatMessage("안녕하세요",5);
        HelloPrinter hp2 = new HelloPrinter((new FilePrinter()));
        hp2.repeatMessage("안녕하세요",5);
    }
}
