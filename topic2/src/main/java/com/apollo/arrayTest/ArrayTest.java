package com.apollo.arrayTest;

/**
 *  数组是对象的依据
 *  父类是Object
 */
public class ArrayTest {
    public static void main(String[] args) {
        String[][] nums = {{"1, 2, 3"}};
        System.out.println(nums.getClass().getName());
        System.out.println(nums.getClass().getSuperclass());

        Class<Class[]> aClass = Class[].class;
        System.out.println(aClass.getConstructors().length);
    }
}
