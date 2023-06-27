package com.example.javaproject2.week06.prob03;

public class Box<T> {

    //참조형 자료형만 받음
    //int 안대고 Integer

    public T board;

    public T getBoard() {
        return board;
    }

    public void setBoard(T board) {
        this.board = board;
    }
}
