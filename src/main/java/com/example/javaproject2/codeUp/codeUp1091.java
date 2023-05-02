package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long m = sc.nextLong();
        long d = sc.nextLong();
        long n = sc.nextLong();



        for(int i=0;i<n-1;i++){
            a = (a * m) + d;
        }
        System.out.println(a);
    }
}
