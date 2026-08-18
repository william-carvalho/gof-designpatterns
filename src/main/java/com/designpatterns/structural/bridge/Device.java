package com.designpatterns.structural.bridge;

/**
 * Implementation interface used by the remote-control abstraction.
 */
public interface Device {

    void turnOn();

    void turnOff();

    void setVolume(int volume);
}
