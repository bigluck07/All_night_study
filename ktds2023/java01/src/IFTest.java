
public class IFTest {

	public static void main(String[] args) {
		
		//1. 조건문
		//가. 단일 if문: 조건에 따라 실행여부 결정
		System.out.println("1");
		if(true) {
			System.out.println("2");
			System.out.println("3");
		}
		
		//나. if~else 문: 조건에 따라서 실행되는 문장이 다를때 사용
		System.out.println("10");
		if(true) { // 블럭 생략도 가능하지만 권장하지 않음
			System.out.println("20");
		}else {
			System.out.println("30");
		}
		
		//다. 다중 if문: 조건이 여러개인 경우 사용
		/*
		 * 90-100 A
		 * 80-89  B
		 * 70-79  C
		 * 나머지   F
		 */
		int num = 80;
		if (num >=90) {
			System.out.println("A");
		}else if(num >=80) { 
			System.out.println("B");
		}else if(num >=70 && num <= 79) { // 논리연산자도 가능 
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		
		//라. switch 문: 다중비교면서 연산자가 동등인 경우에 사용
		/*
		 * switch (key) key로 주어진 값이 같으면 
		 * 해당 case로 들어가서 실행 후 
		 * break를 만나거나, 블럭이 끝날때 까지 밑의 case문을 실행함
		 */
		byte key = 10;
		switch (key) {
		case 5:
			System.out.println("5");
			break;
		case 10:
			System.out.println("10");
			break;
		case 15:
			System.out.println("15");
			break;
		default:
			System.out.println("모두 만족하지 못함");
			break;
		}
		
		// switch 지정 가능 타입: byte, short, int, long(x), char
		
		System.out.println("end");
		
	}

}
