package com.collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {

		// 순서없고 중복불가
		Set s = new HashSet();
		s.add("홍길동");
		s.add(20);
		s.add("홍길동");
		//출력방법1
		System.out.println(s); // s.toString()  호출
		//출력방법2
		for (Object obj : s) {
			System.out.println(obj);
		}
		//제네릭스 이용: 저장되는 데이터 타입 제한
		Set<String> s2 = new HashSet<String>();
		s2.add("홍길동1");
//		s2.add(20);
		s2.add("홍길동2");
		
		Set<Integer> s3 = new HashSet<Integer>();
//		s3.add("홍길동1");
		s3.add(20);
//		s3.add("홍길동2");
		
	}

}
