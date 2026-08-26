package com.designpatterns.structural.decorator;

/**
 * Concrete component that can be wrapped by decorators.
 */
public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Simple coffee";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
