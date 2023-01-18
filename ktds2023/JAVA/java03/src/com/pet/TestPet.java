package com.pet;

public class TestPet {

	public static void main(String[] args) {
		
		// 다형성 적용
		
		Pet p = new Cat("야옹이", 1, "암컷"); // Pet, Cat 제외 Object로 받을 수 있음
//		Object p2 = new Cat("야옹이", 1, "암컷"); // 그러나 Pet이 일반적임
		System.out.println(p); // p.toString()
			p = new Dog("망치",3,"블랙");
		System.out.println(p);
		

	}

}
