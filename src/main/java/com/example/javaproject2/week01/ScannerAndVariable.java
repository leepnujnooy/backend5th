package com.example.javaproject2.week01;

import java.util.Scanner;

public class ScannerAndVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //스캐너 생성.

        System.out.println("당신의 영어이름은?");
        String yourName = sc.next(); //yourName 이라는 변수를 선언, 스캐너에 입력된 값을 최초로 할당.


        System.out.println("당신의 나이는?");
        int yourAge = sc.nextInt();


        System.out.println("당신의 이메일은?");
        String yourEmail = sc.next();

        System.out.printf("이름 : %s , 나이 : %d , E-mail : %s ",yourName,yourAge,yourEmail);
    }
}
