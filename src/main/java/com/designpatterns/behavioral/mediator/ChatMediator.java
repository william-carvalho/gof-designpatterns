package com.designpatterns.behavioral.mediator;

/**
 * Mediator interface for registering users and routing messages.
 */
public interface ChatMediator {

    void addUser(User user);

    void sendMessage(String message, User sender);
}
