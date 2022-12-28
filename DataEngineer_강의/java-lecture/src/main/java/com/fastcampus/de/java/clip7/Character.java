package com.fastcampus.de.java.clip7;

public class Character {
    public static void main(String[] args) {
        char alphabet = 'A';
        System.out.println(alphabet);

        Defaults defaults = new Defaults();
        System.out.println(defaults.charDefault); // '\u0000' - null 캐릭터,
    }

    static class Defaults {
        char charDefault;
    }
}
