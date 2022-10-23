package com.apollo.test5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main17 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();

        String num2 = sc.next();

        String num3 = sc.next();

        String num4 = sc.next();

        String date = num2 + num3;

        BigDecimal num = new BigDecimal(num1);

        if ("1111".equals(date)) {
            num = num.multiply(new BigDecimal("0.7"));
        } else if ("1212".equals(date)){
            num = num.multiply(new BigDecimal("0.8"));
        }

        if ("1".equals(num4)) {
            num = num.subtract(new BigDecimal(50));
        }

        num = BigDecimal.ZERO.compareTo(num) >= 0 ? BigDecimal.ZERO : num;

        System.out.println(num.setScale(2, RoundingMode.HALF_UP).toPlainString());
    }

}
