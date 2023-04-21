package com.example.javaproject2.week01.day4;

import java.util.Scanner;

public class ScannerExample2 {
    public void inputTwoNumAndPlus(){
        Scanner sc = new Scanner(System.in);
        System.out.println("두 개의 숫자를 입력하십시오");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("첫 번째 숫자 : " + num1);
        System.out.println("두 번째 숫자 : " + num2);
        System.out.println("두 숫자의 합은 " + sum + " 입니다.");
    }
}
