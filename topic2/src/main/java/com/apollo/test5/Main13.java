package com.apollo.test5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main13 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        System.out.println(set.size());
    }

}
