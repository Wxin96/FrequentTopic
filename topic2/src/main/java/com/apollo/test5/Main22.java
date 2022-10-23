package com.apollo.test5;

import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int size = m * n;

        int[] matrix = new int[size];

        for (int i = 0; i < size; i++) {
            matrix[i] = sc.nextInt();
        }
        boolean flag = true;

        for (int i = 0; i < size; i++) {
            if (matrix[i] != sc.nextInt()) {
                flag = false;
            }
        }
        System.out.println(flag ? "Yes" : "No");
    }
}
