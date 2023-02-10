package com.lambda;

public class TestMain {

	public static void main(String[] args) {

		// 익명 클래스
		Flyer f = new Flyer() {
			@Override
			public void fly() {
				System.out.println("fly");
			}
		}; //end
		f.fly();
		// 람다 표현식
		Flyer f2 = ()->{System.out.println("람다 표현식 fly");};
		f2.fly();
		//############################################################
		Flyer2 k = new Flyer2() {
			@Override
			public void fly(int x, String x2) {
				System.out.println("Flyer2"+ x + "\t" + x2);
			}
		};
		//람다표현식
		Flyer2 k2 = (x , x2)->{System.out.println("Flyer2"+ x + "\t" + x2);};
		k2.fly(10, "hello");
		//############################################################
		Flyer3 z = new Flyer3() {
			@Override
			public int fly(int x, int x2) {
				return x+x2;
			}
		};
		Flyer3 z2 = ( x, x2)->{return x+x2;};
		Flyer3 z3 = ( x, x2)->x+x2; //권장
		System.out.println(z3.fly(10, 20));
		
		
		
		
		
	}

}
