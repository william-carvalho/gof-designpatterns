package com.designpatterns.behavioral.mediator;

/**
 * Colleague that communicates only through the mediator.
 */
public class User {

    private final String name;
    private final ChatMediator mediator;

    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void send(String message) {
        System.out.println(name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    public void receive(String message, String senderName) {
        System.out.println(name + " receives from " + senderName + ": " + message);
    }
}
