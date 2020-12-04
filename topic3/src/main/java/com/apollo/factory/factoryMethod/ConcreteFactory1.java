package com.apollo.factory.factoryMethod;

import com.apollo.factory.ConcreteProduct1;
import com.apollo.factory.Product;

public class ConcreteFactory1 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
