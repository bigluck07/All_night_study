package test01;

import java.util.Scanner;
import java.util.stream.IntStream;

public class test14 {

	public static void main(String[] args) {
		
		String mesg = "100/200";
		String[] res1 = mesg.split("/");
		
		int[] nums = {Integer.parseInt(res1[0]), Integer.parseInt(res1[1])};
		
        System.out.println("정수값 합계: "+IntStream.of(nums).sum());
        System.out.println("정수값 평균: "+(int)IntStream.of(nums).average().getAsDouble());

	}
}