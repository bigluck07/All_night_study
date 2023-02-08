package com.example.entity;

@Entity
public class User3 {
	
	@Id
	Long id;
	
	@Column(name="username", length=100, nullable = false) // 컬럼 생성 VARCHARR(255)
	String name;
	Integer age;
	
	
	public User3() {
	}

	public User3(Long id, String name, Integer age) {
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
