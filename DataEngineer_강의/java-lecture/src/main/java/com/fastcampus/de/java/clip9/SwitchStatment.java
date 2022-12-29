package com.fastcampus.de.java.clip9;

public class SwitchStatment {
    enum Score { // 클래스로 받기 때문에 다른 입력이 들어오면 알 수 있다
        A, B, C, D, E; // 대문자로만 하는게 규칙
    }
    public static void main(String[] args) {
        Score input = Score.A;
        switch (input) {
            case A: System.out.println("score : 4.0");
                break;
            case B: System.out.println("score : 3.0");
                break;
            case C: System.out.println("score : 2.0");
                break;
            default: System.out.println("out of scope");
                break;
        }

        char score = 'A';
        switch (score){
            case 'A' :
                System.out.println("score : 4.0");
                break; // 없으면 밑에까지 확인해서 디폴트를 실행시킴
            case 'B' :
                System.out.println("score : 3.0");
                break;
            case 'C':
                System.out.println("score : 2.0");
                break;
            default:
                System.out.println("out of scope");
                break;
        }

    }
}
