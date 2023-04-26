package com.example.javaproject2.codeUp;

import java.util.Scanner;

public class codeUp1049 {
    public static void main(String[] args) {
        codeUp1049 cd = new codeUp1049();
        System.out.println(cd.iffi());
    }
    private int iffi(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            return 1;
        }else{
            return 0;
        }
    }
}
