package com.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {

		// key/value  쌍으로 저장하여 관리
		Map<String, String> m = new HashMap<>();
		//데이터 저장
		m.put("p1", "tv");
		m.put("p2", "phone");
		m.put("p3", "notebook");
		m.put("p3", "pc"); // key 가 동일하면 덮어쓴다.
		
		// 값 출력: 반드시 key 이용하여 value값을 반환받음
		// 1) key 알고있을 때.
		System.out.println(m.get("p1"));
		System.out.println(m.get("p2"));
		System.out.println(m.get("p3"));
		System.out.println(m.get("p5"));  //없는 key사용시 null 반환.
		
		// 2) key 값만 따로 얻고 나중에 value 얻는다.
		Set<String> keys =m.keySet();
		System.out.println(keys); //[p1, p2, p3]
		for (String key : keys) {
			System.out.println(key+"\t" + m.get(key));
		}
		
		//삭제
		m.remove("p1");
		System.out.println(m);
	}//end main

}//end class
