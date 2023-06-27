package com.example.javaproject2.week04.day02;

import java.util.Arrays;

public class RefactoringArr {
    public static void printArr(int[][] array){
        //메소드로 분리. 제일 먼저 하는 리팩토링
        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.toString(array[1]));
        System.out.println(Arrays.toString(array[2]));
        System.out.println("--------------");
    }


    public static void main(String[] args) {
        int[][] array = {{10,10,10},{20,20,20},{30,30,30}};
        RefactoringArr.printArr(array);
        RefactoringArr.printArr(array);
        RefactoringArr.printArr(array);

    }
}
