package com.designpatterns.structural.bridge;

public class Radio implements Device {

    @Override
    public void turnOn() {
        System.out.println("Radio is on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio is off.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Radio volume: " + volume);
    }
}
