package com.example.javaproject2.week04.day01;

public class UserFactoryTest {
    public static void main(String[] args) {
        UserFactory uf = new UserFactory();
        User user = uf.getUser();
        System.out.println(user.age);

    }
}
