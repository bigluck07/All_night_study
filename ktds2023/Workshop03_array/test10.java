package test01;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println( "주소를 입력하시오.");
		String add = scn.nextLine();
		 
		String[] add_sp = add.split(" ", 3);

        System.out.println("도명: "+add_sp[0]);
        System.out.println("시명: "+add_sp[1]);
        System.out.println("구명: "+add_sp[2]);

	}
}