import java.util.Collection;
import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		// 배열사용
		int [] n;
		n = new int[] {100, 200, 300}; // 크기지정 금지!!!!
		
		System.out.println(n[0]);
		
		for(int idx=0;idx<n.length;idx++) {
			System.out.println(n[idx]);
		}
	}//end main

}//end class
