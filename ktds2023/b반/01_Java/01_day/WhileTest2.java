import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
	

		// 계속적으로 키보드 입력 받기. 그런데  Q문자입력시 종료하기
		while(true) {
			Scanner scan= new Scanner(System.in);
			System.out.println("이름입력하시오. Q입력시 종료");
			String name = scan.nextLine();
			if("Q".equals(name)) break;
			System.out.println(name);
		}//end whle
		
		
		
		System.out.println("end");
	}//end main

}//end class
