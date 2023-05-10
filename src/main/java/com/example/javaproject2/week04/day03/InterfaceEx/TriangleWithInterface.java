package com.example.javaproject2.week04.day03.InterfaceEx;

import java.io.IOException;


public class TriangleWithInterface {


    private Printer printer;

    public TriangleWithInterface(Printer printer){
        this.printer = printer;
    }

    public String[] makeLines(int h){
        String[] lines = new String[h];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = String.format("%s","*".repeat(i+1));
        }
        return lines;
    }
    public void printTriangle() throws IOException {
        String[] lines = makeLines(5);
        printer.print(lines);
    }
    public static void main(String[] args) throws IOException {
        TriangleWithInterface twi = new TriangleWithInterface(new ConsolePrinter());
        twi.printTriangle();
    }
}
