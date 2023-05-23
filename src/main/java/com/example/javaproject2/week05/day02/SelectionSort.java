package com.example.javaproject2.week05.day02;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {2,6,3,76,5,9,22,1,4};

        int targetVal = arr[0];
        int targetIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            int minVal = arr[i];
            int minIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<minVal){
                    minVal = arr[j];
                    minIdx = j;
                }
                int temp = arr[j];
                arr[j] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
