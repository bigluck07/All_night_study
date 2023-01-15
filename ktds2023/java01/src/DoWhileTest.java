import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		
		//while 조건을 먼저보니, 실행안될 수 있음
		int num = 10;
		while(num < 8) { // 조건을 먼저 체크
			System.out.println("while 문");
			num++;
		}//end while
		
		
		//do~while 실행문 먼저 돌리니, 한번은 실행 됨
		int num2 = 10;
		do {			// 실행문 먼저 실행
			System.out.println("do~while 문");
			num2++;
		}while(num2<8);//end do~while
		
		System.out.println("end");
	}//end main

}//end class
