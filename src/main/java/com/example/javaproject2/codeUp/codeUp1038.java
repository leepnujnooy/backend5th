package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        long num = 0;
        String[] arr = line.split(" ");
        for(int i=0;i<arr.length;i++){
            num += Long.parseLong(arr[i]);
        }
        System.out.println(num);

    }
}
