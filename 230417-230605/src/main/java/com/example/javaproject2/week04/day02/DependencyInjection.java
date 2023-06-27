package com.example.javaproject2.week04.day02;

public class DependencyInjection {
    private ShapeDrawer shapeDrawer;

    public DependencyInjection(ShapeDrawer shapeDrawer){
        this.shapeDrawer = shapeDrawer;
    }


    public void doSth(){
        shapeDrawer.printShape(5);
    }

}
