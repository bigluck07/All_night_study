package com.fastcampus.de.java.clip8;

public class Arithmetic {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println(num1+num2); //15
        System.out.println(num1-num2); //5
        System.out.println(num2-num1); //-5
        System.out.println(num1*num2); //50
        System.out.println(num1/num2); //2
        System.out.println(num2/num1); //0 > 몫만 나옴, 0으로 나눌경우 런타임에러남
        System.out.println(num2%num1); //5
    }
}
