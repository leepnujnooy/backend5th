package com.example.javaproject2.week04.day01;

public class UserFactory {
    public User getUser(){
        User usr = new User();
        usr.age = 21;
        return usr;
    }
}
