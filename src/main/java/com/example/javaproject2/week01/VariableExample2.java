package com.example.javaproject2.week01;
import com.example.javaproject2.PrintHello;

public class VariableExample2 {
    public static void main(String[] args) {
        int iValue;
        iValue = 0; //최초의 값을 넣어 할당. (초기화)
        System.out.println(iValue); //초기화를 안해서.. 에러가 납니다.



        PrintHello pH;
        pH = new PrintHello(); //값을 넣어 할당.
        pH.print(); //초기화를 안해서.. 에러가 납니다. New를 안했기 때문임..

    }
}
