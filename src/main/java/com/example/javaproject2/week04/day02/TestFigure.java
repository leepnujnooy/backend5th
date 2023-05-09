package com.example.javaproject2.week04.day02;

public class TestFigure {
    public static void main(String[] args) {
        Parallelogram pl = new Parallelogram(" ","*",5,6);
        MakeDiamond md = new MakeDiamond(" ",5);

        pl.printParallelogram();
        md.printPyramid();
        md.printRevPyramid();


        //Parallelogram 클래스 안의 static 메소드를 호출. 따로 인스턴스화를 시켜주지 않아도 전역에서 사용가능
        String s = Parallelogram.test(5);
        System.out.println(s);

    }
}
