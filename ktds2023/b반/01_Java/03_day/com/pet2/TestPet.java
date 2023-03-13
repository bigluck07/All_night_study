package com.pet2;

public class TestPet {

	public static void main(String[] args) {

//		Pet p = new Pet(); //추상 클래스 new 불가
		Pet p = new Cat();
		p.eat();
		    p = new Dog();
		p.eat();    
	}

}
