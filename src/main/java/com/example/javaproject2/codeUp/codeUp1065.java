package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {sc.nextInt(),sc.nextInt(),sc.nextInt()};

        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2 == 0){
                System.out.println(nums[i]);
            }
        }
    }
}
