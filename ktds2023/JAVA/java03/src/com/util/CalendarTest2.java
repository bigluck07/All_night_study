package com.util;

import java.util.Random;

public class CalendarTest2 {

	public static void main(String[] args) {
		// 난수값 반환
		Random r = new Random();
		
		boolean x = r.nextBoolean();
		double x2 = r.nextDouble(); // 0.0 ~ 1.0
		int x3 = r.nextInt(); //  매우작은수 ~ 2^32
		int x4 = r.nextInt(4); //  0 ~ n미만
		
		
		
		
		
		System.out.println(x);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		

	}

}
