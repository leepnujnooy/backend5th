package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] inputValues = input.split("\\.");



        System.out.printf("%04d.%02d.%02d",Integer.parseInt(inputValues[0]),Integer.parseInt(inputValues[1]),Integer.parseInt(inputValues[2]));
    }
}
