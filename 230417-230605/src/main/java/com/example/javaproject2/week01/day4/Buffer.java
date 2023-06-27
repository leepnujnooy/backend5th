package com.example.javaproject2.week01.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer {

    //버퍼는 임시저장공간 이라고 생각하자
    //벽돌을 나를때 카트에 담아서 간다. 이때 카트가 버퍼라고 생각하면 된다..

    public void readALine() throws IOException {

        InputStreamReader is = new InputStreamReader(System.in);

        //카트를 가져온다.
        BufferedReader br = new BufferedReader(is);

        System.out.println("line1 = " + br.readLine());
        System.out.println("line2 = " + br.readLine());


    }


    public void SumOfTwoNumbers() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.println(Integer.parseInt(br.readLine())+Integer.parseInt(br.readLine()));
    }
}
