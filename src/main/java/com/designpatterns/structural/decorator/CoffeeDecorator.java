package com.designpatterns.structural.decorator;

/**
 * Base decorator that keeps a reference to another Coffee component.
 */
public abstract class CoffeeDecorator implements Coffee {

    protected final Coffee coffee;

    protected CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
