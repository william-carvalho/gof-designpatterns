package com.designpatterns.structural.bridge;

public class Television implements Device {

    @Override
    public void turnOn() {
        System.out.println("Television is on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Television is off.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Television volume: " + volume);
    }
}
