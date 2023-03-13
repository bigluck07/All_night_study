package com.pet3;


interface A{
	public static final int NUM = 10;
	int size = 20; // 변수처럼 보이지만 public static final 자동으로 지정된 상수
	public abstract void a();
	void b(); // 접근지정자가 default처럼 보이지만 public abstract  자동으로 지정된 추상메서드
	public static void c() {}
	public default void d() {}
}
interface B{}
interface C extends A,B{} // 인터페이스끼리 다중 상속
class AImpl implements A, B{ //다중 구현
	@Override
	public void a() {}
	@Override
	public void b() {}
}
public class TestPet2 {
	public static void main(String[] args) {
		 A a = new AImpl();
		 System.out.println(a.NUM);
		 a.a();
		 a.b();
		 A.c(); // static 메서드는 인터페이스명으로 접근
		 a.d();
	}
}
