package com.util;

public class StringTest {

	public static void main(String[] args) {
	
		//String  클래스
		
		//1. 리터럴 이용
		String s = "hello";
		String s2 = "hello";
		
		//2. new 이용
		String x = new String("hello");
		String x2 = new String("hello");
		
		System.out.println(s);
		System.out.println(x);
		
		//주소값 비교
		System.out.println(s == s2); // true
		System.out.println(x == x2); // false
		
		//실제값 비교 ==>반드시 문자열 비교는 equals 메서드를 사용한다.
		System.out.println(s.equals(s2));
		System.out.println(x.equals(x2));
		System.out.println(x.equals(s));
	}

}
