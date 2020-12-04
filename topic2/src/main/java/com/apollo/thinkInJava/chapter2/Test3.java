package com.apollo.thinkInJava.chapter2;

// TIJ4 Chapter Object, Exericise 3, page 90
// object/ATNTest.java
// Find the code fragments involving ATypeName and turn them into a program
// that compiles and runs.

public class Test3 {
    public static void main(String[] args) {
        class ATypeName {
            int i;
            double d;
            boolean b;

            void show() {
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }
        ATypeName a = new ATypeName();
        a.i = 3;
        a.d = 2.71828;
        a.b = false;
        a.show();

        int[][] matrix = new int[0][0];
        System.out.println(matrix.length);
        System.out.println(matrix[0]);
    }
}
