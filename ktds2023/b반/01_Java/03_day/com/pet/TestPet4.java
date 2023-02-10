package com.pet;

public class TestPet4 {

	// 메서드
//	public static void method(Cat c) {}
//
//	public static void method(Dog c) {}
//	public static void method(Pet c) {}
	
	public static void method(Object c) {}

	public static void main(String[] args) {

		Cat c = new Cat();
		Dog d = new Dog();
		Pet p = new Pet();

		method(c);
		method(d);
		method(p);

	}

}
