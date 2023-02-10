package com.util;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	public static void main(String[] args) {
	
		// Calendar 생성 방법 ( new 이용 안함 )
		Calendar cal = Calendar.getInstance();
		
		System.out.println("년:" + cal.get(Calendar.YEAR));
		System.out.println("월:" + (cal.get(Calendar.MONTH)+1));
		System.out.println("일:" + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("시간:" + cal.get(Calendar.HOUR));
		System.out.println("분:" + cal.get(Calendar.MINUTE));
		System.out.println("초:" + cal.get(Calendar.SECOND));
		
		//특정날짜 설정
		cal.set(2023,11,24);
		System.out.println("년:" + cal.get(Calendar.YEAR));
		System.out.println("월:" + (cal.get(Calendar.MONTH)+1));
		System.out.println("일:" + cal.get(Calendar.DAY_OF_MONTH));
		
		//java.util.Date
		Date d = new Date();
		System.out.println(d); // d.toString()
		
	}

}
