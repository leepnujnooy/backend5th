package com.example.javaproject2.codeUp;

import java.util.Arrays;
import java.util.Scanner;

public class codeUp1094 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int times = sc.nextInt();
        int[] arr = new int[times];
        for(int i=times-1;i>=0;i--){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
