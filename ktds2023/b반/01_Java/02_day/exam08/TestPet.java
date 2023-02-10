package exam08;

public class TestPet {

	public static void main(String[] args) {

		Pet p = new Pet("애완", 1);
		
		//모든 인스턴스 변수값 출력
		//1. 변수 직접 접근(권장안함)
		System.out.println(p.name);
		System.out.println(p.age);
		
		//2. getter  메서드
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		//3. 한꺼번에 반환하는 메서드
		System.out.println(p.getPet());
		
		//4. toString() 메서드 호출
		// 참조변수를 print하면 자동으로 toString() 호출된다.
		System.out.println(p);
		System.out.println(p.toString());
	}

}
