package com.example.javaproject2.week01.day5;

public class SpaceInvader {
    public static void main(String[] args) {

        //지역변수. 메소드 안에서 생성되어서 메소드 실행 끝나면 사라진다.
        String yourName = "YJP";


        final MoveFunction gameStart = new MoveFunction();

        System.out.printf("%s 님 시작합니다 \n",yourName);

        //다른 클래스의 멤버변수 접근은 이렇게 하면 된다.
        System.out.println(gameStart.location);


        gameStart.moveLeft();
        gameStart.moveLeft();
        gameStart.moveLeft();
        gameStart.moveRight();
        gameStart.moveRight();
        gameStart.moveRight(); //static 카공족같은아이들. jvm이 실행되는 동안은 계속 메모리를 차지함... 사장님은 gc를 돌리고싶어함.
    }
}
