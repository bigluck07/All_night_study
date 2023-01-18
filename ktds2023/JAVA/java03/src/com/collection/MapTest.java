package com.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {

		// key:value 쌍으로 저장
		Map<String, String> m = new HashMap<>(); // <key, value>
		
		// 데이터 저장
		m.put("p1", "tv");
		m.put("p2", "phone");
		m.put("p3", "notebok");
		m.put("p3", "pade"); // 에러나지 않으며 해당 키의 벨류값이 수정됨

		// 값 출력: 반드시 key값을 알아야 함 -> key로 value값 반환
		//1. 키를 알고 있을 때
		System.out.println(m.get("p1"));
		System.out.println(m.get("p2"));
		System.out.println(m.get("p3"));
		System.out.println(m.get("p4")); // 없는 키는 null 반환

		
		//2. 키값만 따로 얻기
//		System.out.println(m.keySet());
		Set<String> keys = m.keySet();
		System.out.println(keys); // [p1, p2, p3]
		for (String key : keys) {
			System.out.println(key+"\t"+m.get(key));
		} // end for
		
		// 삭제
		m.remove("p1");
		System.out.println(m);
		
	} // end main

} // end class
