package com.apollo.factory.abstractFactory;

import com.apollo.factory.AbstractProductA;
import com.apollo.factory.AbstractProductB;

public abstract class AbstractFactory {
    abstract AbstractProductA createProductA();
    abstract AbstractProductB createProductB();
}
