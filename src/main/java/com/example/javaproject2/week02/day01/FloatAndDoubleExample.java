package com.example.javaproject2.week02.day01;

public class FloatAndDoubleExample {
    public static void main(String[] args) {
        // float 변수 선언 및 초기화
        float f1 = 3.14f;
        float f2 = 1.23e10f;
        // double 변수 선언 및 초기화
        double d1 = 3.141592653589793; double d2 = 1.23e100;
        // float과 double 변수의 계산
        float result1 = f1 * 2.0f;
        double result2 = d1 / 2.0;
        // float과 double 변수의 출력
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        float f7 = 1.23e7f;
        float f8 = 1.23e8f;
        float f9 = 1.23e9f;

        //10 넘어가면 더블쓰는게 더 정확하게 나옴
        float f10 = 1.23e10f;
        double d10 = 1.23e10;

        System.out.println("f7 = " + f7);
        System.out.println("f8 = " + f8);
        System.out.println("f9 = " + f9);
        System.out.println("f10 = " + f10);
        System.out.println("f11 = " + d10);
    }
}
