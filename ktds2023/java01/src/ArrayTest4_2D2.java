import java.util.Collection;
import java.util.Scanner;

public class ArrayTest4_2D2 {

	public static void main(String[] args) {
		
		//2. 리터널
		int [][] n = {{1,2,3},{4,5},{6}};
		System.out.println("행: "+n.length);
		System.out.println("1행열: "+n[0].length);
		System.out.println("2행열: "+n[1].length);
		System.out.println("3행열: "+n[2].length);
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.println("["+i+"]["+j+"]=" + n[i][j]);
			} //end for2
		}//end for1
		
		
		//3. 혼합
		int [][] n2 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("행: "+n2.length);
		System.out.println("1행열: "+n2[0].length);
		System.out.println("2행열: "+n2[1].length);
		System.out.println("3행열: "+n2[2].length);
		
		for (int i = 0; i < n2.length; i++) {
			for (int j = 0; j < n2[i].length; j++) {
				System.out.println("["+i+"]["+j+"]=" + n2[i][j]);
			} //end for2
		}//end for1
		
	}//end main

}//end class
