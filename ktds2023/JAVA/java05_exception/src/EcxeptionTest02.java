
public class EcxeptionTest02 {

	public static void main(String[] args) {

		System.out.println("1");
		System.out.println("2");
		
		try {
			int num = 0 ;
			int result = 10/num;
			System.out.println("결과값: "+result);
		} catch (ArithmeticException e) {
			// 예외 발생 이유를 친절히 설명하는 것 = Best 예외처리방법
			System.out.println("예외발생: 0으로 나눌 수 없음");
		}
		System.out.println("3");
		System.out.println("end");

	}

}
