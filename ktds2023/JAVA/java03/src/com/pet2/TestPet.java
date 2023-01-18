package com.pet2;

public class TestPet {

	public static void main(String[] args) {
		
//		Pet p = new Pet(); // 추상클래스 new불가
		Pet p = new Cat(); // 자식 클래스를 통해 사용
		p.eat();
			p = new Dog();
		p.eat();



	}

}
