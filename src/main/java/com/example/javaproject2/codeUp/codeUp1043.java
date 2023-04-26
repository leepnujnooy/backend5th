package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        System.out.println(Integer.parseInt(nums[0]) % Integer.parseInt(nums[1]));
    }
}
