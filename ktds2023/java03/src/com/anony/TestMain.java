package com.anony;

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

		
		Flyer f2 = new Flyer() {
			
			@Override
			public void fly() {
				System.out.println("fly2");	
			}
		};
		
		f2.fly();
	}

}
