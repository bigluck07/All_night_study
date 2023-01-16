package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListTest2 {

	public static void main(String[] args) {

		// 고양이 2마리 관리: 야옹이 2 암컷, 망치 1 수컷
		/*
		 * 1. 클래스 만들기
		 */
//		Cat c1 = new Cat("야옹이", 2, "암컷"); // 더 많으면 배열, 컬랙션으로 만들기
//		Cat c2 = new Cat("망치", 1, "수컷");
		
		List<Cat> list = new ArrayList<Cat>(); // 뒤 제네릭에는 Cat 안써도됨
//		list.add(c1);
		list.add(new Cat("야옹이", 2, "암컷"));
		list.add(new Cat("망치", 1, "수컷"));
		
		//1. 모든 정보 출력
		for (Cat cat : list) {
			System.out.println(cat);
		}
		
		//2. 고양이 나이의 합을 출력하시오
		int age = 0;
		for (Cat cat : list) {
			age+= cat.getAge();
		}
		System.out.println(age);
	}
}
