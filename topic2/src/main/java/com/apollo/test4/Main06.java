package com.apollo.test4;

public class Main06 {
    public static void main(String[] args) {
        System.out.println(solve(999));
        System.out.println(1e-3);
        String str = "123";
        System.out.println(str.indexOf("23"));
        int a = (int)2e2;
    }

    public static double solve(int n) {
        double x  = n;
        while ((Math.pow(x, 3) - n) > 1e-3) {
            x = (2*x + n/x/x)/3;
        }
        return x;
    }
}
