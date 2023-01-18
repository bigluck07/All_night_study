package Test;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest06 {

	public static void main(String[] args) {
//		Scanner 클래스를 사용하여 키보드로 키(height)값을 입력 받아서 
//		최대값을 구하는 코드 작 업. 입력 받은 사람 수만큼 배열을 생성하여 사용한다.
		System.out.println("키의 최댓값을 구합니다.");
		Scanner scner = new Scanner(System.in);
		int num = scner.nextInt();
		System.out.println("사람 수: "+num);
		int max_high = 0;
		for (int i = 1; i < num+1; i++) {
			int high = scner.nextInt();
			System.out.println("사람 "+i+": "+high);
			if (max_high < high) max_high=high;
		}
		System.out.println("최댓값은 "+max_high+"입니다.");
		
	}//end main

}//end class
