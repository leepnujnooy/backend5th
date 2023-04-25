package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1033 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        String num16 = Integer.toHexString(num);
        System.out.println(num16.toUpperCase());
    }
}
