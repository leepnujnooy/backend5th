package com.example.javaproject2.week01.day5;

public class UserTest {
    public static void main(String[] args) {

        //JP 인스턴스생성
        //User Object (객체)
        User JP = new User();
        JP.name = "윤준필";
        JP.phoneNumb = "010-4708-4474";
        JP.age = 27;

        //M 인스턴스생성
        //User Object (객체)
        User M = new User();
        M.name = "조민";
        M.phoneNumb = "010-3331-3421";
        M.age = 16;

        System.out.printf("%s 님은 성인인가요? %b \n",JP.name,JP.isOld());
        System.out.printf("%s 님은 성인인가요? %b \n",M.name,M.isOld());
        System.out.printf("%s 님은 윤씨인가요?\n%b", JP.name , JP.isYoon());

    }
}
