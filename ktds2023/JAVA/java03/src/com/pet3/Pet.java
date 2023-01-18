package com.pet3;

public abstract class Pet {

	String name;
	int age;
	
	// 공통기능
	public abstract void eat();
//	public abstract void fly();// 이러면 개, 고양이도 날아다님
	// interface를 만들어라
	
	
	public Pet() {
		// TODO Auto-generated constructor stub
	}
	
	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
