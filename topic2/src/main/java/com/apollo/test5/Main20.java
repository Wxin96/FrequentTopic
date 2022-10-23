package com.apollo.test5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main20 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        Set<Integer> set = new HashSet<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            int inputNum = sc.nextInt();
            if (!set.contains(inputNum)) {
                set.add(inputNum);
                sb.append(inputNum + " ");
            }
        }

        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }

}
