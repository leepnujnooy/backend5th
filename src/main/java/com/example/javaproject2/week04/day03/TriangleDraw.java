package com.example.javaproject2.week04.day03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TriangleDraw {


    public void printTriangle(){
        int height = 5;
        for (int i = 0; i < height; i++) {
            System.out.printf("%s\n","*".repeat(i+1));
        }
    }
    public void printToFile(int height) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./aaa.txt"));
        for (int i = 0; i < height; i++) {
            String.format("%s","*".repeat(i));
            bw.flush();
        }
        bw.close();
    }
    public static void main(String[] args) throws IOException {
        TriangleDraw td = new TriangleDraw();
        td.printToFile(5);
    }
}
