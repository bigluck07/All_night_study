import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
	   // while문은 조건식이 먼저 나오기 떄문에 한번도 실행안될 수 있다.
		int num = 10;
		while(num < 8) {
			System.out.println("while 문");
			num++;
		}
	// do ~ while문은  조건식이 나중에 나오기 떄문에 적어도 한번은 실행 될 수 있다.
		int num2 = 10;
		do {
			System.out.println("do~while 문");
			num2++;
		}while(num2<8);
		
		
		System.out.println("end");
	}//end main

}//end class
