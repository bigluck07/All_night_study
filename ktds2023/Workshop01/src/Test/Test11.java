package Test;
import java.util.Collection;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Test11 {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println( "주소를 입력하시오.");
		String add = scn.nextLine();
		 
		String[] add_sp = add.split(" ", 3);

        System.out.println("문자 갯수(공백포함): "+add.length());
        System.out.println("단어 갯수: "+add_sp.length);
// 경기도 용인시 수지구
	}//end main

}//end class