package com.example.javaproject2.week02.day04;

public class SamHangEx {

    int num01= 100;
    int num02= 300;
    public static void main(String[] args) {
        SamHangEx se = new SamHangEx();
        System.out.println("se.num01 = " + se.num01);
        System.out.println("se.num02 = " + se.num02);
        System.out.println(se.isBigger());
    }
    private String isBigger(){

        return num01 > num02 ? "num01 이 더 크다":"num02 이 더 크다";
    }


}
