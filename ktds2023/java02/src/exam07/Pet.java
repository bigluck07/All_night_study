package exam07;

// 부모 클래스
public class Pet { // extends Object 자동삽입
	
	// 공통 속성
	String name;
	int age;
	
	//생성자
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// 초기화 위한 생성자
	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// 공통 기능	
	public void eat() {}
	
	
	// 펫정보 반환 메서드
	
	public String getPet() {
		return name+"\t"+age;
	}
	





}
