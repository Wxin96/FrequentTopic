package com.apollo;
/**
 *  https://www.cnblogs.com/ningvsban/p/3590722.html
 */

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        // [0, 1.0)
        double random = Math.random();
        System.out.println(random);

        Random random1 = new Random(3);
        Random random2 = new Random(3);
        // [zero, bound)
        System.out.println(random1.nextInt(10));
        System.out.println(random2.nextInt(10));

        System.out.println(random1.nextBoolean());
        System.out.println(random1.nextBoolean());

        double v = random1.nextDouble();

    }
}
