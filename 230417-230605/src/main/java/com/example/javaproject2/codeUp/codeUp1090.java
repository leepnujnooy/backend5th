package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long r = sc.nextLong();
        long n = sc.nextLong();

        long answer = (long) (a * Math.pow(r,n-1));
        System.out.println(answer);
    }
}
