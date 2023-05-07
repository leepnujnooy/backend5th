package com.example.javaproject2.week03.day03;

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {

        //최소한 한번은 실행되는 while 문
        int input;
        Scanner sc = new Scanner(System.in);

        //do 가 먼저 실행되고, 조건이 들어 맞을 때 까지 반복
        do {
            System.out.println("숫자를 입력하세요");
            input = sc.nextInt();
        } while (input % 2 != 0);

        System.out.println("짝수 입력완료.");


    }
}
