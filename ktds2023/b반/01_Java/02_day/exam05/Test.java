package exam05;

public class Test {

	static int num;
	int size;
	
	public void a() {
		System.out.println(num);
		System.out.println(size);
		System.out.println(this);
		
	}
	public static void b() {
		System.out.println(num);
//		System.out.println(size); 사용불가
//		System.out.println(this); 사용불가
	}
	
}
