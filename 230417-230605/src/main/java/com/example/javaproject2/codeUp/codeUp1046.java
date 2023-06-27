package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");


        int sum = 0;
        for (String s : arr) {
            sum += Integer.parseInt(s);
        }
        float avg = (float) sum / arr.length;

        System.out.println(sum);
        System.out.printf("%.1f",avg);


    }
}
