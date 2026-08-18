package com.designpatterns.structural.bridge;

/**
 * Abstraction that delegates device-specific work through the bridge.
 */
public class RemoteControl {

    protected final Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void powerOn() {
        device.turnOn();
    }

    public void powerOff() {
        device.turnOff();
    }

    public void changeVolume(int volume) {
        device.setVolume(volume);
    }
}
