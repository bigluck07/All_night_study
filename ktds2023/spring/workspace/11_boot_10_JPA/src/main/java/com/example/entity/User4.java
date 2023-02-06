package com.example.entity;

import org.springframework.context.annotation.Entity;

@Entity
public class User4 {
	
	@Id @GeneratedValue // primary key + 자동으로 증가
	Long id;
	
	@Column(name="username", length=100, nullable = false) // 컬럼 정의
	String name;
	Integer age;
	
	
	public User4() {
	}

	public User4(Long id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	

}
