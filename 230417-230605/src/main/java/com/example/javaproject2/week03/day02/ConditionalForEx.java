package com.example.javaproject2.week03.day02;

public class ConditionalForEx {
    public static void main(String[] args) {
        //초기화식, 조건식, 증감식 중 조건식에 다양한 변화를 줄수있다
        //1==1 처럼 true면 무한으로 반복문이 돌아가도록 할수 있다.

//        for(int i=2;1==1;i++){
//            System.out.println(i);
//        }


        //다른 형태
        for(int i=2;2*i <=10;i++){
            System.out.println(i);
        }
    }
}
