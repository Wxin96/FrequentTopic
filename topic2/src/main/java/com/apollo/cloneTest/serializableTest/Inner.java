package com.apollo.cloneTest.serializableTest;

import java.io.Serializable;

public class Inner implements Serializable {
    private static final long serialVersionUID = 872390113109L; //最好是显式声明ID
    private String name;

    public Inner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Inner的name值为：" + name;
    }
}
