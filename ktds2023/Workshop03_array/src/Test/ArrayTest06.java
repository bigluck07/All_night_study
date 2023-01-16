package Test;
import java.util.Arrays;

public class ArrayTest06 {

	public static void main(String[] args) {
//		다음 배열의 내용을 실행 결과와 같이 출력 되도록 프로그램을 작성 하시오.
		int[][] arr2 = {
				{20, 30, 10},
				{50, 40, 60},
				{80, 80, 90}
				};
		for (int i = 2; i >= 0; i--) {
			for (int j = 2; j >= 0; j--) {
				System.out.print(arr2[i][j]+" ");
			}
		}
	}//end main

}//end class
