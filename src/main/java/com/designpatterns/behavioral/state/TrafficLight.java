package com.designpatterns.behavioral.state;

/**
 * Context whose behavior is delegated to its current state.
 */
public class TrafficLight {

    private TrafficLightState state = new RedState();

    public void change() {
        state.next(this);
    }

    public String getCurrentState() {
        return state.getName();
    }

    void setState(TrafficLightState state) {
        this.state = state;
    }
}
