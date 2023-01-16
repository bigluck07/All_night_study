package com.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {

		// 고양이 2마리 관리: 야옹이 2 암컷, 망치 1 수컷
		Map<Integer, Cat> cats = new HashMap<>(); // <key, value>
		
		// 데이터 저장
		cats.put(1, new Cat("야옹이", 2, "암컷"));
		cats.put(2, new Cat("망치", 1, "수컷"));
		
		// 데이터 출력
//		System.out.println(cats);
		
		for (Map.Entry<Integer, Cat> entry : cats.entrySet()) {
			Integer key = entry.getKey();
			Cat val = entry.getValue();
			System.out.println(key + "\t" + val);
		}



		
	} // end main

} // end class
