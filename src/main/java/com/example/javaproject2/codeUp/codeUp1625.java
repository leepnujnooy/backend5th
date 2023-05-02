package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1625 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int len = sc.nextInt();
        int[] numbers = new int[len];
        int[] sumOfNum = new int[len];

        for(int i=0;i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }

        for(int i=0;i<numbers.length;i++){
            while(true){
                while(numbers[i] > 0){
                    sumOfNum[i] += (numbers[i] % 10);
                    numbers[i] /= 10;
                }
                if(String.valueOf(sumOfNum[i]).length() != 1){
                    numbers[i] = sumOfNum[i];
                    sumOfNum[i] = 0;
                }
                else{
                    break;
                }
            }
        }

        for(int i=0;i<sumOfNum.length;i++){
            System.out.println(sumOfNum[i]);
        }
    }
}
