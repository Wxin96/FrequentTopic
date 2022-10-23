package com.apollo.test5;

import java.util.Scanner;

public class Main19 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] strs = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = strs.length - 1; i >= 0; i--) {
            sb.append(strs[i] + " ");
        }

        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }

}
