package com.designpatterns.structural.facade;

/**
 * One subsystem used by the home theater.
 */
public class Projector {

    public void turnOn() {
        System.out.println("Projector is on.");
    }

    public void turnOff() {
        System.out.println("Projector is off.");
    }
}
