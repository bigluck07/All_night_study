package exam06;

// Cat is a Pet 성립:상속관계 가능
// 단일상속만 지원
public class Cat extends Pet{

	//Cat에만 있는 속성
	String sex;
	
	public Cat() {
		//자식클래스 생성자 첫라인에서 자동으로 부모 생성자가 호출된다.
		super(); //명시적으로 호출시 반드시 첫라인에서 사용.
		System.out.println("Cat 생성자");
	}
	
	//Cat에만 있는 동작
	public void sleep() {}
}
