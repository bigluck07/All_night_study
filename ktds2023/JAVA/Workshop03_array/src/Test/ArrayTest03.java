package Test;
import java.util.Arrays;

public class ArrayTest03 {

	public static void main(String[] args) {
//		2차원 배열 arr2에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 작성 하시오.
		int[][] arr2 = {
			{ 5, 5, 5, 5, 5},
			{10,10,10,10,10},
			{20,20,20,20,20},
			{30,30,30,30,30}
		};
		int ans = 0;
		int cnt = 0;
		for (int[] arr : arr2) {
			for (int i = 0; i < arr.length; i++) {
				ans+=arr[i];
				cnt+=1;
			}
		}
		System.out.println("total="+ans);
		System.out.println("average="+(double)ans/(double)cnt);
		
	}//end main
}//end class
