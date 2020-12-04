package com.apollo.test3;

public class ConstructTest {

    public ConstructTest(int a) {
    }
}

class SubClass03 extends ConstructTest {
    public SubClass03() {
        super(2);
    }
}
