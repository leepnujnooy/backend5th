package com.example.javaproject2.week04.day04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface LinePrinter {
    void print(List<String> line) throws IOException;
}
