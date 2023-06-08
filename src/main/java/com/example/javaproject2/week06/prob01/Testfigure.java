package com.example.javaproject2.week06.prob01;

public class Testfigure {
    public static void main(String[] args) {
        ShapeOfFigure rectangle = new Rectangle(5,5);
        ShapeOfFigure circle = new Circle(10);

        double rec = rectangle.calculateArea();
        double rec2 = rectangle.calculatePerimeter();

        double cir = circle.calculateArea();
        double cir2 = circle.calculatePerimeter();

        System.out.println("둘레 = " + cir2);
    }
}
