
public class EcxeptionTest03 {

	public static void main(String[] args) {

		System.out.println("1");
		System.out.println("2");
		
		try {
			int num = 0;
			int result = 10/num;
			System.out.println("결과값: "+result);
			
			// 다른 문장이 있다고 가정
			// ...
		} catch (ArithmeticException e) {
			// 예외 발생 이유를 친절히 설명하는 것 = Best 예외처리방법
			System.out.println("예외발생: 0으로 나눌 수 없음");
		} catch (NullPointerException e) {
			System.out.println("예외발생: Null");
		} catch (Exception e) {
			System.out.println("예외발생!! 예외 종류 알 수 없음");
		} finally { // 예외발생 상관없이 실행
			System.out.println("finally: 예외 발생 여부와 상관없이 실행");
		}
		System.out.println("3");
		System.out.println("end");

	}

}
