package com.designpatterns.behavioral.state;

/**
 * State interface for traffic-light behavior.
 */
public interface TrafficLightState {

    void next(TrafficLight trafficLight);

    String getName();
}
