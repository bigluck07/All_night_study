package com.pet;

import java.util.Iterator;

public class TestPet4 {
	
//	public static void method(Cat c) {} // 상위 클래스인 Pet하나로 해결 가능
//	public static void method(Dog c) {}
//	public static void method(Pet c) {}
	public static void method(Object c) {} // Pet도 가능하지만 Object가 보편적
	
	
	public static void main(String[] args) {
		
		Cat c = new Cat();
		Dog d = new Dog();
		Pet p = new Pet();
		
		method(c);
		method(d);
		method(p);
		
		
	}
}
