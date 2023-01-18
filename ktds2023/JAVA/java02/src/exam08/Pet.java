package exam08;

public class Pet {
	String name;
	int age;
	

	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void eat() {	
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
	
	
	// 추가 메서드 가능
	// Object에 있는 toString()메서드를 재정의
	// 재정의는 인스턴스 변수값을 쉽게 출력하기 위함
	@Override // 재정의 필수
	public String toString() {// 필수로 만들장
		return "Pet [name=" + name + ", age=" + age + "]";
	}
	
	public String getPet() { // 위랑 같음
		return name+'\t'+age;
	}
	

}
