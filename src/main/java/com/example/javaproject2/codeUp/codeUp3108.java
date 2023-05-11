package com.example.javaproject2.codeUp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeUp3108 {

    private List<Student> students = new ArrayList<>();

    public Student makeAStudent(String code,int testId,String name){
        return new Student(code,testId,name);
    }

    private boolean isExist(Student pStudent){
        for(Student student : students){
            if(pStudent.getTestId()==student.getTestId()){
                return true;
            }
        }
        return false;
    }

    private Student getExistStudent(Student pStudent){
        return new Student("",0,"");
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();




        codeUp3108 cd = new codeUp3108();


    }



}

class Student{
    String code;
    int testId;
    String name;

    public Student(String code,int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }
}