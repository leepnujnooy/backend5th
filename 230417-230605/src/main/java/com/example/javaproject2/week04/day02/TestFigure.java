package com.example.javaproject2.week04.day02;

public class TestFigure {
    public static void main(String[] args) {
        Parallelogram pl = new Parallelogram(" ","*",5,6);
        MakeDiamond md = new MakeDiamond(" ",5);

        //pl.printParallelogram();
        //md.printPyramid();
        //md.printRevPyramid();


        //Parallelogram 클래스 안의 static 메소드를 호출. 따로 인스턴스화를 시켜주지 않아도 전역에서 사용가능
        //String s = Parallelogram.test(5);
        //System.out.println(s);



        //추상클래스 1개 이상 추상 메소드를 포함하는 클래스
        //반드시 구현해서 사용
        //남은 부분을 활용하기 위함
        //템플릿 메소드 패턴
        ShapeDrawer sd1 = new ParallelogramDrawer();
        sd1.printShape(5);
        ShapeDrawer sd2 = new PyramidShapeDrawer();
        sd2.printShape(5);


        //오버라이딩이란 메소드를 재정의 하는것
        //추상 클래스는 재정의는 아니고 구현하는 것
    }
}
