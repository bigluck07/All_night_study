package exam05;

// Cat 및 다른 재사용 클래스 관리
public class TestHandler {

	public static void main(String[] args) {

		// static은 인스턴스(new) 전에 접근 가능
		Test.b();
		Test.num=20;
	
		//인스턴스 접근는 반드시 객체생성이후에 
		Test t = new Test();
		t.a();
		t.size=10;
		
		
		
	}

}



