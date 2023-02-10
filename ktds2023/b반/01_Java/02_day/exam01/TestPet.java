package exam01;

// Cat 및 다른 재사용 클래스 관리
public class TestPet {

	public static void main(String[] args) {

		//객체생성
		// 클래스명 변수명 = new 클래스명();
		Cat c  = new Cat();
		
		//초기화 작업
		c.name = "야옹이";
		c.age = 2;
		c.sex = "암컷";
		
		//출력
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.sex);
		
		
		// 클래스명 변수명 = new 클래스명();
		Cat c2  = new Cat();
				//초기화 작업
		c2.name = "망치";
		c2.age = 1;
		c2.sex = "수컷";
		//출력
		System.out.println(c2.name);
		System.out.println(c2.age);
		System.out.println(c2.sex);
		
	}

}
