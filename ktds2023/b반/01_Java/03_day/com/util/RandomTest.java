package com.util;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// 난수값 반환
		Random r = new Random();
		
		boolean x = r.nextBoolean();
		double x2 = r.nextDouble(); // between 0.0 and 1.0 
		int x3 = r.nextInt(); // 매운작은수 ~ 매우큰수
		int x4 = r.nextInt(3); // 0~2 범위지정  between 0 (inclusive) and the specified value (exclusive) 
		System.out.println(x);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
	}

}
