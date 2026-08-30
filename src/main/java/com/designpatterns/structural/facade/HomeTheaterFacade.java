package com.designpatterns.structural.facade;

/**
 * Facade that coordinates the home-theater subsystems.
 */
public class HomeTheaterFacade {

    private final Projector projector;
    private final SoundSystem soundSystem;
    private final StreamingPlayer player;

    public HomeTheaterFacade(
            Projector projector,
            SoundSystem soundSystem,
            StreamingPlayer player) {
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.player = player;
    }

    public void watchMovie(String movie) {
        System.out.println("Preparing the home theater...");
        projector.turnOn();
        soundSystem.turnOn();
        soundSystem.setVolume(20);
        player.turnOn();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        player.stop();
        player.turnOff();
        soundSystem.turnOff();
        projector.turnOff();
    }
}
