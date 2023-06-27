package com.example.javaproject2.week05.day04;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        String s = "(())";
        boolean answer = true;
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    answer = false;
                    break; // break 해줘야함. 애초에 틀린 보기라 반복문을 더 돌릴 피룡없음
                }
            }


            if(i == s.length()-1 && st.isEmpty()){
                answer = true;
            }
            else{
                answer = false;

            }
        }

        System.out.println(answer);
    }
}
