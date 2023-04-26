package com.example.javaproject2.week02.day03;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        int[] arr = {1,5,4,2,66,6};

        //임시 값을 넣어줄 temp 변수 선언. 1번 인덱스값 을 넣어 초기화
        int temp = arr[1];

        //1번 인덱스에 0번 인덱스 값을 할당 (덮어씌기)
        arr[1] = arr[0];

        //0번 인덱스에 아까 저장해둔 1번 인덱스 값을 할당
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
