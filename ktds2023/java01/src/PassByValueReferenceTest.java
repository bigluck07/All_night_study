import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class PassByValueReferenceTest {
	
	public static void pdt(int n) { // 기본형
		System.out.println("pdt:" + n);
		// 값 변경
		n = 20;
	}
	public static void rdt(int [] x) { // 참조형
		System.out.println("rdt:" + Arrays.toString(x));
		// 값 변경 
		x[0] = 1000;
	}

	public static void main(String[] args) {
		
		// 기본형 변수
		int num = 10;
		System.out.println("변경전 값" + num);
		pdt(num); // call by value: 기본형 데이터 전달. 실제값이 전달됨. -> 메소드 값 변경 시 원본값 변경 x
		System.out.println("변경후 값"+ num);
		System.out.println(" ");
		
		// 참조형 변수
		int [] n = {100,200,300};
		System.out.println("변경전 값" + Arrays.toString(n)); // 배열의 실제값을 출력할 때 사용
		rdt(n); // call by value: 참조형 데이터 전달. 실제값(주소값)이 전달됨. -> 메소드 값 변경 시 원본값 변경 o
		System.out.println("변경후 값" + Arrays.toString(n));
		
	}//end main

}//end class
