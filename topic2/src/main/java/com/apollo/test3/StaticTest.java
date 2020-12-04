package com.apollo.test3;

/**
 *  static不可以被重写，可以被继承
 */
public class StaticTest {
    public static void main(String[] args) {
        SuperClass subClass = new SubClass();
        subClass.a();
        subClass.b();
    }
}

class SuperClass {

    // static method
    public static void a() {
        System.out.println("SuperClass b");
    }

    // not static method
    public void b() {
        System.out.println("SuperClass b");
    }
}

class SubClass extends SuperClass {

    public static void a() {
        System.out.println("SubClass a");
    }

    @Override
    public void b() {
        System.out.println("SubClass b");
    }

}

class SubClass02 extends SuperClass {
    @Override
    public void b() {
        SubClass02.a();
    }
}


