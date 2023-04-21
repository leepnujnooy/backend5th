package com.example.javaproject2.week01.day5;

public class Point {

    //접근제어자 public 쓰면 모든 클래스에서 접근 가능
    //private 쓰면 이 Point 내엫서만 접근 가능
    public int x;
    public int y;


    및boolean isSameXY(){
        return x==y;
    }
}
