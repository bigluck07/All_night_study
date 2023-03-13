package exam04;

// 분석단계의 고양이객체
public class Cat {

	//인스턴스 변수(멤버변수)
	private String name;
	private int age;
	private String sex;
	
	public Cat() {
	}

	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	//메서드(인스턴스 메서드, 멤버 메서드)
	
	//age 변경하는 메서드
	public void setAge(int age) {
		this.age = age;
	}
	//sex 변경하는 메서드
	public void setSex(String sex) {
		this.sex = sex;
	}
	//name 변경하는 메서드
	public void setName(String name) {
		this.name = name;
	}

	public void setNameAge(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setNameAgeSex(String name,
			int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public  String  getName() {
		return this.name;
	}
	public  int  getAge() {
		return this.age;
	}
	public  String  getSex() {
		return this.sex;
	}
	
	//추가로 필요한 메서드 정의 가능
	
	
	
	
}
