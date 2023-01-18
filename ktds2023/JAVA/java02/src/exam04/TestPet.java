package exam04;

// Cat 및 다른 재사용 클래스 관리
public class TestPet {
	
	public static void main(String[] args) {
		
		Cat c = new Cat();
		Cat c1 = new Cat("망치",2,"암컷");
		
		// setter 메서드 -> 값을 변경하는 메서드
		//망치의 age값 변경 = 메서드를 사용하겠다
		c1.setAge(3);
		// 성별 변경
		c1.setSex("수컷");
		// 이름 변경
		c1.setName("야옹이");
		// 이름,나이 변경
		c1.setNameAge("망치",2);
		// 이름,나이, 성별 변경
		c1.setNameAgeSex("망치",2, "암컷");
		
		// Cat으 인스터스 변수 값 얻기: 직접 접근 ==> 권장 안함
//		c1.age = 10000;// 논리적 문제 있는 데이터가 사용될 수 있음, 검증작업이 누락됨 => Cat클래서 변수는 접근지정자로 막아야 함
//		System.out.println(c1.name);
		
		// Cat으 인스터스 변수 값 얻기: 메소드 ==> 권장.
		String name = c1.getName();
		int age = c1.getAge();
		String sex = c1.getSex();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(sex);
	}

}
