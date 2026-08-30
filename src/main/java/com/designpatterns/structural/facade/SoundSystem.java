package com.designpatterns.structural.facade;

/**
 * One subsystem used by the home theater.
 */
public class SoundSystem {

    public void turnOn() {
        System.out.println("Sound system is on.");
    }

    public void setVolume(int volume) {
        System.out.println("Sound system volume: " + volume);
    }

    public void turnOff() {
        System.out.println("Sound system is off.");
    }
}
