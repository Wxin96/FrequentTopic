package com.apollo.test5;

import java.util.Scanner;

public class Main11 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] characterCount = new int[26];

        StringBuilder sb = new StringBuilder();

        while (sc.hasNext()) {
            String next = sc.next();
            sb.append(next);
        }

        for (int i = 0; i < sb.length(); i++) {
            characterCount[sb.charAt(i) - 'a']++;
        }

        char maxChar = 'a';
        int maxVal = 0;

        for (int i = 0; i < characterCount.length; i++) {

            if (characterCount[i] > maxVal) {
                maxChar = (char) ('a' + i);
                maxVal = characterCount[i];
            }

        }

        System.out.println(maxChar);

    }

}
