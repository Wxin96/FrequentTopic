package com.apollo.test5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main16 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        double num2 = sc.nextDouble();

        double num3 = sc.nextDouble();


        BigDecimal completed = (new BigDecimal(num3 / num2)).setScale(0, RoundingMode.CEILING);
        int completedNum = completed.intValue();


        System.out.println(Math.max(num1 - completedNum, 0));
    }

}
