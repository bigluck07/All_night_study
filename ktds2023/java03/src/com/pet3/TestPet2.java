package com.pet3;

interface A { // 가질 수 있는 요소
	public static final int NUM = 10;
	int size = 20; // 변수같지만 public static final 상수임
	public abstract void a();
	void b(); // 접근지정자자 default같지만 public abstract
	public static void c() {};
	public default void d() {};
}

interface B {}
interface C extends A,B{} // 인터페이스끼리 다중 상속

class AImpl implements A, B{ // 다중구현
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
