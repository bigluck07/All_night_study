package com.pet;

import java.util.Iterator;

public class TestPet3 {
	
	public static void main(String[] args) {
		
		// 다형성 적용 예
		//1. 배열
		Cat c = new Cat("야옹이",1,"암컷");
		Pet [] p = {c,
					new Dog("망치1",1,"블랙"),
					new Cat("야옹이2",2,"수컷"),
					new Dog("망치2",2,"화이트"),
					new Dog("망치3",3,"옐로우")};
		
		// 전체출력
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
		}
		
		// 향상된 for문 : foreach -> 사용빈도 높음(조건을 확인할 필요가 없어서)
		/*
		 * 	for (변수 : 배열명) { 
		 * 		배열 크기만큼 반복
		 * 	}
		 */
		for (Pet pet : p) {
			System.out.println(">>"+pet);
		}
		
		// Dog만 출력 => instancOf 타입체크하는 함수
		System.out.println("");
		for (Pet pet : p) {
			if (pet instanceof Dog) {
				System.out.println(pet);
			}
		}
		System.out.println("");
		// Dog의 name, color 출력
		for (Pet pet : p) {
			if (pet instanceof Dog) {
				// Dog 타입 형변환이 먼저 되야 color에 접근할 수 있음
				Dog d = (Dog)pet;
				System.out.println(d.getName() +"\t"+ d.getColor() );
			}
		}

	}
}
