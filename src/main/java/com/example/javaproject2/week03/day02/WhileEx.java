package com.example.javaproject2.week03.day02;

public class WhileEx {
    public static void main(String[] args) {
        int num = 10;

        while(num > 0){
            System.out.print(num + " ");
            num--;
        }



        //자릿수의 합 구하기.
        int N = 55269;
        int sumOfN=0;
        while(N>0){
            sumOfN += (N % 10);
            N /= 10;
        }
        System.out.println(sumOfN);
    }
}
