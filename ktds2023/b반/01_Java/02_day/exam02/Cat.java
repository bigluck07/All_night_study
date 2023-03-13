package exam02;

// 분석단계의 고양이객체
public class Cat {

	//인스턴스 변수(멤버변수)
	String name;
	int age;
	String sex;
	
	public Cat(String name,int age,String sex) {
		System.out.println("Cat4 생성자");
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	//생성자
	// 오버로딩 생성자
	//정의: 하나의 클래스내에 동일한 이름의 생성자가 여러개 지정가능.
	//     단, argument list가 반드시 달라야 된다.
	public Cat() {
		System.out.println("Cat 생성자");
	}
	// {}을 가진 worker 쪽의 변수를 파라미터(parameter)라고 부른다.
	public Cat(String name) {
		System.out.println("Cat2 생성자");
	}
	public Cat(String name, int age) {
		System.out.println("Cat3 생성자");
	}
	

	
	
	
	
	
	//메서드(인스턴스 메서드, 멤버 메서드)
}
