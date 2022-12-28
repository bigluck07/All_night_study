package com.fastcampus.de.java.clip7;

import java.math.BigDecimal;

public class Numbers {
    public static void main(String[] args) {
        short s = 1;
        System.out.println(s);

        int a = 3;
        System.out.println(a);

        long b = 1234567L;
        System.out.println(b);

        float x = 5.5F;
        System.out.println(x);

        double d = 9.123123D; // D 삭제해도 기본값이라 괜찮
        System.out.println(d);

        // BigDecimal 로 더 긴 소수 입력 가능

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        System.out.println("======== default ========");
        Defaults defaults = new Defaults();
        System.out.println(defaults.shortDefaults);
        System.out.println(defaults.intDefaults);
        System.out.println(defaults.longDefaults);
        System.out.println(defaults.floatDefaults);
        System.out.println(defaults.doubleDefaults);

    }

    static class Defaults {
        short shortDefaults;
        int intDefaults;
        long longDefaults;
        float floatDefaults;
        double doubleDefaults;
    }
}
