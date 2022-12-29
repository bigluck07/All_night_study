package com.fastcampus.de.java.clip9;

public class TemaryOperator {
    public static void main(String[] args) {
        int a = 10;
        String result = (a < 10)?"under 10.": (a==10)?"is 10.": "over 10.";
        System.out.println(result);
    }
}
