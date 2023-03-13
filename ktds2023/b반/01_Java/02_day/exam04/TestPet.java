package exam04;

// Cat 및 다른 재사용 클래스 관리
public class TestPet {

	public static void main(String[] args) {

		Cat c = new Cat();
		
		Cat c1 = new Cat("망치",2,"암컷");
		
		//망치의 age값을 변경: 메서드 이용
		// setter 메서드
		c1.setAge(3);
		c1.setSex("수컷");
		c1.setName("야옹이");
		c1.setNameAge("망치",2);
		c1.setNameAgeSex("뭉크",1,"수컷");
		
		// Cat의 인스턴스 변수값 얻기: 직접 접근 ==> 권장안함.
//		c1.age = 10000; //논리적으로 문제 있음. 검증작업이 누락.
//		
//		System.out.println(c1.name);
//		System.out.println(c1.age);
//		System.out.println(c1.sex);
		
		// Cat의 인스턴스 변수값 얻기: 메서드 ==> 권장.
		//getter 메서드
		String name = c1.getName();
		int age = c1.getAge();
		String sex = c1.getSex();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(sex);
		
		
	}

}



