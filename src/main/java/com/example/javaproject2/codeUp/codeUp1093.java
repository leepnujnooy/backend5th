package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] students = new int[23];

        int times = sc.nextInt();
        int[] randomIdx = new int[times];
        for(int i=0;i<randomIdx.length;i++){
            randomIdx[i] = sc.nextInt();
        }

        for(int i=0;i<randomIdx.length;i++){
            students[randomIdx[i]-1] += 1;
        }

        for(int i=0;i<students.length;i++){
            if(i==students.length-1){
                System.out.print(students[i]);
                break;
            }
            else{
                System.out.print(students[i]+" ");
            }

        }

    }
}
