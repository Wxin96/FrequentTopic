package com.apollo.test5;

import java.util.Scanner;

public class Main08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();

            System.out.println(Math.max(num1, Math.max(num2, num3)));
        }
    }


}
