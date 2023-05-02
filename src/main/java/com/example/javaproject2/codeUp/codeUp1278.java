package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt=0;
        while(true){
            num /= 10;
            cnt++;
            if(num == 0){
                break;
            }
        }
        System.out.println(cnt);
    }
}
