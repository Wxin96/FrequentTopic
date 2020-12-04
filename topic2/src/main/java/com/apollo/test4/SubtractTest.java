package com.apollo.test4;

public class SubtractTest {

    public static void main(String[] args) {
        String num1 = "4124";
        String num2 = "4123";
        // System.out.println(num1.compareTo(num2));
        //
        // System.out.println(-7%3);
        System.out.println(subtract(num1, num2));

        System.err.println("1234");

        // LinkedList<Integer> list = new LinkedList<>();
        // list.add(1);
        // list.remove(0);
    }

    // num1 - num2
    public static String subtract(String num1, String num2) {
        if (num1 == null || num2 == null) return num1 == null ? "-" + num2 : num1;
        boolean flag;
        String bigNum;
        String smallNum;
        if (num1.length() > num2.length() || num1.length() == num2.length() && num1.compareTo(num2) >= 0) {
            bigNum = num1;
            smallNum = num2;
            flag = true;
        } else {
            bigNum = num2;
            smallNum = num1;
            flag = false;
        }
        StringBuilder str = new StringBuilder();
        int len1 = bigNum.length(), len2 = smallNum.length();
        int pointer1 = len1 - 1, pointer2 = len2 - 1;
        int c = 0;
        while (pointer1 >= 0 || pointer2 >= 0) {
            int a = (pointer1 >= 0) ? bigNum.charAt(pointer1--) - '0' : 0;
            int b = (pointer2 >= 0) ? smallNum.charAt(pointer2--) - '0' : 0;
            int val = a - b - c;
            if (val < 0) {
                val = 10 + val;
                c = 1;
            } else {
                c = 0;
            }
            str.append(val);
        }
        while (str.charAt(str.length() - 1) == '0') {
            str.deleteCharAt(str.length() - 1);
        }
        return (flag ? "" : "-") + str.reverse().toString();
    }

}
