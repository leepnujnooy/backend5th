package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();

        System.out.printf("%s",String.valueOf( a * Math.pow(r,n-1)));
    }
}
