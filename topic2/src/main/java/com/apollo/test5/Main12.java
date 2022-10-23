package com.apollo.test5;

import java.util.Scanner;

public class Main12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(String.format("%d %d", Math.min(x, y), Math.max(0, x + y -n)));

    }

}
