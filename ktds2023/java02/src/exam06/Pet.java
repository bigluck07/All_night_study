package exam06;

// 부모 클래스
public class Pet { // extends Object 자동삽입
	
	// 공통 속성
	String name;
	int age;
	
	//생성자
		public Pet() {
			// 자식 클래스 생성자 첫라인에서 자동으로 부모 생성자 호출
			super(); 
			System.out.println("Pet 생성자");
			
		}
	
	// 공통 기능	
	public void eat() {}



}
