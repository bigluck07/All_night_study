package com.fastcampus.de.java.clip7;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] intEmptyArray = new int[5]; // int의 5자리 배열 선언
        System.out.println(Arrays.toString(intEmptyArray)); // int의 default 값 0으로 채워짐

        int[] intArray = new int[] {1,2,3,4,5}; // int 배열을 선언과 동시에 초기화
        System.out.println(Arrays.toString(intArray));

        String[] stringEmptyArray = new String[5]; // 참조자료형 String의 5자리 배열 선언
        System.out.println(Arrays.toString(stringEmptyArray)); // 참조자료형은 값이 없을 경우 null(아무것도 없다) 이라는 표현으로 표시

        String[] months = {"1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"};
        System.out.println(Arrays.toString(months));

        int[] scores = new int[4]; // 배열 선언
        scores[0] = 5; //인덱스를 통해 배열에 값 입력
        scores[1] = 10;
        System.out.println(scores[1]); //인덱스를 통해 배열의 특정 값 출력

        String[] months1 = {"1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"};
        // 이렇게 선언과 동시에 값을 입력할 수도 있습니다.
        System.out.println(months[7]); //인덱스를 통해 배열에 접근하여 특정 값 출력

        int[][] arr = new int[4][3]; //배열을 활용하여 2차원의 배열도 만들 수 있습니다
    }
}
