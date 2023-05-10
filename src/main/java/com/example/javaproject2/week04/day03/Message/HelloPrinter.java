package com.example.javaproject2.week04.day03.Message;

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

    public void repeatMessage(int n, String message){
        for (int i = 0; i < n; i++) {
            stringPrinter.print(message);
        }
    }
    public static void main(String[] args) {
        HelloPrinter hp = new HelloPrinter(new ConsolePrinter());
        hp.repeatMessage(5,"안녕하세요");
    }
}
