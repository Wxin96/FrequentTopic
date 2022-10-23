package com.apollo.test5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main15 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();

        double num2 = sc.nextDouble();
        num2 /= 100;

        double num = num1 / (num2 * num2);

        System.out.println((new BigDecimal(num)).setScale(2, RoundingMode.HALF_UP));
    }

}
