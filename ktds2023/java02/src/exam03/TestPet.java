package exam03;

// Cat 및 다른 재사용 클래스 관리
public class TestPet {
	
	public static void main(String[] args) {
		
		/*
		 * 호출시 argument list가 반드시 일치해야 함
		 * 1. 갯수
		 * 2. 타입
		 * 3. 순서
		 */
		
		//호출하는 Caller의 값 = 아큐먼트(argument)
		Cat c = new Cat("야옹이");
		Cat c2 = new Cat("망치", 2);
		Cat c3 = new Cat("뭉크", 1, "암컷");
		
//		System.out.println(c3.name);
		
	}

}
