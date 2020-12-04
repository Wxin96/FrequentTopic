package com.apollo.bigdata;

import java.math.BigDecimal;

/**
 *
 */
public class BigDecimalTest {

    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("3.5");
        BigDecimal bigDecimal2 = new BigDecimal("3");
        System.out.println(bigDecimal.add(bigDecimal2));

    }

}
