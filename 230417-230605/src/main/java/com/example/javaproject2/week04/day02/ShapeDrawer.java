package com.example.javaproject2.week04.day02;

public abstract class ShapeDrawer {

    public void printShape(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeLine(height, i));
        }
    }

    public abstract String makeLine(int height, int i);
}
