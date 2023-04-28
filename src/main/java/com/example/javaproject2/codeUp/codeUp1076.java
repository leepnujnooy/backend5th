package com.example.javaproject2.codeUp;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class codeUp1076 {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        int asciiNum = is.read();
        ArrayList<Character> list = new ArrayList<Character>();
        //대문자
        if(asciiNum >= 65 && asciiNum <= 90){
            int cnt = asciiNum - 65 + 1;
            while(cnt > 0){
                list.add((char)asciiNum);
                asciiNum--;
                cnt--;
            }
        }
        else{
            int cnt = asciiNum - 97 + 1;
            while(cnt > 0){
                list.add((char)asciiNum);
                asciiNum--;
                cnt--;
            }
        }

        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            System.out.printf("%s",list.get(i));

            if(i == list.size()-1){
                break;
            }
            System.out.print(" ");
        }



    }
}
