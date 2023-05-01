package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = sc.nextInt();
        double height = sc.nextInt();
        double b = sc.nextInt();

        System.out.printf("%.2f MB",(double)(width*height*b)/8/1024/1024);


    }
}
