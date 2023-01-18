
public class VariableTest {
	
	public static void main(String[] args) {
		
		//1. 변수선언
		int age;
		String name;
		float height;
		boolean isMarried;
		
		//2. 변수 초기화
		age = 30;
		name = "홍길동";
		// height = 180.3; // 에러이유 바이트가 다름 f쓰던지 더블 변결하던지
		height = 180.3f;
		isMarried = false;
		
		System.out.println(age);
		System.out.println(name);
		System.out.println(height);
		System.out.println(isMarried);
		
		// 한꺼번에
		// int age = 20; // 변수명 중복 에러
		int age2 = 20; // 변수명 중복 에러
	}
	
}
