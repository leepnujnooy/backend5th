package com.example.javaproject2.week01.day4;

public class Multiplication {
    public void mul(){

        int num = 2;

        for(int i=1;i<10;i++){
            System.out.printf("%d 곱하기 %d 는 %d 입니다 ^^\n",num,i,num*i);
        }
    }
    public static void main(String[] args) {
        Multiplication mp = new Multiplication();
        System.out.println("구구단을 외워봅시다");
        mp.mul();
    }
}
