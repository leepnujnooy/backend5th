package com.example.javaproject2.codeUp;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class codeUp1441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            list.add(num);
        }

        for(int i : list){
            if(!list2.contains(i)){
                list2.add(i);
            }
        }


        Collections.sort(list2);

        for(int i =0;i<list2.size();i++){
            System.out.println(list2.get(i));
        }


    }
}
