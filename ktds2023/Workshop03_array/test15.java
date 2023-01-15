package test01;

import java.util.Scanner;
import java.util.stream.IntStream;

public class test15 {

	public static void main(String[] args) {
		
		System.out.println("1.정수를 입력하세요.");
		
		Scanner scnner = new Scanner(System.in);
		int num1 = scnner.nextInt();

		System.out.println("2.정수를 입력하세요.");
		int num2 = scnner.nextInt();
		
		System.out.println("3.정수를 입력하세요.");
		int num3 = scnner.nextInt();
		
		int max_num = num1;
		if (num2>max_num) max_num = num2;
		if (num3>max_num) max_num = num3;
		
		
		System.out.println("정수 "+num1+"과 정수 "+num2+", 정수 "+num3+" 중에서 최대값: "+max_num);
		
		
	}
}