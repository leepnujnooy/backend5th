package com.example.javaproject2.week02.day04;

public class BitOperator {
    public static void main(String[] args) {
        int value01 = 10;

        //shift 왼쪽으로
        System.out.println(value01 << 1);
        //shift 왼쪽으로
        System.out.println(value01 << 2);
        //shift 왼쪽으로
        System.out.println(value01 << 3);

        int value02 = 32;

        //downshift 오른쪽으로
        System.out.println(value02 >> 1);
        //downshift
        System.out.println(value02 >> 2);
    }
}
