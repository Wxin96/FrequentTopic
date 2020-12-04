package com.apollo.test4;

import java.util.concurrent.TimeUnit;

public class Main08 {
    private static final Object object1 = new Object();
    private static final Object object2 = new Object();

    public static void main(String[] args) {
        Runnable runnable1 = () -> {
            synchronized (object1) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    synchronized (object2) {
                        System.out.println("1");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable runnable2 = () -> {
            synchronized (object2) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    synchronized (object1) {
                        System.out.println("2");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(runnable1).start();
        new Thread(runnable2).start();

    }

}
