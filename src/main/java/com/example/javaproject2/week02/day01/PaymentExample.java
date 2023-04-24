package com.example.javaproject2.week02.day01;

public class PaymentExample {
    int balance = 10000;
    private boolean isPaymentSuccess() {
        int price =9500;
        return balance >= price;
    }

    public static void main(String[] args) {
        PaymentExample user01 = new PaymentExample();
        System.out.println(user01.isPaymentSuccess());
    }
}
