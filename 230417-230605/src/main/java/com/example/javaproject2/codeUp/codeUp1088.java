package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i % 3 != 0){
                if(i != num){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(i);
                    break;
                }
            }
        }


    }
}
