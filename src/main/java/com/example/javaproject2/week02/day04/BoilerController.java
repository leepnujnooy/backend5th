package com.example.javaproject2.week02.day04;

public class BoilerController {
    public static void main(String[] args) {
        int waterTemperature = 39;
        int roomTemperature = 19;

        boolean checkBoiler = waterTemperature > 20 && roomTemperature > 15;
        System.out.printf("check boiler : %b",checkBoiler);
    }
}
