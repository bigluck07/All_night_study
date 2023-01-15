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
		
//		int avg = sum/arr.length;
		int avg = (int)Arrays.stream(arr).average().orElse(0);
//		int avg2 = (int)Arrays.stream(arr).average();
		System.out.println("avg="+avg);
	}

}
