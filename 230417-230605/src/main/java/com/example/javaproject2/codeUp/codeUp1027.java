package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1027 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] arrStr = sc.next().split("\\.");
        System.out.println(arrStr[2]+"-"+arrStr[1]+"-"+arrStr[0]);
    }
}
