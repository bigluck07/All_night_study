
public class VariableTest2 {
	
	public static void main(String[] args) {
		
		{
			int age = 10; // main 안에서 가장 가까운 블럭에서 변수명이 겹치면 안됨
			// 얘는 여기서만 사용가능
			System.out.println(age);
		}
		
//		System.out.println(age); // 지역변수라 사용 불가
		
		int age = 20;
		System.out.println(age);
		
		int x;
		if(true) {
			x = 10;
		}
		System.out.println(x);
		
	}
	
	
}
