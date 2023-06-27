package com.example.javaproject2.week06.prob02;

import com.example.javaproject2.week06.prob02.Ani;
import com.example.javaproject2.week06.prob02.Shape;

public interface Human extends Ani, Shape {

    void run();
    void makeSound();
}
