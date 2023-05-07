package com.example.javaproject2.week03.day03;

public class WhileEx {
    public static void main(String[] args) {

        //내가 가진 돈
        int myMoney = 10000;

        //아이스크림의 가격
        int iceCream = 500;

        //아이스크림 몇개샀어?
        int cnt = 0;

        while(myMoney>0){
            myMoney -= iceCream;
            cnt++;
        }

        System.out.printf("당신이 구매한 아이스크림의 개수는 : %d",cnt);

    }
}
