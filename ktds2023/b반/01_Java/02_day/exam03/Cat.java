package exam03;

// 분석단계의 고양이객체
public class Cat {

	//인스턴스 변수(멤버변수)
	String name;
	int age;
	String sex;
	
	public Cat() {
	}

	public Cat(String name) {
		this.name = name;
	}

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	
	//메서드(인스턴스 메서드, 멤버 메서드)
}
