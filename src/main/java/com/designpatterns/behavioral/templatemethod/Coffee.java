package com.designpatterns.behavioral.templatemethod;

public class Coffee extends Beverage {

    @Override
    protected void brew() {
        System.out.println("Brewing coffee.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding milk and sugar.");
    }
}
