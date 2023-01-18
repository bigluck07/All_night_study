package com.util;

import java.util.Arrays;

public class StringTest2 {

	public static void main(String[] args) {
		
		// String class
		String s = "sequeNCe";
		
		// 사용 빈도 높은 메서드
		System.out.println("특정위치의 문자 반환: "+s.charAt(0));
		System.out.println("문자열 길이: "+s.length());
		System.out.println("문자열 연결: "+s.concat("!!!")); // 본문자열+추가문자열
		System.out.println("부분열: "+s.substring(1)); // 1~끝;
		System.out.println("부분열: "+s.substring(1, 4)); // 1~3;
		System.out.println("문자열 길이: "+s.length());
		System.out.println("대문자: "+s.toUpperCase());
		System.out.println("소문자: "+s.toLowerCase());
		
		System.out.println("특정 문자의 위치: "+s.indexOf('q'));
		System.out.println("특정 문자의 위치: "+s.indexOf('x')); // 없으면 -1 반환
		System.out.println("특정 문자의 문자열 포함여부: "+s.contains("se"));
		System.out.println("특정 문자열 치환: "+s.replace("se", "SE"));
		

		String s2 = "     hello     ";
		System.out.println("공백제거: "+s2.strip());
		
		String s3 = "aa,bb,cc";
		String[] arr = s3.split(",");
		System.out.println(Arrays.toString(arr));
		
		// 문자열이 아닌 값 문자열 변환
		String x = String.valueOf(123);
		String x2 = String.valueOf(3.123f);
		String x3 = String.valueOf(true);
		
		System.out.println("원본: "+s); // 원본 문자열은 변경 안됨. (철사)
	}

}
