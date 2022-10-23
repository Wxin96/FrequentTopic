package com.apollo.test5;

import java.util.Scanner;

public class Main14 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(String.format("%d %d", num1/num2, num1%num2));
    }

}
