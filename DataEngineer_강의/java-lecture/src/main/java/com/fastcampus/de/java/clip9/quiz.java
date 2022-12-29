package com.fastcampus.de.java.clip9;

import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score <= 100 && score > 90) {
            System.out.println("A");
        } else if (90 >= score && score > 80) {
            System.out.println("B");
        } else if (80 >= score && score > 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }

//        if (score <= 100 && score > 90){
//            System.out.println("A등급입니다.");
//        }
//        else if(score <=90 && score > 80){
//            System.out.println("B등급입니다.");
//        }
//        else if(score <=80 && score > 70){
//            System.out.println("C등급입니다.");
//        }
//        else{
//            System.out.println("F등급입니다.");
//        }

    }
}
