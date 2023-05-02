package com.example.javaproject2.week03.day02;

public class WhileFactorialEx {
    public static void main(String[] args) {
        int n =5;
        int answer =1;

        while(n > 0){
            answer *= n--;
        }
        System.out.println(answer);

        int k =1;
        int answer2 = 1;
        while(k < 10){
            answer2 *= k++;
        }
        System.out.println(answer2);
    }
}
