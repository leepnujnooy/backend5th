package com.example.javaproject2.week02.day04;

public class PMoperatorEx {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sumOfarr = 0;

        //+= 복합연산, ++ 증감연산
        for(int i=0;i<arr.length;i++){
            sumOfarr += arr[i];
            System.out.println("sumOfarr = " + sumOfarr);
        }
    }
}
