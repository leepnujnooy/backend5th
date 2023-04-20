package com.example.javaproject2.week01;

import java.util.Scanner;

public class VariableExample {
    public void speaking(){
        Scanner sc2 = new Scanner(System.in);
        System.out.println(sc2.next()+" 말하는 중...");
    }
    public void walking(){
        Scanner sc3 = new Scanner(System.in);
        System.out.println(sc3.next()+" 일중...");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        System.out.printf("안녕하세요 %s 님. 시작하겠습니다.\n",first);


        VariableExample ve = new VariableExample();
        String second = sc.next();
        if(second.equals("말하기")) {
            System.out.println("speaking is Running...");
            ve.speaking();
        }
        else {
            System.out.println("walking is Running....");
            ve.walking();
        }
    }
}
