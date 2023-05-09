package com.example.javaproject2.week04.day02;

public class DItest {
    public static void main(String[] args) {
        DependencyInjection di = new DependencyInjection(new PyramidShapeDrawer());

        di.doSth();

    }
}
