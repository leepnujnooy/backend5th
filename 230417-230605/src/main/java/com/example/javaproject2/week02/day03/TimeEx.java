package com.example.javaproject2.week02.day03;

public class TimeEx {
    public static void main(String[] args) {
        int time1 = 3015;
        int bun = time1 / 60;
        int cho = time1 % 60;
        System.out.printf("%d 분 %d 초",bun,cho);
    }
}
