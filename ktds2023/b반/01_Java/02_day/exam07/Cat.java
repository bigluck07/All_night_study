package exam07;

// Cat is a Pet 성립:상속관계 가능
// 단일상속만 지원
public class Cat extends Pet{

	//Cat에만 있는 속성
	String sex;
	
	public Cat() {
		super();
	}

//	public Cat(String name, int age, String sex) {
////		this.name = name;
////		this.age = age;
//		super(name, age); //명시적으로 부모 생성자 호출
//		this.sex = sex;
//	}
	
	public Cat(String name, int age, String sex) {
		super(name, age);
		this.sex = sex;
	}

	//Cat에만 있는 동작
	public void sleep() {}

	@Override
	public String getPet() {
		return super.getPet()+"\t"+ sex;
	}
	
	//Cat에서 부모인 Pet의 getPet() 메서드를 수정해야 된다.
	// 부모의 메서드를 자식이 필요에 의해서 수정된 메서드: 오버라이딩 메서드 라고 부른다.
	/*
	 *  overloading method:
	 *       - 상속 무관
	 *       - 하나의 클래스내에서 동일한 이름의 메서드가 여러개 사용 가능.
	 *       - 반드시 argument list가 달라야 된다. (갯수, 타입, 순서 )
	 *         예>  public void a(){}
	 * 
	 *             public void a(int n){}
	 *             public void a(String n){}
	 *             public void a(int n, String n2){}
	 *             
	 *             
	 *  overriding method:
	 *       - 상속 전제
	 *       - 부모의 메서드를 자식이 필요에 의해서 수정된 메서드
	 *       - 반드시 부모메서드 이름,리턴타입,argument list가 같아야 된다.
	 *       - 접근지정자는 같거나 확대 사용 가능 ( 축소 불가0) 
	 */
//	@Override  //  annotation 이라고 부른다.
//	public String getPet() {
//		return name+"\t"+age +"\t"+sex;
//	}
	
	
}
