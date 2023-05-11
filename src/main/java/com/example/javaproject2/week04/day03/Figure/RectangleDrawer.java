package com.example.javaproject2.week04.day03.Figure;

public class RectangleDrawer extends ShapeDrawer2 {
    @Override
    public String makeLine(int height, int i) {

        return String.format("*".repeat(height));
    }

    //ShapeDrawer2 상속 받기. Public class <클래스명> extends <추상클래스명>
    //추상 클래스 : 적어도 한개 이상으 ㅣ추상 메소드가 있는 클래스

    public static void main(String[] args) {
        ShapeDrawer2 sd = new RectangleDrawer();
        sd.printShape(5);
    }
}
