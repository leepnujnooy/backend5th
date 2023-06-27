package com.example.javaproject2.week06.prob01;

public class Circle implements ShapeOfFigure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius,2) * pi;
    }

    @Override
    public double calculatePerimeter() {
        return 2*pi*radius;
    }
}
