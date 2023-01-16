package com.pet;

import java.util.Iterator;

public class TestPet2 {
	
	public static void main(String[] args) {
		
		// 다형성 적용 예
		//1. 배열
		Cat c = new Cat("야옹이",1,"암컷");
		Pet [] p = {c,
					new Dog("망치1",1,"블랙"),
					new Cat("야옹이2",2,"수컷"),
					new Dog("망치2",2,"화이트"),
					new Dog("망치3",3,"옐로우")};

	}
}
