package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(~num);
    }
}

//** 비트단위(bitwise) 연산자는,
//~(bitwise not), &(bitwise and), |(bitwise or), ^(bitwise xor),
//<<(bitwise left shift), >>(bitwise right shift)