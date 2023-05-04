package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] pan = new int[row][col];

        int time = sc.nextInt();

        int[] leng = new int[time];
        int[] direc = new int[time];
        int[] xLoc = new int[time];
        int[] yLoc = new int[time];



        for(int i=0;i<time;i++){
            leng[i] = sc.nextInt();
            direc[i] = sc.nextInt();
            xLoc[i] = sc.nextInt()-1;
            yLoc[i] = sc.nextInt()-1;
        }

        //바꿈
        for(int i = 0 ; i < time ; i++){
            if(direc[i] == 0){
                //가로
                for(int j = xLoc[i];j<xLoc[i]+leng[i];j++){
                    pan[yLoc[i]][j] = 1;
                }
            }
            if(direc[i] == 1){
                //세로 xloc 1 yloc 2
                for(int j = xLoc[i];j<xLoc[i]+leng[i];j++){
                    pan[j][yLoc[i]] = 1;
                }
                // 2 1
            }
        }


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if(j==col-1){
                    System.out.printf("%d\n",pan[i][j]);
                }
                else{
                    System.out.printf("%d ",pan[i][j]);
                }
            }
        }


    }
}
