package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int[][] ids = new int[time][2];
        for (int i = 0; i < ids.length; i++) {
            ids[i][0] = sc.nextInt();
            ids[i][1] = sc.nextInt();
        }

        int[][] answer = new int[19][19];
        for(int i = 0;i<19;i++){
            for(int j=0;j<19;j++){
                for(int k =0;k< ids.length;k++){
                    if(i+1 == ids[k][0] && j+1 == ids[k][1]){
                        answer[i][j] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {

                if(j==18){
                    System.out.printf("%d\n",answer[i][j]);
                }
                else{
                    System.out.printf("%d ",answer[i][j]);
                }
            }
        }

    }
}
