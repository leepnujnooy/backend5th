package com.example.javaproject2.week04.day02;

public class ParallelogramDrawer extends ShapeDrawer{
    @Override
    public String makeLine(int height, int i) {
        return String.format("%s%s\n"," ".repeat(height-i-1),"*".repeat(height));
    }
}
