package com.designpatterns.behavioral.observer;

public class WindowDisplay implements WeatherObserver {

    @Override
    public void update(double temperature) {
        System.out.println("Window display: " + temperature + " C");
    }
}
