package com.example.javaproject2.week05.day02;

import java.util.Arrays;

public class CharInsertionSort {
    public static void main(String[] args) {
        char[] arr= {'a','b','e','y','w'};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j]-arr[j-1]-97 > 0){
                    char temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
