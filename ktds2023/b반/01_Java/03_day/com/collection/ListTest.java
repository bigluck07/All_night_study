package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListTest {

	public static void main(String[] args) {

		// 순서있고 중복가능
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<String>();
		
		list1.add("홍길동1");
		list1.add("홍길동2");
		list1.add("홍길동3");
		list1.add("홍길동1");

		//삽입
		list1.add(0, "이순신"); // 0번째 위치에 이순신 삽입
		
		//수정
		list1.set(1, "유관순");  // 1번째 위치에 값은 유관순으로 변경
		
		//삭제
		list1.remove(0); // 0번째 위치값 삭제
		list1.remove("홍길동3"); // "홍길동3" 값 삭제
		
		
		//값 출력1
		System.out.println(list1); //list1.toString()
		//값 출력2 - 첨자(index) 사용 가능
		System.out.println(list1.get(0)); 
		System.out.println(list1.get(1)); 
		//값 출력3
		for (String s : list1) {
			System.out.println(s);
		}
		
		
		List<Integer> list4 = new ArrayList<>();
		list4.add(1);
		list4.add(2);
		list4.add(3);
		/*
		 *   remove(int index): 위치값으로 삭제
		 *   remove(Object obj): 값으로 삭제
		 */
		list4.remove(new Integer(1)); // 값으로 삭제
		list4.remove(1);  //위치값으로 삭제
		System.out.println(list4);
		
		
		
	}

}
