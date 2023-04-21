package com.example.javaproject2.week01.day4;

import java.util.Scanner;

public class Multiplication2 {
    public void mul2(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        for(int i=1;i<10;i++){
            System.out.printf("%d 곱하기 %d 는 %d 입니다 ^^\n",num,i,num*i);
        }
    }


    public static void main(String[] args) {
        Multiplication2 mp2 = new Multiplication2();
        System.out.println("구구단을 외워봅시다. 외우고자 하는 숫자를 넣어주세요");
        mp2.mul2();
    }
}
