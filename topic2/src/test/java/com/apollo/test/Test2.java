package com.apollo.test;


import org.junit.Test;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

public class Test2 {
    @Test
    public void test01() {
        Stack<Character> stack = new Stack<>();
        stack.contains('a');
        StringBuilder str = new StringBuilder();
        str.insert(1, 'a');
    }

    @Test
    public void test02() {
        System.out.println("123");
        long s, t;
        Scanner scanner = new Scanner(System.in);

        s = scanner.nextLong();

        while (s > 0) {
            if (s % 2 == 0) {
                s = s / 10;
            } else {
                t = s % 10;
                System.out.println(t);
                s = s / 10;
            }
        }

    }


    @Test
    public void testJavaJob() {
        long i = 0;
        while (true) {
            System.out.println(i++);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
