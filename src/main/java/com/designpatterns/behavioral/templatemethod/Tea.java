package com.designpatterns.behavioral.templatemethod;

public class Tea extends Beverage {

    @Override
    protected void brew() {
        System.out.println("Steeping tea.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon.");
    }
}
