package com.anony;

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
		
		Flyer f2 = new Flyer() {
			@Override
			public void fly() {
				System.out.println("fly");
			}
		};
		f2.fly();
		
		
		
		
	}

}
