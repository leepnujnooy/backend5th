package com.example.javaproject2.week04.day01;

import java.util.Scanner;

public class RSP {
    //가위 1 보 2 바위 0
    public String gameResult(int user,int com){
        String answer;
        if(user == 1 && com == 2 || user == 2 && com == 0 || user == 0 && com == 1){
            answer = "win";
        }
        else if(user == com){
            answer = "tie";
        }
        else{
            answer = "lose";
        }

        return answer;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int com = sc.nextInt();

        RSP rsp = new RSP();
        System.out.println(rsp.gameResult(user , com));

    }
}
