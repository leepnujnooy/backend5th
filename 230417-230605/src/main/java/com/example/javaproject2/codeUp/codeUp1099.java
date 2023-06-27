package com.example.javaproject2.codeUp;

import java.util.Arrays;
import java.util.Scanner;

public class codeUp1099 {
//    public static void Mapview{
//
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //create Map
        int[][] antMap = new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                antMap[i][j] = sc.nextInt();
            }
        }

        //moving ant
        int row = 1;
        int col = 1;
        int cnt = 0;
        while(cnt<100){
            //find apple
            if(antMap[col][row] == 2){
                antMap[col][row] = 9;
                break;
            }

            //move
            if(antMap[col][row+1] == 0){
                antMap[col][row] =9;
                row++;
            }
            else if(antMap[col][row+1] == 2){
                antMap[col][row] = 9;
                antMap[col][row+1] =9;
                break;
            }


            //while meet the wall
            if(antMap[col][row+1] == 1 && antMap[col+1][row] != 1){
                antMap[col][row] = 9;
                col++;
            }
            else if(antMap[col][row+1] == 1 && antMap[col+1][row] ==1){
                antMap[col][row] = 9;
                break;
            }
            cnt++;
        }


        printAntMap(antMap);
    }

    public static void printAntMap(int[][] antMap){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if(j==9){
                    System.out.printf("%d\n",antMap[i][j]);
                }
                else{
                    System.out.printf("%d ",antMap[i][j]);
                }
            }
        }
    }

}
