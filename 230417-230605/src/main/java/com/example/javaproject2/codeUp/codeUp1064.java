package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        int min = 211111111;
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }

        for(int i =0;i<nums.length;i++){
            min = Math.min(min,nums[i]);
        }
        System.out.println(min);
    }
}
