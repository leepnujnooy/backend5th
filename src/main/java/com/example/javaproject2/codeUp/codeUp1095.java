package com.example.javaproject2.codeUp;

import java.util.Scanner;
import java.util.Arrays;
public class codeUp1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int[] arr = new int[times];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
