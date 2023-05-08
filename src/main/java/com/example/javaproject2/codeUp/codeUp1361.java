package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1361 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        String stars = "**";

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.printf("%s\n",stars);
        }
    }
}
