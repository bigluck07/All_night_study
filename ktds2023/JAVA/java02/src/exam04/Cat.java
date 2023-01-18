package exam04;

// 분석단계의 고양이객체
public class Cat {
	
	//변수
	private String name;
	private int age;
	private String sex;
	
	//생성자
	public Cat() {
	}
	
	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	// 메서드
	
	//age 변경
	public void setAge(int age) {
		this.age = age;
	}
	//sex 변경
	public void setSex(String sex) {
		this.sex = sex;
	}
	//name 변경
	public void setName(String name) {
		this.name = name;
	}
	//name+age 변경
	public void setNameAge(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//name+age+sex 변경
	public void setNameAgeSex(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	
	// 조회
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getSex() {
		return this.sex;
	}
}
