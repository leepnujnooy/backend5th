package com.example.javaproject2.week04.day02;

public class RevPyramid {
    public static void main(String[] args) {

        RevPyramid rp = new RevPyramid(5," ");
        rp.printRevPyramid();
    }

    private String space;
    private int height;
    public RevPyramid(int height,String space){
        this.height = height;
        this.space = space;
    }
    public String makeLine(int i){
        return String.format("%s%s\n"," ".repeat(i),"*".repeat(2*(height-i)-1));
    }
    public void printRevPyramid(){
        for (int i = 0; i < height; i++) {
            System.out.print(makeLine(i));
        }
    }
}
