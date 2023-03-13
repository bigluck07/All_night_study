package com.pet;

public class Cat extends Pet {

	String sex;

	public Cat() {
	}

	public Cat(String name, int age, String sex) {
		super(name, age);
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Cat [sex=" + sex + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
