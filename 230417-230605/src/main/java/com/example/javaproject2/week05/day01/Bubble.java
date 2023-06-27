package com.example.javaproject2.week05.day01;

import java.util.Arrays;

public class Bubble {

    public int[] sortARound(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;

                System.out.println(Arrays.toString(arr));
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7,2,3,9,28,11};
        Bubble bb = new Bubble();
        bb.sortARound(arr);



    }
}
