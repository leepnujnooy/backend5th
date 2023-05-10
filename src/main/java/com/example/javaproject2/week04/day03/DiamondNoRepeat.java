package com.example.javaproject2.week04.day03;

public class DiamondNoRepeat {
    public static void main(String[] args) {
        int height = 7;
        int half = height / 2;
        for (int i = 0; i < height; i++) {
            if(i<=half){
                for (int j = 0; j < half - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*i+1; j++) {
                    System.out.print("*");
                }
            }
            else{
                for (int j = 0; j < i - half; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*(height-i)-1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
