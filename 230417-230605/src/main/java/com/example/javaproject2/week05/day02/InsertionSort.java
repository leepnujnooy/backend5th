package com.example.javaproject2.week05.day02;

import com.example.javaproject2.week04.day02.Parallelogram;

import java.util.Arrays;

public class InsertionSort {

    public int[] sort(int[] arr, boolean isAsc){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {

                if(isAsc ? arr[j] < arr[j-1] : arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    //오버로딩
    //메소드 이름은 같은데, 파라미터를 제각기 다르게 호출
    public int[] sort(int[] arr){
        return sort(arr,true);
    }

    public static void main(String[] args) {

        int[] arr = {7,2,3,9,28,1};
        InsertionSort is = new InsertionSort();
        //DESC
        is.sort(arr,false);
        //ASC
        is.sort(arr,true);

    }
}
