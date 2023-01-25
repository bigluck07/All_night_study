class Test2 {
	
	public void a() throws ArithmeticException, NullPointerException{
		b();
	}
	
	public void b() throws ArithmeticException, NullPointerException{
		int num = 0;
		int result = 10/num;
		System.out.println("결과값: " + result);
		
		// 다른 문장 가정
	}
} // end Test


public class EcxeptionTest05 {

	public static void main(String[] args) {
		System.out.println("start");
		
		Test t = new Test();
		try {
			t.a();
		} catch (ArithmeticException e) { // 예외 정보는 e변수에 저장
			e.printStackTrace(); // 개발자의 디버깅용
		} catch (NullPointerException e) { 
			e.printStackTrace(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

} // end main
