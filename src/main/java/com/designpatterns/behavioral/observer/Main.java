package com.designpatterns.behavioral.observer;

public class Main {

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        WeatherObserver phoneDisplay = new PhoneDisplay();
        WeatherObserver windowDisplay = new WindowDisplay();

        station.addObserver(phoneDisplay);
        station.addObserver(windowDisplay);
        station.setTemperature(25.0);

        System.out.println();
        station.removeObserver(windowDisplay);
        station.setTemperature(30.0);
    }
}
