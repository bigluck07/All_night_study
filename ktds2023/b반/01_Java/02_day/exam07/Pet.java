package exam07;

// 애완동물의 부모 클래스
public class Pet{ //  extends Object 자동삽입

	//공통적인 속성
	String name;
    int age;

	public Pet() {
		super();
	}

	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//공통적인 기능
	public void eat() {}
	
	//Pet 정보 반환 메서드
	public String getPet() {
		return name+"\t"+age;
	}

	
}
