package com.fastcampus.de.java.clip8;

public class Assignment {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println(num1);
        System.out.println(num2);

//        num1 += num2;
//        num1-=num2
//        num1*=num2;
//        num1/=num2;
        num1 %= num2;
        System.out.println(num1);
        System.out.println(num2);
    }
}
