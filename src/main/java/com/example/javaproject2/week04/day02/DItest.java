package com.example.javaproject2.week04.day02;

import com.example.javaproject2.week04.day03.DiamondDrawer;

public class DItest {
    public static void main(String[] args) {
        DependencyInjection di = new DependencyInjection(new DiamondDrawer());

        di.doSth();

    }
}
