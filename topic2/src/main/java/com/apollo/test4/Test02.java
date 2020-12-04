package com.apollo.test4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Test02 {
    public static void main(String[] args) {
        Test02 test02 = (Test02) null;
        System.out.println(test02);
        test02.doSomething();
        Boolean b = true;
        Integer.compare(1, 23);
        int x = 0;
        System.out.println(x);

        System.out.println(Integer.class.isPrimitive());
        int asInt = Arrays.stream(new int[]{}).min().getAsInt();
        Map<Integer, Integer> map = new HashMap<>();
        map.get(1);
    }

    private static void doSomething() {
        System.out.println("doSomething!");
    }
}

class A {
}
