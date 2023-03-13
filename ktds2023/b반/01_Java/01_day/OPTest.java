
public class OPTest {

	public static void main(String[] args) {
	
	  //1. 산술연산자
	  int n = 10;
	  int n2 = 3;
	  System.out.println(n+n2);
	  System.out.println(n-n2);
	  System.out.println(n*n2);
	  System.out.println(n/n2);
	  System.out.println(n%n2);
	
	  //2. 비교 연산자 ==> 실행결과는 논리값(true/false)로 반환
	  System.out.println(n>n2);
	  System.out.println(n>=n2);
	  System.out.println(n<n2);
	  System.out.println(n<n2);
	  System.out.println(n==n2); // 같냐? 기본형: == 연산자 이용, 참조형:  equals() 메서드 사용
	  System.out.println(n!=n2);
	
	  //3. 대입연산자 ==> 값을 대입( 그냥대입, 더해서대입, 빼서대입, 곰해서대입, 나누어서대입..)
	   int x = 10;
	   int x2 = 20;
	   // 문제: x와 x2 을 더해서 다시 x에 저장하시오
	   x += x2; //x = x + x2; 동일
	   x -= x2; //x = x - x2; 동일
	   x *= x2; //x = x * x2; 동일
	   x /= x2; //x = x / x2; 동일
	   x %= x2; //x = x % x2; 동일
	   
	  //4. 증감연산자 ==> 값을 1 증가 (증가연산자) , 값을 1 감소 (감소 연산자 )
	  //  독자적으로 사용시 전치 및 후치 결과는 동일하다. 그런데 다른 연산자 사용시 값이 달라질 수 있다.
	   int k = 10;
	  // 문제: k에 1을 더해서 다시 k에 저장하시오

	   ++k; // k += 1; k = k + 1; 와 동일   전치 연산자
	   System.out.println(k);
	   
	   k--; // k -= 1; k = k - 1; 와 동일   후치 연산자
	   System.out.println(k);
	   
	// 문제2: z에 1을 더해서 result에 저장하시오
	    int z = 10;
	    int result = ++z;  // 전치는 먼저 증가하고 나중에 result에 할당. 
	    int result2 = z++; // 후치는 먼저 result에 할당  나중에   증가.
	    
	    System.out.println(z + " " + result);
	   
	}

}
