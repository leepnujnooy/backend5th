package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double s = sc.nextInt();


        double byteValue = (double)(h * b * c * s) / 8388608;
        System.out.printf("%.1f MB",byteValue);
    }
}
