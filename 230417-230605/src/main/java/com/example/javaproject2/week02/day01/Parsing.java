package com.example.javaproject2.week02.day01;

public class Parsing {
    public static void main(String[] args) {
        String val1 = "1.5";
        String val2 = "2.5";

        //int 로 파싱을 못한다. "1.5"는 파싱시 플롯형 이기 떄문이다...
        float result = Float.parseFloat(val1) + Float.parseFloat(val2);

        System.out.println("result = " + result);


        //소수점 8자리 파싱
        String val3 = "1.11111111";
        String val4 = "2.22222222";


        //8자리 이상..이면 ㅇㅇ
        float result2 = Float.parseFloat(val3) + Float.parseFloat(val4);
        double result3 = Double.parseDouble(val3) + Double.parseDouble(val4);

        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);


    }
}
