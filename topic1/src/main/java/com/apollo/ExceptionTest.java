package com.apollo;

public class ExceptionTest {
    public static void main(String[] args) {

        try {
            int a = 1/0;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
