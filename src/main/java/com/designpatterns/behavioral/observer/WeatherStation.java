package com.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject that stores observers and notifies them when its state changes.
 */
public class WeatherStation {

    private final List<WeatherObserver> observers =
            new ArrayList<WeatherObserver>();
    private double temperature;

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        System.out.println("Temperature changed to " + temperature + " C.");
        notifyObservers();
    }

    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature);
        }
    }
}
