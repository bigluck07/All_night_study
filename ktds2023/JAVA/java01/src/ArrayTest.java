import java.util.Collection;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		
		//배열사용
		//1. 배열선언 ==> 데이터타입[]배열명;
		int [] n; // n => 변수, 참조형변수, 배열명, 로컬변수(stack에 생성)
		
		//2. 배열생성 ==> 배열명 = new 데이터타입 [size];
		n = new int[3]; // new 이용한 객체생성 => heap 메모리에 생성.

//		System.out.println(n[0]);
//		System.out.println(n[1]);
//		System.out.println(n[2]);
		
		for(int idx=0;idx<n.length;idx++) {
			System.out.println(n[idx]);
		}
		
		//3. 배열초기화
		n[0]=100;
		n[1]=200;
		n[2]=300;
//		n[3]=300; // 없는 위치 접근시  java.lang.ArrayIndexOutOfBoundsException 발생
		
		// 출력
		for(int idx=0;idx<n.length;idx++) {
			System.out.println(n[idx]);
		}
		
		
		// 배열길이 구하기
		System.out.println(n.length);
		// 문자열 길이
		System.out.println("hello".length());
		// 컬랙션
//		System.out.println(Collection.size());
		
		System.out.println("end");
	}//end main

}//end class
