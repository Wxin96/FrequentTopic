package com.apollo.test;

public class Test1 {

    public void test() {

    }
}

class Singleton {

    private static volatile Singleton instance;

    private Singleton () {

    }

    public static Singleton getInstance() {
        if (instance != null) {
            synchronized (Singleton.class){
                if (instance != null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

}
