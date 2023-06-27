package com.example.javaproject2.week03.day02;

import java.util.Scanner;

public class FactorialEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요");
        int numb = sc.nextInt();
        int factorialNumb = 1;

        for(int i=1;i<=numb;i++){
            factorialNumb *= i;
        }

        System.out.printf("%d!의 값은 %d",numb,factorialNumb);
    }
}
