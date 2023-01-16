package com.lambda;

import java.security.PublicKey;

public class TestMain {

	public static void main(String[] args) {
		
		// 익명클래스
		Flyer f = new Flyer() {
			@Override
			public void fly() {
				System.out.println("fly1");
			}
		}; //anony end
		
		f.fly();

		// 람다 표현식
		Flyer f2 = ()->{System.out.println("람다 fly2");}; //lambda end
		f2.fly();
		
		// #####################################
		Flyer2 k = new Flyer2() { //익명클래스
			@Override
			public void fly(int x, String x2) {
				System.out.println("Flyer2"+x+"\t"+x2);
			}
		};
	
		// 람다표현식
		Flyer2 k2 = (x,x2)->{System.out.println("Flyer2"+x+"\t"+x2);};
		k2.fly(10, "hello");
		
		
		// #####################################
		Flyer3 z = new Flyer3() {
			
			@Override
			public int fly(int x, int x2) {
				return x+x2;
			}
		};
		
		// 람다표현식3
		Flyer3 z2 = (x, x2) -> {return x+x2;};
		Flyer3 z3 = (x, x2) -> x+x2;
		System.out.println(z3.fly(10,20));
		
	}
}
