package com.example.javaproject2.codeUp;

import java.util.ArrayList;
import java.util.Scanner;

public class codeUp1079 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        while(sc.hasNext()){
            String str = sc.next();
            list.add(str);
        }

        for(int i = 0; i<list.size();i++){
            if(list.get(i).equals("q")){
                System.out.println(list.get(i));
                break;
            }
            System.out.println(list.get(i));
        }

    }
}
