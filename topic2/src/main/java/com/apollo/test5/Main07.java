package com.apollo.test5;

import java.util.Scanner;

public class Main07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numStr = scanner.next();

        char c = numStr.charAt(numStr.length() - 1);

        int i = (c - '0') % 2;

        System.out.println(i == 0 ? 1 : -1);
    }


}
