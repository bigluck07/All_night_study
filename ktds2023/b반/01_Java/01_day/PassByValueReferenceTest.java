import java.util.Arrays;

public class PassByValueReferenceTest {

	public static void pdt(int n) {
		System.out.println("pdt:" +  n);
		//값 변경
		n = 20;
	}
	
	public static void rdt(int [] x) {
		//값 변경
		x[0] = 1000;
	}
	public static void main(String[] args) {

		// 기본형 변수
		int num = 10;
		System.out.println("변경전 값:" + num);  // 10
		pdt(num); // call by value: 기본형 데이터 전달, 실제값이 전달됨. 따라서 메서드에서 값변경해도 원본값 변경안됨.
		System.out.println("변경후 값:" + num);  // 10
		
		// 참조형 변수
		int [] n = {100,200,300};
		System.out.println("변경전 값:" + Arrays.toString(n));  // [100, 200, 300]
		rdt(n);// call by value reference: 참조형 데이터 전달, 실제값(주소값), 따라서 메서드에서 값변경하면 원본값도 변경됨
		System.out.println("변경후 값:" + Arrays.toString(n));  // [1000, 200, 300]
	}// end main

}// end class
