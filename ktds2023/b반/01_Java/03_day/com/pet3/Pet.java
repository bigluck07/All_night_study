package com.pet3;

public abstract class Pet {

	String name;
	int age;
	
	//공통적인 기능
	public abstract void eat();
	
	public Pet() {
	}

	public Pet(String name, int age) {
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
