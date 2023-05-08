package com.example.javaproject2.week04.day01;

public class ParameterEx {
    public static void main(String[] args) {
        ParameterEx pe = new ParameterEx();
        pe.printSum(5,5);
    }

    public void printSum(int n1 , int n2){
        System.out.println(n1+n2);
    }
}
