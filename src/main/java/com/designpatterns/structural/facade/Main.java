package com.designpatterns.structural.facade;

public class Main {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                new Projector(),
                new SoundSystem(),
                new StreamingPlayer());

        homeTheater.watchMovie("Design Patterns");
        System.out.println();
        homeTheater.endMovie();
    }
}
