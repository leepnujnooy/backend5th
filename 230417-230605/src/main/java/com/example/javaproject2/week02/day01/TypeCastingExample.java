package com.example.javaproject2.week02.day01;

public class TypeCastingExample {
    public static void main(String[] args) {
        //casting 은 붕어빵 틀 기계이다.

        //Narrow Casting 강제 형변환. 데이터가 손실됨. 123.456 > 123 으로 바뀌면서 데이터 손실
        double dValue = 123.456;
        int iValue = (int) dValue;
        System.out.println("dValue = " + dValue);
        System.out.println("iValue = " + iValue);

        //Widening Casting 자동 형 변환. 데이터 손실 안됨. 더 큰 데이터 타입으로 바뀌게해주는거라 손실이라면 메모리손실?
        long lValue = (long) iValue;
        System.out.println("lValue = " + lValue);
    }
}
