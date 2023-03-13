package com.util;

import java.util.Arrays;

public class StringBuilderTest {

	public static void main(String[] args) {
	
		//StringBuilder
		StringBuilder s = new StringBuilder("sequence");
		//가공
		// 가장많이 사용되는 함수는 append 이다
		s.append(" AAA");
		s.append(" BBB");
		s.append(" CCC");
		s.insert(0, "hello");
		s.delete(0, 5); // 0 ~ 4까지 삭제
		System.out.println(s); // s.toString(), 원본이 변경됨.(고무줄)
		System.out.println(s.reverse()); //거꾸로
		String x = s.toString();
	}
}
