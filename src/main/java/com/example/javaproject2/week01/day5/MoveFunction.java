package com.example.javaproject2.week01.day5;

public class MoveFunction {



    //멤버변수 . 클래스 안에 바로 생성된것.
    int location; //public 접근제어자. 모든 클래스에서 사용가능
     public void moveLeft(){
        location--;
        System.out.printf("your location = %s\n",location);
    }
     public void moveRight(){
        location++;
        System.out.printf("your location = %s\n",location);
    }
}
