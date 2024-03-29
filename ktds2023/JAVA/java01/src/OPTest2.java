
public class OPTest2 {

	public static void main(String[] args) {
		
		//4. 논리연산자==> 실행결과 논리값
		  // && (and, 그리고) ===> 모두 ture값인 경우 true 반환
		  // || (or, 또는) ===> 하나라도 ture면 true 반환
		  // ! (not, 부정) ===> true와 false를 반대로 바꿔줌
		int n = 10;
		int n2 = 9;
		
		//문제 : n이 20보다 크고 n2보다 작냐?
		boolean result = (n > 20) && (n < n2);
		System.out.println(result);
		
		//문제 : n이 8보다 크거나 n2보다 작냐?
		boolean result2 = (n > 8) || (n < n2);
		System.out.println(result2);

		System.out.println(!result);
		System.out.println(!result2);
		
		// 자바의 논리연사자 특징 ( short circuit logical operator )
		System.out.println((3>2) && (4==3));
		System.out.println((3<2) && (4==3)); // 노란 밑줄의 의미 = 실행을 하지 않는다, 앞에서 이미 false

		System.out.println((3>2) || (4==3)); // 앞에서 이미 true임
		System.out.println((3<2) || (4==3));
		
		
		//5. 3항 연산자 ==> 변수 = (조건식)?참:거짓;
		int m = (3<4)?100:200;
		String m2 = (3<4)?"100":"200";
		System.out.println(m);
		System.out.println(m2);
		
		
		// 참조형 : instanceof 연산자 ==> 객체type 식별
		String name = "aa";
		System.out.println(name instanceof String); // true
	}

}
