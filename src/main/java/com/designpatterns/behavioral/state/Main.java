package com.designpatterns.behavioral.state;

public class Main {

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        System.out.println("Current state: " + trafficLight.getCurrentState());

        for (int i = 0; i < 3; i++) {
            trafficLight.change();
            System.out.println("Current state: " + trafficLight.getCurrentState());
        }
    }
}
