package com.example.javaproject2.week05.day01;

import java.util.Arrays;

public class Bubble2 {


    public int[] sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr= {7,2,3,9,28,11};
        Bubble2 bb2 = new Bubble2();
        bb2.sort(arr);

    }
}
