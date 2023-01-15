package exam05;

// 분석단계의 고양이객체
public class Test {
	
	static int num; // 누적용
	int size;       // new마다 size 정보 저장

	public void a() { // 인스턴스 변수를 사용하려고..?
		System.out.println(num);
		System.out.println(size);
		System.out.println(this);
	}
	public static void b() {// 객체생성 없이 쓰려고
		System.out.println(num);
//		System.out.println(size); // 사용불가
//		System.out.println(this); // b에서 못쓰는 이유 = b가 먼저 만들어 져서
		
	}

}
