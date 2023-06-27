package com.example.javaproject2.week06.prob04;

public class ExceptionTest {
    public static void main(String[] args) {
        try{
            throwException();
        }catch(MyException myException){
            System.out.println(myException.getMessage());
        }
    }

    public static void throwException() throws MyException{
        throw new MyException("사용자 정의 예외 발생");
    }

    
}
