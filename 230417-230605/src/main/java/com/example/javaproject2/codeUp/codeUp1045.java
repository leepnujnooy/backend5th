package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nums = sc.nextLine().split(" ");
        int n1 = Integer.parseInt(nums[0]);
        int n2 = Integer.parseInt(nums[1]);

        System.out.println(n1+n2);
        System.out.println(n1-n2);
        System.out.println(n1*n2);
        System.out.println(n1/n2);
        System.out.println(n1%n2);
        System.out.printf("%.2f",Float.parseFloat(String.valueOf(n1)) / Float.parseFloat(String.valueOf(n2)));
    }
}
