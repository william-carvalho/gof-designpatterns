package com.designpatterns.behavioral.command;

/**
 * Receiver that performs the real operations.
 */
public class Light {

    public void turnOn() {
        System.out.println("Light is on.");
    }

    public void turnOff() {
        System.out.println("Light is off.");
    }
}
