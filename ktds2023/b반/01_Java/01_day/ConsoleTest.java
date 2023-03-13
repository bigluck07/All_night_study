
public class ConsoleTest {

	public static void main(String[] x) {
	
		//콘솔에 출력
	
		//1. println ==>  new line 생성
		System.out.println("Hello");
		System.out.println("Hello2");
		System.out.println();
		
		//2. print  ==> new line 생성 안됨
		System.out.print("Hello");
		System.out.print("Hello2");
		System.out.println();
		
		//3. printf  ==> 포맷 지정시 사용
		// printf( "포맷   " , 값, 값1, ...    )
		System.out.printf("이름:%s 나이:%d 키:%f 성별:%c 결혼여부:%b" ,
				   "홍길동", 20, 183.25632, '남', true);
		
		

	}

}
