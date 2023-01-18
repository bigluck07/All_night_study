import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		
		//계속 키보드로 입력 받기. 근데 Q문자 입력시 종료
		
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("이름을 입력하시오. Q입력시 종료");
			String name = scan.nextLine();
			if ("Q".equals(name)) break;
			System.out.println(name);
		}//end while
		
		System.out.println("end");
		
		
	}//end main

}//end class
