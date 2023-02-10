package com.pet;

public class TestPet3 {

	public static void main(String[] args) {

		//다형성 적용 예
		//1. 배열 : 상속관계인 서로 다른 데이터 타입을 저장할 수 있다.
		// 
		Cat c = new Cat("야옹이", 1, "암컷");
		
		Pet [] p = {c,
				    new Dog("망치1", 3, "블랙"),
				    new Cat("야옹이2", 2, "수컷"),
				    new Dog("망치2", 3, "블랙"),
				    new Dog("망치3", 3, "블랙")};
		//전체 출력하시오
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
		}
		//향상된 for문 : foreach 문
		/*
		 *   for(  변수: 배열명){
		 *   
		 *   }
		 * 
		 */
		for (Pet pet : p) {
			System.out.println(">>"+ pet);
		}

		//Dog 만 출력하시오 =>   instanceOf 
		for (Pet pet : p) {
			if(pet instanceof Dog) {
			  System.out.println("$$$$"+ pet);
			}
		}
		//Dog 의 이름과 색상만 출력하시오
		for (Pet pet : p) {
			if(pet instanceof Dog) {
			  // Dog 타입으로 형변환 
			  Dog d = (Dog)pet;
			  System.out.println("%%%%"+ d.getName()+"\t"+d.getColor());
			}
		}
	}

}
