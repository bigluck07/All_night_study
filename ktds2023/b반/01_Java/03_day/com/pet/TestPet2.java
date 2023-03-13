package com.pet;

public class TestPet2 {

	public static void main(String[] args) {

		//다형성 적용 예
		//1. 배열 : 상속관계인 서로 다른 데이터 타입을 저장할 수 있다.
		Cat c = new Cat("야옹이", 1, "암컷");
		
		Pet [] p = {c,
				    new Dog("망치1", 3, "블랙"),
				    new Cat("야옹이2", 2, "수컷"),
				    new Dog("망치2", 3, "블랙"),
				    new Dog("망치3", 3, "블랙")};
		
	}

}
