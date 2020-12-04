package com.apollo.test4;

public class BooleanSizeTest {
    public static void main(String[] args) {
        System.gc();//Request garbage collection so that any arbitrary objects are removed.
        long a1, a2, a3;//The variables to hold the free memory at different times.
        Runtime r = Runtime.getRuntime();//Get the runtime.
        System.gc();//Request garbage collection so that any arbitrary objects are removed.
        a1 = r.freeMemory();//The initial amount of free memory in bytes.
        boolean[] lotsOfBools = new boolean[10_000_000];//Declare a boolean array.
        a2 = r.freeMemory();
        System.gc();//Request garbage collection.
        a3 = r.freeMemory();// Amount of free memory after creating 10,000,000 booleans.
        System.out.println("a1 = "+a1+", a2 = "+a2+", a3 = "+a3);
        double bSize = (double)(a1-a2)/10_000_000;/*Calculate the size of a boolean
        using the difference of a1 and a2*/
        System.out.println("boolean = "+bSize);
    }
}
