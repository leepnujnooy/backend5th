package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1054 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num01 = sc.nextInt();
        int num02 = sc.nextInt();

        if(num01 == num02){
            if(num01 == 0){
                System.out.println(0);
            }
            else{
                System.out.println(1);
            }
        }
        else{
            System.out.println(0);
        }
    }
}
