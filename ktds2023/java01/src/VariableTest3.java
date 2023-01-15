
public class VariableTest3 {
	
	// 메소드 밖
	int num=100; // 인스턴스 변수, heap메모리
	static int sum; // static 변수, method area메모리
	
	
	
	// main 메소드
	public static void main(String[] args) {
		

		// 메소드 안 = 로컬변수
		int age = 10;
		float height = 3.17f;
		
		System.out.println(age);
		
//		System.out.println(num); // 객체생성시 변수가 생겨서안됨
		
		VariableTest3 s = new VariableTest3();
		System.out.println(s.num);
		
	
	}
}
