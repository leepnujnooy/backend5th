package com.example.javaproject2.week04.day04;

public class Hospital {
    private String name;
    private String phone_number;
    private Address address;


    //생성자
    public Hospital(String name, String phone_number , Address address) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }


}
