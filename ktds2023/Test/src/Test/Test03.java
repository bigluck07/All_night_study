package Test;
import java.util.Collection;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test03 {
	
	public static void main(String[] args) {
		
		char ch = 'z';
		boolean b = Character.isAlphabetic(ch);//if(ch.matches("[a-zA-Z]*$"))true:false;
//		boolean b = 
		System.out.println(b);
//		System.out.println(Pattern.matches("^[a-zA-Z]*$", (String)ch)); // matches는 charsequence, string만 받음
		
	}//end main

}//end class
