package com.apollo.test2;

public class DailyTest {
    public static void main(String[] args) {
        Integer a = 200;
        Integer b = 200;
        System.out.println(a == b);

        String str = "123123";
        String newStr = str.replace("1", "4");
        String newStr2 = str.replaceAll("1", "4");
        System.out.println(newStr);
    }
}
