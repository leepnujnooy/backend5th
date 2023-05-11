package com.example.javaproject2.week04.day03.Figure;

public class DrawDiamond {
    public static String getRepeatedSymbol(String symbol , int n){
        return symbol.repeat(n);
    }



    public static String makeALine(int i,int height){
        int half = height / 2;
        if(i <= half){
            return String.format("%s%s\n",getRepeatedSymbol(" ",half-i),getRepeatedSymbol("*",2*i+1));
        }
        else{
            return String.format("%s%s\n",getRepeatedSymbol(" ",i-half),getRepeatedSymbol("*",2*(height-i)-1));
        }
    }

    public static void main(String[] args) {
        int height = 5;
        int half = height / 2;
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(i,height));
        }
    }
}
