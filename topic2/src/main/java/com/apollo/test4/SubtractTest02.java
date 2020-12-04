package com.apollo.test4;

public class SubtractTest02 {

    public static void main(String[] args) {
        System.out.println(subtract("111000", "111111"));
    }

    // num1 - num2
    public static String subtract(String num1, String num2) {
        if (num1 == null || num2==null) return num1 == null ? "-" + num2 : num1;
        // 1.转字符反转
        char[] numA = new StringBuilder(num1).reverse().toString().toCharArray();
        char[] numB = new StringBuilder(num2).reverse().toString().toCharArray();
        int lenA = numA.length;
        int lenB = numB.length;
        // 2.找最长
        int len = Math.max(lenA, lenB);
        // 3.正负号判断
        char sign = '+';
        if (lenA < lenB) {
            sign = '-';
        } else if (lenA == lenB) {
            int idx = 0;
            while (lenA > idx && numA[idx] == numB[idx]) idx++;
            if (idx == lenA) return "0";
            if (numA[idx] < numB[idx]) sign = '-';
        }
        // 4.数组存结果
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            int a = (i < lenA) ? numA[i] - '0' : 0;
            int b = (i < lenB) ? numB[i] - '0' : 0;
            if (sign == '+') res[i] = a - b;
            else res[i] = b - a;
        }
        // 5.移位
        for (int i = 0; i < len; i++) {
            if (res[i] < 0) {
                res[i] += 10;
                res[i + 1] -= 1;
            }
        }
        // 6.最后
        StringBuilder str = new StringBuilder();
        if (sign == '-') str.append(sign);
        boolean flag = true;
        for (int i = len - 1; i >= 0; i--) {
            if (res[i] == 0 && flag) continue;
            else {
                flag = false;
                str.append(res[i]);
            }
        }
        return str.toString();
    }

}
