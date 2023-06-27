package com.example.javaproject2.week01.day4;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ByteTypeExample {
    public static void main(String[] args) throws IOException {
        byte bt1 = 10;
        byte bt2 = -127;
        byte bt3 = -128;
        // 바이트는 -128~127 까지 담김

        //아스키Read
        InputStreamReader is = new InputStreamReader(System.in);
        int num1 = is.read();
        int num2 = is.read();
        int sum = num1+num2;
        System.out.printf("%d + %d = %d",num1,num2,sum);

    }
}
