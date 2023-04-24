package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String[] arr = num.split("[.]"); //이스케이프 와 정규표현식 차이 ?
        for(String i:arr){
            System.out.println(i);
        }

    }
}
