package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int numLength = num.length();

        for(int i=0;i<num.length();i++){
            String zeros = "";
            for(int j=numLength-1;j>0;j--){
                zeros += "0";
            }
            System.out.println("["+num.charAt(i)+zeros+"]");
            numLength--;
        }
    }
}
