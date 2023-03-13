import java.util.Scanner;

public class KeyboardInput {

	public static void main(String[] args) {
	
		//키보드로 입력한 값 얻기
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하시오");
		String name = scan.nextLine();
		System.out.println("나이를 입력하시오");
		int age = scan.nextInt();
		System.out.println(name+"\t"+age);
		
		
		
		System.out.println("end");
	}//end main

}//end class
