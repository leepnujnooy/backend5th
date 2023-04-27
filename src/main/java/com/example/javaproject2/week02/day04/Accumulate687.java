package com.example.javaproject2.week02.day04;

public class Accumulate687 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;

        //나머지 구하기
        answer = answer + (num % 10);
        //몫 구하기
        num = num / 10;
        System.out.println("answer = " + answer);
        System.out.println("num = " + num);

        answer = answer + (num % 10);
        num = num / 10;
        System.out.println("answer = " + answer);
        System.out.println("num = " + num);

        answer = answer + (num % 10);
        num = num / 10;
        System.out.println("answer = " + answer);
        System.out.println("num = " + num);

        int num2 = 687;
        int now = 0;


        //while 문 사용
        while(num2 > 0){
            now += (num2 % 10);
            System.out.println("now = " + now);

            num2 /= 10;
        }




    }
}
