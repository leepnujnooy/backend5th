package com.example.javaproject2.week01.day5;

import com.example.javaproject2.week01.day3.PrintHello;

public class ConstantExample {
    public final int MAX_LEVEL = 10;
    public static final int MIN_LEVEL = 1;
    public static void main(String[] args) {

        final int intValue;
        //초기화. final 을 붙였기 때문에 다른 값으로 변경이 불가능함
        intValue = 5;
        //intValue =3; 안됌

        //인스턴스 pH 변경불가.
        final PrintHello pH = new PrintHello();





    }
}
