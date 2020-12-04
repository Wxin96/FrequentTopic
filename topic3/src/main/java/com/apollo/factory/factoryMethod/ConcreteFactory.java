package com.apollo.factory.factoryMethod;

import com.apollo.factory.ConcreteProduct;
import com.apollo.factory.Product;

public class ConcreteFactory extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
