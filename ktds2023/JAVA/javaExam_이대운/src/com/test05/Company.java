package com.test05;

import java.util.HashMap;
import java.util.Set;

public class Company {

	public static void main(String[] args) {
		
		// 1번의 데이터를 기반으로 객체를 생성하여 HashMap에 저장한다. 
		// HashMap에 저장시 키 값은 각 객체의 Number로 한다. 
		HashMap<Integer, Employee> map = new HashMap<>( );
		map.put(1, new Secretary("홍길동", 1, "Secretary", 800));
		map.put(2, new Sales("이순신", 2, "Sales", 1200));
		
	
		// 모든 객체의 기본 정보를 출력한다. ( for문 이용 , keySet() 이용 ) 
		Set<Integer> keys = map.keySet();
		System.out.println("name\tdepartment\tsalary");
		System.out.println("-----------------------------");
		for (int key : keys) {
			System.out.println(map.get(key).getName()+"\t"+map.get(key).getDepartment()+"\t"+map.get(key).getSalary());
		}
		
		// 모든 객체의 인센티브 100씩 지급한다. 
		System.out.println("");
		System.out.println("인센티브100지급");
		System.out.println("");
		
		// 모든 객체의 정보와 세금을 출력한다. ( for문 이용 )
		System.out.println("name\tdepartment\tsalary\ttax");
		System.out.println("-----------------------------");
		for (int key : keys) {
			System.out.println(map.get(key).getName()+"\t"+map.get(key).getDepartment()+"\t"+map.get(key).getSalary()+"\t"+map.get(key).tax());
		}
	}

}
