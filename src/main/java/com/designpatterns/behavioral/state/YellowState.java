package com.designpatterns.behavioral.state;

public class YellowState implements TrafficLightState {

    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new RedState());
    }

    @Override
    public String getName() {
        return "Yellow";
    }
}
