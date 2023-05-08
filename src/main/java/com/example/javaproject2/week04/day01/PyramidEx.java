package com.example.javaproject2.week04.day01;

import java.util.Scanner;

public class PyramidEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        String star = "*";
        String space = " ";
        for (int i = 0; i < height; i++) {
            //space
            for (int j = 0; j < height-i-1; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
