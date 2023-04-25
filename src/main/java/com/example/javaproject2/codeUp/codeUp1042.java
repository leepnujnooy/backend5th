package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] arr = line.split(" ");
        System.out.println(Integer.parseInt(arr[0]) / Integer.parseInt(arr[1]));
    }
}
