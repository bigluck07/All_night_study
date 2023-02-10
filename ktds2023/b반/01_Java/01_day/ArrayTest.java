import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {

		//배열 사용
		//1. 배열선언 ==> 데이터타입 [] 배열명;
		 int [] n; //n ==>변수, 참조형변수, 배열명, 로컬변수(stack에 생성)
		 
		 //2. 배열생성 ==> 배열명 =  new 데이터타입[size]; 
		 n = new int[3]; // new이용한 객체생성이기 때문에 heap메모리에 생성됨.
		 
//		 System.out.println(n[0]);
//		 System.out.println(n[1]);
//		 System.out.println(n[2]);
		 
		 //3. 배열초기화
		 n[0]=100;
		 n[1]=200;
		 n[2]=300;
//		 n[3]=300; // 없는 위치 접근시 java.lang.ArrayIndexOutOfBoundsException 발생됨.
		 
		 
		 //4. 값 출력
		 for(int idx=0;idx<n.length;idx++) {
			 System.out.println(n[idx]);
		 }
		 
		
	}// end main

}// end class
