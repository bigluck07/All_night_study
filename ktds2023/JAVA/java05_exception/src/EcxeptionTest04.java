class Test {
	
	public void a() throws ArithmeticException{
		b();
	}
	
	public void b() throws ArithmeticException{
		int num = 0;
		int result = 10/num;
		System.out.println("결과값: " + result);
	}
} // end Test


public class EcxeptionTest04 {

	public static void main(String[] args) {
		System.out.println("start");
		
		Test t = new Test();
		try {
			t.a();
		} catch (ArithmeticException e) { // 발생된 모든 예외 정보는 e변수에 저장
//			System.out.println("예외발생: "+e.getClass());
//			System.out.println(e.getMessage());
			e.printStackTrace(); // 정상종료는 되며, 에러의 종류를 출력함 => 개발자의 디버깅용으로 주로 사용
			
		}
		
		System.out.println("end");
	}

} // end main
