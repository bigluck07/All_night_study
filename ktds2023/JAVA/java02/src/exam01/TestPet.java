package exam01;

// Cat 및 다른 재사용 클래스 관리
public class TestPet {
	// 이 클래스를 통해 Cat이 메모리에 올라가게 됨 => new를 사용해서 객체가 생성됨
	public static void main(String[] args) {
		
		//객체생성
		 //클래스명 변수명 = new 클래스명();
		Cat c = new Cat(); // 로컬 참조형 변수 - Cat class 타입 -> 주소값 전달
		/*
		 * 1. Cat c
		 * 	stack에 c변수 할당
		 * 2. new Cat()
		 * 	new 객체생성을 통한 heap에 Cat 클래스 할당 -> Cat 인스턴스 생성
		 *  각 변수 초기화(name, age, sex, 메소드)(null, 0, null, 메소드)
		 * 3. new Cat()
		 * 	생성자 수행 -> 실행
		 * 4. Cat c = new Cat();
		 * 	c변수에 인스턴스의 주소값 저장 = 참조가능
		 */
		
		//초기화 작업
		c.name = "야옹이"; //  c. = 소속, 주소
		c.age = 2;
		c.sex = "암컷";
		/*
		 * Cat
		 * 야옹이
		 * 2
		 * 암컷
		 */
		
		//출력
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.sex);
		
		// 다른 고양이 만들기 - 위 c의 생성 및 저장과 동일한 프로세스를 거침
		Cat c2 = new Cat();
		c2.name = "망치";
		c2.age = 1;
		c2.sex = "수컷";
		//출력
		System.out.println(c2.name);
		System.out.println(c2.age);
		System.out.println(c2.sex);
	}

}
