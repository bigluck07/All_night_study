package exam06;

// 애완동물의 부모 클래스
public class Pet{ //  extends Object 자동삽입

	//공통적인 속성
	String name;
    int age;
	
	public Pet() {
		//자식클래스 생성자 첫라인에서 자동으로 부모 생성자가 호출된다.
		super();
		System.out.println("Pet 생성자");
	}
	//공통적인 기능
	public void eat() {}
	
}
