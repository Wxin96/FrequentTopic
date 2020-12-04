package com.apollo.factory.abstractFactory;

import com.apollo.factory.AbstractProductA;
import com.apollo.factory.AbstractProductB;
import com.apollo.factory.ProductA1;
import com.apollo.factory.ProductB1;

public class ConcreteFactory1 extends AbstractFactory {
    @Override
    AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB1();
    }
}
