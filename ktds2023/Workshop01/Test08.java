import java.util.Arrays;
import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println( "1. 정수를 입력하세요.");
		int num1 = scn.nextInt();
		
		System.out.println( "2. 정수를 입력하세요.");
		int num2 = scn.nextInt();

		System.out.println( "정수 "+num1+"과 정수 "+num2+"의 합계: "+(num1+num2));
	}
}