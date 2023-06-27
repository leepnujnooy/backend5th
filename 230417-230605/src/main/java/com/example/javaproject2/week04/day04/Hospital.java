package com.example.javaproject2.week04.day04;

public class Hospital {
    private String name;
    private Address address;


    //생성자
    public Hospital(String name , Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
