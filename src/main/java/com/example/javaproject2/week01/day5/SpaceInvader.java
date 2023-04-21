package com.example.javaproject2.week01.day5;

public class SpaceInvader {
    public static void main(String[] args) {

        //지역변수. 메소드 안에서 생성되어서 메소드 실행 끝나면 사라진다.
        String yourName = "YJP";


        final MoveFunction gameStart = new MoveFunction();

        System.out.printf("%s 님 시작합니다 \n",yourName);

        gameStart.moveLeft();
        gameStart.moveLeft();
        gameStart.moveLeft();
        gameStart.moveRight();
        gameStart.moveRight();
        gameStart.moveRight();

    }
}
