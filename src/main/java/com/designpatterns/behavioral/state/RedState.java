package com.designpatterns.behavioral.state;

public class RedState implements TrafficLightState {

    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new GreenState());
    }

    @Override
    public String getName() {
        return "Red";
    }
}
