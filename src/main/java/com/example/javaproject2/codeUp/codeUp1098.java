package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1098 {

    private int[][] pan;
    private int row;
    private int col;
    private static int time;
    private static int[] xLoc;
    private static int[] yLoc;
    private static int[] leng;
    private static int[] direc;

    public codeUp1098(int row,int col,int time){
        this.pan = new int[row][col];
        this.row = row;
        this.col = col;
        codeUp1098.time = time;
        codeUp1098.leng = new int[time];
        codeUp1098.direc = new int[time];
        codeUp1098.xLoc = new int[time];
        codeUp1098.yLoc = new int[time];
    }




    public void printPan(){
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


    public void makePan(){
        for(int i = 0 ; i < time ; i++){
            if(direc[i] == 0){
                //가로
                for(int j = xLoc[i];j<xLoc[i]+leng[i];j++){
                    pan[yLoc[i]][j] = 1;
                }
            }
            if(direc[i] == 1){
                //세로
                for(int j = xLoc[i];j<xLoc[i]+leng[i];j++){
                    pan[j][yLoc[i]] = 1;
                }
            }
        }
    }






    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        codeUp1098 cd1098 = new codeUp1098(sc.nextInt(),sc.nextInt(),sc.nextInt());

        for(int i=0;i<time;i++){
            leng[i] = sc.nextInt();
            direc[i] = sc.nextInt();
            xLoc[i] = sc.nextInt()-1;
            yLoc[i] = sc.nextInt()-1;
        }

        cd1098.makePan();
        cd1098.printPan();


    }
}
