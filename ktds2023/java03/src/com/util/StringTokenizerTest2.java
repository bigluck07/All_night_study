package com.util;

import java.util.StringTokenizer;

public class StringTokenizerTest2 {

	public static void main(String[] args) {
		
		String mesg = "홍길동/이순신/유관순";
		
		StringTokenizer st = new StringTokenizer(mesg, "/");
		
		// 한개씩 출력 -> 남았는지 모름
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		
//		System.out.println(st.nextToken()); // 길이 넘게 추출하면 에러
		// ######################################
		
		st.hasMoreTokens(); // 가지고 올게 있으면 true, 없으면 false
		
		while (st.hasMoreTokens()) { // for each와 유사
			String s = st.nextToken();
			System.out.println(s);
		}
	}

}
