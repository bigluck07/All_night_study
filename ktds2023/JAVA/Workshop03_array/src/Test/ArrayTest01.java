package Test;
import java.util.Arrays;

public class ArrayTest01 {

	public static void main(String[] args) {
		int [] arr = {10, 20, 30, 40, 50};


//		int sum = 0;
//		for(int i=0; i<arr.length; i++) {
//			sum+=arr[i];
//		}
//		int sum = Arrays.stream(arr).parallel().reduce(0, (a,b)->a+b);
		int sum = Arrays.stream(arr).sum();
		System.out.println("sum="+sum);
		
		
		int avg = (int)sum/arr.length;
//		int avg = (int)Arrays.stream(arr).average().orElse(0);
//		int avg2 = (int)Arrays.stream(arr).average()
			//.getAsDouble(); 얘로 optionaldouble에서 double 값을 꺼내올 수 있음
		// 결과값이 orElse를 통과하면서 double를 반환해서 int변수에 할당 될 수 있음
		System.out.println("avg="+avg);

	}//end main

}//end class
