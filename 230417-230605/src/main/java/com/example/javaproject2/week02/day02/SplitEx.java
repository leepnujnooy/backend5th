package com.example.javaproject2.week02.day02;

import java.util.Arrays;

public class SplitEx {
    public static void main(String[] args) {
        String ex01 = "213,44,1123,5542,66";
        String[] ex01Arr = ex01.split(",");
        System.out.println(Arrays.toString(ex01Arr));
    }
}
