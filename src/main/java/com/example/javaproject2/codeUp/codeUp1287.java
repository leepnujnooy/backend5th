package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=9;i++){
            for(int j=0;j<num*i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
