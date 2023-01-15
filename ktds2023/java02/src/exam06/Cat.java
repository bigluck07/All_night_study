package exam06;

// Cat is a Pet 성립: 상속관계 가능

public class Cat extends Pet{
	
	// 독립 속성
	String sex;
	
	//생성자
	public Cat() {
		// 자식 클래스 생성자 첫라인에서 자동으로 부모 생성자 호출
		// super(); // 명시적호출하려면 이거 쓰면 됨
		// 명시적 호출시 반드시 첫 라인에
		System.out.println("Cat 생성자");
		
	}
	
	// 독립 기능	
	public void sleap() {}

}
