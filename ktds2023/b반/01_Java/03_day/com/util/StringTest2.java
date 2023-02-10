package com.util;

import java.util.Arrays;

public class StringTest2 {

	public static void main(String[] args) {
	
		//String  클래스
		String s = "sequeNCe";
		
		System.out.println("특정위치의 문자반환:" + s.charAt(0));
		System.out.println("문자열 길이:" + s.	length());
		System.out.println("문자열 연결:" + s.concat("!!!"));
		System.out.println("부분열:" + s.substring(1)); // 1 부터 끝까지
		System.out.println("부분열:" + s.substring(1, 4)); // 1~3 까지
		System.out.println("대문자:" + s.toUpperCase()); 
		System.out.println("소문자:" + s.toLowerCase());
		
		System.out.println("특정문자의 위치반환:" + s.indexOf('q'));
		System.out.println("특정문자의 위치반환:" + s.indexOf('X')); //일치하는문자가 없으면 -1
		System.out.println("특정문자열 포함여부:" + s.contains("se")); 
		System.out.println("특정문자열 치환:" + s.replace("se","SE")); 
		
		String s2 = "    hello    ";
		System.out.println("공백제거:" +  s2.trim());
		
		String s3 = "aa,bb,cc";
		String [] array = s3.split(",");
		System.out.println(Arrays.toString(array));
		
		// 문자열이 아닌 값을 문자열로 변환
		String xxx = String.valueOf(123);
		String xxx2 = String.valueOf(3.15F);
		String xxx3 = String.valueOf(true);
		
		System.out.println("원본:" + s); // 원본 문자열은 변경 안됨. ( 철사 )
	}

}
