package com.util;

import java.util.Calendar;
import java.util.Date;


public class RandomTest {

	public static void main(String[] args) {
		
		// Calendar 생성 방법 ( new 이용 안함 )
		Calendar cal = Calendar.getInstance(); // static메소드임 -> 클래스명으로 접근해서
		
		System.out.println("연: "+cal.get(Calendar.YEAR));
		System.out.println("월: "+(cal.get(Calendar.MONTH)+1));
		System.out.println("일: "+cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("시: "+cal.get(Calendar.HOUR));
		System.out.println("분: "+cal.get(Calendar.MINUTE));
		System.out.println("초: "+cal.get(Calendar.SECOND));
		System.out.println("");

		// 특정날짜 서정
		cal.set(2023, 11, 24);
		System.out.println("연: "+cal.get(Calendar.YEAR));
		System.out.println("월: "+(cal.get(Calendar.MONTH)+1));
		System.out.println("일: "+cal.get(Calendar.DAY_OF_MONTH));
		
		// java.util.Date
		Date d = new Date(); // 거의 대부분 기능이 사라질 수 있어서 사용 잘 안함
		System.out.println(d); // d.toString()
	}

}
