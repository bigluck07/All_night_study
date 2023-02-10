package exam04;

// 분석단계의 강아지객체
public class Dog {

	//인스턴스 변수(멤버변수)
	private String name;
	private int age;
	
	public Dog() {
	}

	public Dog(String name, int age) {
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

	//메서드 추가
	
}
