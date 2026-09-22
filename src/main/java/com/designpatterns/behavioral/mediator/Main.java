package com.designpatterns.behavioral.mediator;

public class Main {

    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User alice = new User("Alice", chatRoom);
        User bob = new User("Bob", chatRoom);
        User carol = new User("Carol", chatRoom);

        chatRoom.addUser(alice);
        chatRoom.addUser(bob);
        chatRoom.addUser(carol);

        alice.send("Hello everyone!");
    }
}
