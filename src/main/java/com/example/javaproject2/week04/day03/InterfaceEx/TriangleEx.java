package com.example.javaproject2.week04.day03.InterfaceEx;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TriangleEx {

    // System.out.   --> Console
    // BufferedWriter --> Console, File
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "", "*".repeat(i));
    }

    // 출력하기
    public void printToFile(String[] lines) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./aaa.txt"));
        bw.append("aaa");
        bw.flush();
        bw.close();
    }


    // 콘솔에 모양 출력하기
    public void printToConsole(String[] lines) {
        for (int i = 0; i < lines.length; i++) {
            System.out.print(lines[i]);
        }
    }

    // 모양 출력하기
    public void printShape(int h) {
        // 모양 만들기
        String[] lines = new String[h];
        for (int i = 0; i < h; i++) {
            lines[i] = makeALine(h, i + 1);
        }

        // 모양 출력하기
        printToConsole(lines);
    }

    public static void main(String[] args) throws IOException {
        TriangleEx te = new TriangleEx();
        te.printShape(5);
    }
}
