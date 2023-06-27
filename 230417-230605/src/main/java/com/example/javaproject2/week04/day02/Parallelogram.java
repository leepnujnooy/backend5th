package com.example.javaproject2.week04.day02;

public class Parallelogram {
    public String space;
    public String stars;

    private int len;
    public int height;
    public Parallelogram(String space, String stars, int len, int height){
        this.space = space;
        this.stars = stars;
        this.len = len;
        this.height = height;
    }
    public static void main(String[] args) {

        Parallelogram pl = new Parallelogram(" ","*",6,6);
        pl.printParallelogram();
    }



    public String makeLine(int i){
        return String.format("%s%s\n",space.repeat(i),stars.repeat(len));
    }

    public void printParallelogram(){
        for (int i = 0; i < height; i++) {
            System.out.print(makeLine(i));
        }
    }

    public static String test(int i){
        return String.valueOf(i);
    }
}
