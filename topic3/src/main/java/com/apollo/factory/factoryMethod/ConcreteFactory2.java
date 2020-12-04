package com.apollo.factory.factoryMethod;

import com.apollo.factory.ConcreteProduct2;
import com.apollo.factory.Product;

public class ConcreteFactory2 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
