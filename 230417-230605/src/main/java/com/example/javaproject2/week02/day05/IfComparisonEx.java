package com.example.javaproject2.week02.day05;

public class IfComparisonEx {
    public static void main(String[] args) {
        int account = 35000;

        if(account >= 1500){
            account -= 1500;
            System.out.println("잔액이 차감되었습니다. 남은 잔고는 "+account);
        }
        else{
            System.out.println("잔액이 부족합니다");
        }

    }
}
