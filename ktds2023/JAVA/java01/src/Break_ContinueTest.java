
public class Break_ContinueTest {

	public static void main(String[] args) {
		
		//break : 가장 가까운 반복문 빠져 나올 때 사용
		for (int n=1;n<=5;n++) {
			if(n==3)break;
			System.out.println("hello"+n);
		}//end for
		System.out.println("end");
		
		
		//continue: 반복처리되는 문장 중 임의의 문장을 skip할 때
		for (int n=1;n<=5;n++) {
			System.out.println(n+"회: 100");
			if(n==2)continue;
			System.out.println(n+"회: 200");
			System.out.println(n+"회: 300");
		}//end for
		
		System.out.println("end");
		
	}//end main

}//end class
