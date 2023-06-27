package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] pan = new int[19][19];

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                pan[i][j] = sc.nextInt();
            }
        }

        int time = sc.nextInt();
        int[][] rev = new int[time][2];

        for(int i=0;i<rev.length;i++){
            rev[i][0] = sc.nextInt();
            rev[i][1] = sc.nextInt();
        }

        for (int i = 0; i < rev.length; i++) {
            //reversed
            for (int j = 0; j < 19; j++) {
                for (int k = 0; k < 19; k++) {
                    //[~,10 자리 교체)
                    if(k+1 == rev[i][1]){
                        if(pan[j][k] ==0){
                            pan[j][k] =1;
                        }
                        else{
                            pan[j][k] =0;
                        }
                    }
                    if(j+1 == rev[i][0]){
                        if(pan[j][k] ==0){
                            pan[j][k] =1;
                        }
                        else{
                            pan[j][k] =0;
                        }
                    }
                }
            }
        }



        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {

                if(j==18){
                    System.out.printf("%d\n",pan[i][j]);
                }
                else{
                    System.out.printf("%d ",pan[i][j]);
                }
            }
        }

    }
}
