package com.example.javaproject2.week04.day03.Message;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements StringPrinter{
    @Override
    public void print(String message, int i) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./test.txt"));

        for (int j = 0; j < i; j++) {

            bw.append(message);
            bw.flush();
        }
        bw.close();


    }
}
