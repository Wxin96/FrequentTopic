package com.apollo.singleton;

public class Singleton_StaticInnerClass {

    private static class Singleton {
        private static final Singleton_StaticInnerClass INSTANCE = new Singleton_StaticInnerClass();
    }

    public static Singleton_StaticInnerClass getInstance() {
        return Singleton.INSTANCE;
    }
}
