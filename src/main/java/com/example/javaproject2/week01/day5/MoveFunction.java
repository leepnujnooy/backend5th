package com.example.javaproject2.week01.day5;

public class MoveFunction {



    //멤버변수 . 클래스 안에 바로 생성된것.
    int location = 0;
    public void moveLeft(){
        location--;
        System.out.printf("your location = %s\n",location);
    }
    public void moveRight(){
        location++;
        System.out.printf("your location = %s\n",location);
    }
}
