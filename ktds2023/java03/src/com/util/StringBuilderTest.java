package com.util;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		// StringBuilder class
		StringBuilder s = new StringBuilder("sequence");
		
		// 가공
		s.append(" AAA");
		s.append(" BBB");
		s.append(" CCC"); // 원본 변경(고무줄)
		s.insert(0, "hello");
		s.delete(0, 5); // (start, end-1) 범위지정 삭제(0~4 삭제)
		System.out.println(s); //s.toString()
		s.reverse(); //문자열 뒤짚힘
		System.out.println(s); 
		String x = s.toString(); // String 변수에 넣는 방법		
	}

}
