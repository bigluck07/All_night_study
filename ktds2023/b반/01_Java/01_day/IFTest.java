
public class IFTest {

	public static void main(String[] args) {
	
		
		//1. 조건문
		//가.단일 if문:  조건에 따라서 실행여부 결정
		System.out.println("1");
		if(3>5) {
			System.out.println("2");
			System.out.println("3");
		}
		
		// 나. if~else 문: 조건에 따라서 실행되는 문장이 다를떄 사용
		System.out.println("10");
		if(true) {
			System.out.println("20");
		}else {
			System.out.println("30");
		}
		
		// 다.  다중 if문:   조건이 여러개 지정시 사용
		/*
		 *   90~100:  A학점
		 *   80~89:   B학점
		 *   70~79:   C학점
		 *   나머지:   F학점
		 */
		int num = 80;
		if(num>=90) {
			System.out.println("A");
		}else if(num >=80) {
			System.out.println("B");
		}else if(num >=70 && num <=79) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		
		// switch 문: 다중비교이면서 연산자가 동등인 경우에 사용
		int key = 100;
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
			System.out.println("모두 만족하지 않을 때 실행");
			break;
		}
		// switch에 지정가능한 타입:  byte,short,int, long(x), char, String,  enum 
		char key2='A';
		switch (key2) {
		case 'B':
			
			break;

		default:
			break;
		}
		String key3="AAA";
		switch (key3) {
		case "CCC":
			
			break;

		default:
			break;
		}
		System.out.println("end");
		
	   
	}

}
