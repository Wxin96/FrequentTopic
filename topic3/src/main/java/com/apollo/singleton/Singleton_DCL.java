package com.apollo.singleton;

public class Singleton_DCL {
    private static volatile Singleton_DCL uniqueInstance;

    private Singleton_DCL () {

    }

    public static Singleton_DCL getUniqueInstance () {
        if (uniqueInstance == null) {
            synchronized (Singleton_DCL.class) {
                if (uniqueInstance == null) uniqueInstance = new Singleton_DCL();
            }
        }
        return uniqueInstance;
    }
}
