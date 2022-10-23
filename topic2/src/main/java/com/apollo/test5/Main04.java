package com.apollo.test5;


import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        long s, t;
        Scanner scanner = new Scanner(System.in);

        s = scanner.nextLong();

        while (s > 0) {
            if (s % 2 == 0) {
                s = s / 10;
            } else {
                t = s % 10;
                System.out.print(t);
                s = s / 10;
            }
        }
    }
}
