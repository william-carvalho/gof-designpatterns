package com.designpatterns.behavioral.templatemethod;

/**
 * Abstract class that defines the fixed algorithm structure.
 */
public abstract class Beverage {

    public final void prepare() {
        boilWater();
        brew();
        pourIntoCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water.");
    }

    protected abstract void brew();

    private void pourIntoCup() {
        System.out.println("Pouring into cup.");
    }

    protected abstract void addCondiments();
}
