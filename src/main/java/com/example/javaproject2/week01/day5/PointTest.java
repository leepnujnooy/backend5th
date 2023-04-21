package com.example.javaproject2.week01.day5;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 0;
        p1.y = 0;
        System.out.println("x,y가 같은 값인가요? " + p1.isSameXY());



        Point p2 = new Point();
        p2.x = 4;
        p2.y = 8;
        System.out.println("x,y가 같은 값인가요? " + p2.isSameXY());

        Point p3 = new Point();
        p3.x = 10;
        p3.y = 1;

        double dist;
        dist = Math.sqrt(Math.pow(p2.x-p1.x,2)+Math.pow(p2.y-p1.y,2));
        System.out.println(dist);


        double inclination = (float) (p2.y - p1.y)/(p2.x-p1.x);



    }
}
