package com.example.javaproject2.week03.day04;

import java.util.Arrays;

public class GCDEx {
    public static void main(String[] args) {
        int n = 12;
        int divisor = 2;
        int[] arr= new int[n+1];
        int idx= 0;

        while(n > 1){
            if(n % divisor == 0){
                arr[divisor] = divisor;
                n /= divisor;
            }
            else{
                divisor++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
