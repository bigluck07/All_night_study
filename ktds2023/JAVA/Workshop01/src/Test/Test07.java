package Test;
import java.util.Scanner;


public class Test07 {
	
	public static void main(String[] args) {
		
		// Scanner 클래스를 사용하여 키보드로 값을 입력 받아서 실행 결과와 같이 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = scan.nextLine();
		System.out.println("나이를 입력하세요.");
		int age = scan.nextInt();
		System.out.println("이름은 "+name+", 나이는 "+age+" 입니다");
		
		// Scanner 이용하여 값을 입력 받는 코드 구현);

	}//end main

}//end class

//1.이름을 입력하세요.
//홍길동
//2.나이를 입력하세요.
//20
//이름은 홍길동, 나이는 20 입니다