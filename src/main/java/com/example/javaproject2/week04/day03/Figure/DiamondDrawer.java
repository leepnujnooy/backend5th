package com.example.javaproject2.week04.day03.Figure;

import com.example.javaproject2.week04.day02.ShapeDrawer;

import static com.example.javaproject2.week04.day03.Figure.DrawDiamond.getRepeatedSymbol;

public class DiamondDrawer extends ShapeDrawer {
    @Override
    public String makeLine(int height, int i) {
        int half = height / 2;
        if(i <= half){
            return String.format("%s%s\n",getRepeatedSymbol(" ",half-i),getRepeatedSymbol("*",2*i+1));
        }
        else{
            return String.format("%s%s\n",getRepeatedSymbol(" ",i-half),getRepeatedSymbol("*",2*(height-i)-1));
        }
    }
}
