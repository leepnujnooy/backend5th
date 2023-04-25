package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1026 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String[] strArr = sc.next().split(":");
        if(strArr[1].equals("00")){
            System.out.println("0");
        }else{
            System.out.println(strArr[1]);
        }
    }
}
