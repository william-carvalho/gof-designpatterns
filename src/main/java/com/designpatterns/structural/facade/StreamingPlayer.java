package com.designpatterns.structural.facade;

/**
 * One subsystem used by the home theater.
 */
public class StreamingPlayer {

    public void turnOn() {
        System.out.println("Streaming player is on.");
    }

    public void play(String movie) {
        System.out.println("Playing: " + movie);
    }

    public void stop() {
        System.out.println("Playback stopped.");
    }

    public void turnOff() {
        System.out.println("Streaming player is off.");
    }
}
