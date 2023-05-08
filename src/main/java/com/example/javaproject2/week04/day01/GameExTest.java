package com.example.javaproject2.week04.day01;

public class GameExTest {
    public static void main(String[] args) {
        GameEx n = new GameEx();
        n.moveLeft();
        n.moveLeft();
        n.moveRight();
        n.moveRight();
        n.moveRight();
        System.out.println(n.loc);
    }
}
