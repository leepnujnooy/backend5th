package com.example.javaproject2.week01;

import java.util.Scanner;

public class AverageExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double sum = num1+num2+num3;


        System.out.printf("%.2f",sum/3);
    }
}
