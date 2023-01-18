package com.pet2;

public class Cat extends Pet {
	
	String sex;

	
	// 
	public void eat() { // eatCat이 안되는 이유 -> Pet이 abstrace임
		System.out.println("냠냠");
	}
	
	
	
	
	public Cat() {
		// TODO Auto-generated constructor stub
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
