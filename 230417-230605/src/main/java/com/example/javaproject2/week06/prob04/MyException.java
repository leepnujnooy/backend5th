package com.example.javaproject2.week06.prob04;

public class MyException extends Exception{
    public MyException(){
        super("error");
    }

    //overload
    public MyException(String message){
        super(message);
    }

}
