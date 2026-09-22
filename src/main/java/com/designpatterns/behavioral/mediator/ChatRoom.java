package com.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete mediator that coordinates communication between users.
 */
public class ChatRoom implements ChatMediator {

    private final List<User> users = new ArrayList<User>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receive(message, sender.getName());
            }
        }
    }
}
