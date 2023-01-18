package exam07;

// Cat is a Pet 성립: 상속관계 가능

public class Cat extends Pet{
	
	// 독립 속성
	String sex;
	
	//생성자
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	//명시적 생성자
//	public Cat(String name, int age, String sex) {
////		this.name = name;
////		this.age = age;
//		super(name, age);
//		this.sex = sex;
//	}
	
	// generate
	public Cat(String name, int age, String sex) {
		super(name, age);
		this.sex = sex;
	}
	
	// 독립 기능	
	public void sleap() {}

	@Override
	public String getPet() {
		// TODO Auto-generated method stub
		return super.getPet()+"\t"+sex;
	}

	// Cat에서 Pet의 getPet() 메서드 수정
	// 부모 메서드를 자식이 필요에 의해 수정한 메서드 = 오버라이딩 메서드
	/*
	 * overloading method
	 * 		- 상속과 무관함
	 * 		- 하나의 클래스에서 동일한 이름의 메서드가 여러개 인 것
	 * 		- 반드시 argument list가 달라야 함
	 * 
	 * overriding method
	 * 		- 상속이 전제
	 *      - 부모 메서드를 자식이 수정
	 *      - 반드시 부모메소드 이름, 리턴타입, argument list 동일
	 */
//	@Override // annotation - 알려주는 기능, 제대로 하게 강제성을 부여하는 기능
//	public String getPet() { // 접근지정자는 부모보다 같거나, 확장만 가능
//		return name+"\t"+age+"\t"+sex;
//	} // @Override를 적으면 메서드 이름이 달라지면 에러남
	
	
}
