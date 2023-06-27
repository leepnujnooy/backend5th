package com.example.javaproject2.week06.prob02;

public class Bird implements Ani, Shape {

    @Override
    public void makeSound() {
        System.out.println("짹짹");
    }

    @Override
    public void run() {
        System.out.println("달려");
    }
}
