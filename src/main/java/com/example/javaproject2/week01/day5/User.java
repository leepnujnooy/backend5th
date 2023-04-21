package com.example.javaproject2.week01.day5;

public class User {


    // 이름 전화번호 나이
    // 멤버 변수는 총 3개


    String name;
    String phoneNumb;
    int age;

    //User 클래스의 메소드를 이용해서 멤버변수를 이용한 연산을 해서 연산을 캡슐화시킵니다...
    public boolean isOld(){
        return age > 19;
    }
    public boolean isYoon(){
        if(String.valueOf(name.charAt(0)).equals("윤")){
            System.out.println("당신은 윤씨군요?");
            return true;
        }else{
            return false;
        }
    }
}
