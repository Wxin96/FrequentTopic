package com.apollo.bigdata;

import java.math.BigInteger;

/**
 *  BigInteger 测试
 *  底层 int[] mag 数组, 大端模式
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("1111111111111111111111111111111111111111111111111");
        BigInteger sum = bigInteger.add(new BigInteger("2123432"));
        System.out.println(sum);
    }
}
