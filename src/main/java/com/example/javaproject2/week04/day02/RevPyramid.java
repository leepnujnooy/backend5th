package com.example.javaproject2.week04.day02;

public class RevPyramid {
    public static void main(String[] args) {
        int height = 9;
        RevPyramid rp = new RevPyramid(" ");
        rp.printRevPyramid(height);
    }

    private String space = "";
    public RevPyramid(String space){
        this.space = space;
    }
    public String makeLine(int height, int i){
        return String.format("%s%s\n"," ".repeat(i),"*".repeat(2*(height-i)-1));
    }
    public void printRevPyramid(int height){
        for (int i = 0; i < height; i++) {
            System.out.print(makeLine(height,i));
        }
    }
}
