package com.designpatterns.behavioral.observer;

public class PhoneDisplay implements WeatherObserver {

    @Override
    public void update(double temperature) {
        System.out.println("Phone display: " + temperature + " C");
    }
}
