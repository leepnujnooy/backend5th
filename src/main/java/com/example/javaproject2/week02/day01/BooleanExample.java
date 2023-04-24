package com.example.javaproject2.week02.day01;

public class BooleanExample {
    public static void main(String[] args) {
        boolean flag01 = 1 == 1;
        boolean flag02 = 2 == 1;
        System.out.println("flag01 = " + flag01);
        System.out.println("flag02 = " + flag02);



        boolean isPaymentSuccess = false;
        boolean isBalanceSufficient = false;

        System.out.println(isBalanceSufficient ? "충분" : "불충분");
        System.out.println(isPaymentSuccess ? "결제완료" : "잔액부족");
    }
}
