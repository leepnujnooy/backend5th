package com.example.javaproject2.week02.day05;

public class SwitchCaseEx {
    public static void main(String[] args) {
        int dayOfWeek = 4;
        switch (dayOfWeek){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");

            case 5:
                System.out.println("Friday");

            default:
                System.out.println("No...");
        }

    }
}
