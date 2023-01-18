package Test;
import java.util.Collection;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Test13 {

	public static void main(String[] args) {
			
		String mesg = "     홍길동/이순신/유관순     ";
	
	    System.out.println("문자열 길이: "+mesg.length());
	    System.out.println("공백제거: "+mesg.strip());
	    System.out.println("공백제거된 문자열 길이: "+mesg.strip().strip().length());
	
	    String[] res1 = mesg.strip().split("/");
	    System.out.println("부분열: "+res1[0]+'/'+res1[1]);
	    System.out.println("홍길동 출력 : "+res1[0]);
	    System.out.println("유관순 출력 : "+res1[2]);

	}//end main

}//end class