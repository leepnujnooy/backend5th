package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num >0){
            System.out.println(num);
            num--;
            //1 출력되고 -- 되므로 0에서는 와일문 탈출임
        }
    }
}
