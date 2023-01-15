
public class TypeCasting {

	public static void main(String[] args) {
		
		//1. 묵시적 형변환
		// 가. int보다 작은 데이터의 연살결과는 int로 반환
		short b = 10;
		short b2 = 20;
//		short b3 = b+b2; // short+short = int 30을 4byte로 해결하려고 해서 -> 해결은 int로 바꾸던지, 강제로 변환하던지
		int b3 = b+b2;
		
		// 나. byte > short > int > long > float > double
		byte x = 10;
		short x2 = x;
		int x3 = x2;
		long x4 = x3;
		float x5 = x4;
		double x6 = x5;
		
		// 다. 작은타입과 큰타입 연산결과는 큰타입으로 반환.
		int y = 10;
		float y2 = 3.14F;
//		int y3 = y+y2; // 
		double y3 = y+y2; // 
		
		// 라. char > int ( 아스키코드 )
		int z = 'A'; // 65
		int z2 = 'a';// 97
		System.out.println(z);
		System.out.println(z2);
		
		
		//2. 명시적 형변환 ==> 형변환 연산자 (타입) 사용
		short k = 10;
		short k2 = 20;
		short k3 = (short)(k+k2);
		
		/*
		 * 정리: 기본형 데이터의 형변환 뿐만 아니라 
		 * 		참조형 데이터도 형변환이 가능함.(상속 전제)
		 */
	}
}
