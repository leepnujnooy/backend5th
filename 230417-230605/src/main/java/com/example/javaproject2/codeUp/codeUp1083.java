package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i % 3 != 0 && i != num){
                System.out.print(i);
                System.out.print(" ");
            }
            else if(i % 3 == 0 && i != num){
                System.out.print("X");
                System.out.print(" ");
            }
            else if(i == num && i % 3 == 0){
                System.out.println("X");
                break;
            }
            else if(i == num){
                System.out.print(i);
                break;
            }

        }
    }
}
