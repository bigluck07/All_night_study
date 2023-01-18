package exam02;

// 분석단계의 고양이객체
public class Cat {
	
	// 인스턴스 변수(맴버변수)
	String name;
	int age;
	String sex;
	
	//메소드(인스턴스 메소드, 맴버 메소드)

	
	//생성자 - worker
	/*
	 * 오버로딩 생성자
	 * 정의: 하나의 클래스내 동일한 이름의 생성자가 여러개 지정한 경우
	 * 		단, argument list가 반드시 달라야 함.
	 */
	public Cat() {
		System.out.println("Cat 생성자");
	}
	// {}을 가진 worker의 변수 = 파라미터(parameter)
	public Cat(String n) {
		System.out.println("Cat2 생성자");
		name = n; // 초기화
	}
	public Cat(String n, int a) {
		System.out.println("Cat3 생성자");
		name = n;
		age = a;
	}
	public Cat(String name, int age, String sex) {
		System.out.println("Cat4 생성자");
//		name = name; // 이러면 지역변수 name에 넣는 중 -> 인스턴스와 로컬변수가 저장소가 달라서 같은 이름 가능함
		this.name = name; // 이러면 인스턴스name에 로컬name 넣는 중
		this.age = age;
		this.sex = sex;
	}
	
}
