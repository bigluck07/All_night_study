
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
		
		
		//2. 비교연산자 ==> 논리값을 반환
		System.out.println(n>n2);
		System.out.println(n>=n2);
		System.out.println(n<n2);
		System.out.println(n<=n2);
		System.out.println(n==n2); // 같은지 확인 1. 기본형 ==, 2. 참조형 equals() 메소드 사용
		System.out.println(n!=n2);
		
		
		//3. 대입연산자 ==> 값을 대입( 그냥 대입 더해서대입, 빼서대입, 곱해서대입 나눠서대입
		int x = 10;
		int x2 = 20;
		
		x+=x2;
		x-=x2;
		x*=x2;
		x/=x2;
		x%=x2;
		
		//4. 증감연산자 ==> 값 1증가(증가연산자), 값 1감소(감소연산자)
		// 독자적으로 사용시 전치, 후치 결과는 동일, 다른 연산자 혼용시 값이 달라짐
		int k = 10;
		++k; // 전치연산자
		k++; // k+=1; k = k+1;
		System.out.println(k);
		
		k--;
		System.out.println(k);
		
		int z = 10;
		int result = ++z; // 전치는 증가후 할당, 후치는 할당 후 증가
		
		System.out.println(z + " " + result);
		
	
	}

}
