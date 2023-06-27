package com.example.javaproject2.week04.day01;

import com.example.javaproject2.week01.day3.Sum;

public class SumOfFactors {
    public static void main(String[] args) {
        SumOfFactors sf = new SumOfFactors();
        System.out.println(sf.sum(12));
    }



    public int sum(int num){
        int sum = 0;
        for(int i=1;i<=num;i++){
            if(num % i == 0){
                sum += i;
            }
        }
        return sum;
    }

}
