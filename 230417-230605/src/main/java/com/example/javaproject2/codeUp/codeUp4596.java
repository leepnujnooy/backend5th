package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nums = new int[9][9];

        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        int max = 0;

        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                max = Math.max(max, nums[i][j]);
            }
        }

        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                if(nums[i][j] == max){
                    System.out.println(max);
                    System.out.printf("%d %d",i+1,j+1);
                    break;
                }
            }
        }


    }
}
