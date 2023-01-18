package com.test01;

public class TestMain01 {

	public static void main(String[] args) {
		int [][] array = { 
				{ 12, 41, 36 ,56,21 }, 
				{ 82, 10, 12 ,61,45 }, 
				{ 14, 16, 18 ,78 ,65 }, 
				{ 45, 26, 72, 23, 34 }, 
				};
		double total = 0, avg = 0;
		int nums = 0;
		for (int[] arr : array) {
			for (int i = 0; i < arr.length; i++) {
				nums+=1;
				total+=arr[i];
			}
		}
		avg = total/nums;
		System.out.println("합 계 : "+total);
		System.out.println("평 균 : "+avg);
	}

}
