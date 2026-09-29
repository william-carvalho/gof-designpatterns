package com.designpatterns.behavioral.state;

public class GreenState implements TrafficLightState {

    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new YellowState());
    }

    @Override
    public String getName() {
        return "Green";
    }
}
