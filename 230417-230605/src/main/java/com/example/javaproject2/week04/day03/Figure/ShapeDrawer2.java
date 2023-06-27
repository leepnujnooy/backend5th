package com.example.javaproject2.week04.day03.Figure;

public abstract class ShapeDrawer2 {



    public void printShape(int height){
        for (int i = 0; i < height; i++) {
            System.out.printf("%s\n",makeLine(height,i));
        }
    }

    public abstract String makeLine(int height, int i);
    //추상 메소드
}
//추상클래스