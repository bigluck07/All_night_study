package com.util;

public class StringTest {

	public static void main(String[] args) {
		
		// String 클래스
		//1. 리터럴
		String s = "hello";
		String s2 = "hello"; // 값 저장
		
		
		//2. new
		String x = new String("hello");
		String x2 = new String("hello"); // 주소값 저장
		
		System.out.println(s);
		System.out.println(x);
		
		// 주소값 비교
		System.out.println(s==s2); // true
		System.out.println(x==x2); // false
		
		//실제값 비교 -> 문자열 비교는 무적권
		System.out.println(s.equals(s2)); // true
		System.out.println(x.equals(x2)); // true
		System.out.println(x.equals(s)); // true
	}

}
