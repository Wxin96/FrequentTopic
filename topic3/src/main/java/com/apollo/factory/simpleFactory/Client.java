package com.apollo.factory.simpleFactory;

import com.apollo.factory.Product;

public class Client {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(1);
    }
}
