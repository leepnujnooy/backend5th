package com.example.javaproject2.week04.day04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class PrintALine implements LinePrinter{
    @Override
    public void print(List<String> line) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./hospital_info_utf8.csv"));

    }
}
