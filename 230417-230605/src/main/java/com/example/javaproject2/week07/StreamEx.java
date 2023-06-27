package com.example.javaproject2.week07;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx {
    //배열 스트림
    Integer[] arr = new Integer[3];
    Stream<Integer> stream = Arrays.stream(arr);
    Stream<Integer> streamOfArrayPart = Arrays.stream(arr,1,3);






    public static void main(String[] args) {

        StreamEx se = new StreamEx();

    }

    //컬렉션 스트림

}
