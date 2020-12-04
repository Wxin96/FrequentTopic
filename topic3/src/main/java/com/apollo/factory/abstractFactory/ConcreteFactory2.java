package com.apollo.factory.abstractFactory;

import com.apollo.factory.AbstractProductA;
import com.apollo.factory.AbstractProductB;
import com.apollo.factory.ProductA2;
import com.apollo.factory.ProductB2;

public class ConcreteFactory2 extends AbstractFactory {
    @Override
    AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB2();
    }
}
