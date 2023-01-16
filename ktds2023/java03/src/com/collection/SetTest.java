package com.collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {

		// 순서없고 중복불가
//		Set s = new Set(); // 인터페이스라 에러
		Set s = new HashSet();
		
		s.add("홍길동");
		s.add(1);
		s.add("홍길동2");
		
		// 출력방법1
		System.out.println(s); // s.toString()  호출
		// 출력방법2
		for (Object obj : s) {
			System.out.println(obj);
		}
		
		// generics 이용: 저장되는 데이터타입 제한
		Set<String> s2 = new HashSet<String>(); // 문자열만 저장
		s2.add("홍길동");
//		s2.add(1); // 에러 -> 문자열만 저장 가능함
		s2.add("홍길동2");
		System.out.println(s2);
		

		Set<Integer> s3 = new HashSet<Integer>(); // 정수만 저장
//		s3.add("홍길동");
		s3.add(1); 
//		s3.add("홍길동2");
		System.out.println(s3);

	}

}
