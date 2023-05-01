package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2 =sc.nextInt();
        int n3 =sc.nextInt();
        int cnt = 0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                for(int k=0;k<n3;k++){
                    System.out.printf("%d %d %d\n",i,j,k);
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}
