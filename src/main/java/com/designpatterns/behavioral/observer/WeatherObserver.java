package com.designpatterns.behavioral.observer;

/**
 * Observer interface for receiving temperature updates.
 */
public interface WeatherObserver {

    void update(double temperature);
}
