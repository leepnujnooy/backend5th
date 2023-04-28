package com.example.javaproject2.week02.day05;

import java.util.Arrays;

public class WhichBigger {
    public static void main(String[] args) {
        int[] arr = {2, 1,7,9};
        boolean check = arr[1] > arr[0];
        if(check == false){
            int temp = arr[1];
            arr[1] = arr[0];
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
