package com.test03;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.test02.Student;

public class TestMain03 {

	public static void main(String[] args) {

//		주어진 String 데이터를 “,”로 구분하여 5개의 실수 데이터를 추출하고 합과 평균을 구한다. ( StringTokenizer 사용 )
//		단, String 문자열의 모든 실수 데이터를 List에 저장하고 계산한다.
		
		String str = "1.22,4.12,5.93,8.71,9.34";
		StringTokenizer st = new StringTokenizer(str, ",");
		//StringTokenizer 이용하여 List에 저장한다.
		
		List<Double> numlist = new ArrayList<Double>();
		double cnt =  st.countTokens();
		for (int i = 0; i < cnt; i++) {
			numlist.add(Double.parseDouble(st.nextToken()));
		}
		
		//List에 저장된 데이터의 합과 평균을 구한다.
//		System.out.println(numlist);
		double sum2 = numlist.stream().mapToDouble(i -> i).sum();
		System.out.printf("합 계: "+"%.3f",sum2);
		System.out.println("");
		System.out.printf("평 균: "+"%.3f",(sum2/cnt));
	}

}
