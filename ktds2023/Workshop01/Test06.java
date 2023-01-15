package Test;
import java.util.Collection;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Test06 {
	
	public static void main(String[] args) {
		// 선언된 정수형 데이터가 홀수인지 짝수인지 출력한다.
		// 단, 연산처리는 삼항 연산자를 이용한다.
		
		int i = 5;
		String result = (i%2 == 1)?"홀수":"짝수";
		System.out.println("선언 변수 5 일때 결과:\n"+"숫자 "+i+"는 "+result+"입니다");

	}//end main

}//end class
