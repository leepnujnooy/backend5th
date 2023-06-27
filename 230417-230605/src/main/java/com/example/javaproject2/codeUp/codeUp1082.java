package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1082 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        //String값 받아오기
        String num16 = sc.next();
        //16진수로 바꿔주기
        int int16 = Integer.parseInt(num16,16);

        //for문 돌리기
        for(int i =1;i <= 15;i++){
            System.out.printf("%X*%X=%X\n",int16,i,int16*i);
        }


    }
}
