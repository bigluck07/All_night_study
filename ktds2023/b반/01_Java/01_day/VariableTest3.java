
public class VariableTest3 {

	//메서드 밖
	int num=100;   // 인스턴스 변수, heap 메모리
	static int sum; // static 변수, method area 메모리
	
	// main 메서드
	public static void main(String[] args) {
	
		//메서드 안--> 로컬변수, stack 메모리에 저장됨.
		 int age = 10;
		 float height;
		 
		 System.out.println(age);
//		 System.out.println(height); // 초기화 필수
		
		 // 인스턴스 변수는 반드시 객체생성하고 사용한다.
		 VariableTest3 s = new VariableTest3();
		 System.out.println(s.num); 
	}

}
