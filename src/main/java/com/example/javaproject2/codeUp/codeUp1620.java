package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(true){
            while(num > 0){
                sum += (num % 10);
                num /= 10;
            }
            if(String.valueOf(sum).length() != 1){
                num = sum;
                sum = 0;
            }
            else{
                break;
            }
        }
        System.out.println(sum);

    }
}
