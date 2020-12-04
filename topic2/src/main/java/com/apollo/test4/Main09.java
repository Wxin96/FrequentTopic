package com.apollo.test4;

import java.util.*;

/**
 * 2020/10/26
 * Java编程思想 - 作用域
 */
public class Main09 {
    public static void main(String[] args) {
        {
            int x = 12;
            {
                // int x = 1;
            }
        }
        int y = 1;
        System.out.println("y = " + y);
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));

        int c = 6 * -3;
        int d = + 2;

        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
        System.out.println(n1.equals(n2));

        System.out.println(1.1f == 1.1f);

        Random random = new Random(47);
        System.out.println(random.nextBoolean() ? "正面": "反面");
        char c1 = 0xffff;
        System.out.println(Math.E);
        float f4 = 1e-43f;
        int a = 0b1111111111111111111111;
        System.out.println(a);
        int a2 = 3;
        int a3 = Integer.MIN_VALUE;
        System.out.println(Integer.toBinaryString(a3 >> 1));
        short num1 = 4;
        int a4 = 1 << 0b111000010;
        System.out.println(a4);
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE << 1));
        System.out.println(Integer.MAX_VALUE << 1);
        int a5 = 5 & 1;
        boolean flag = true & true;
        // Arrays.copyOf();
        // System.arraycopy();
        String.valueOf('a');
        List<Integer> list = new ArrayList<>();
        // List<Integer> list = new ArrayList<>(new int[] {});
        List<int[]> list1 = new ArrayList<>();

        list1.toArray(new int[3][2]);

        Deque<Integer> stack = new ArrayDeque<>();
        stack.pollLast();
        stack.push(2);

    }

}
