package com.example.javaproject2.week04.day04;

import java.util.*;
class User {
    String name;
    String phoneNumber;
    int age;

    boolean isAdult() {
        return age >= 18;
    }

    public User(String name, String phoneNumber, int age){
        this.age = age;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }


    public void setName(String name){
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

}




public class ListEx {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        User user1 = new User("김미미", "010-1234-1234", 37);
        users.add(user1);

        User user2 = new User("김나나", "010-1234-1235", 14);
        users.add(user2);

        for (User user : users) {
            System.out.printf("%s님의 전화번호는 %s입니다.\n", user.getName(), user.getPhoneNumber());
        }


    }
}
