package com.designpatterns.creational.factorymethod;

public class Main {

    public static void main(String[] args) {
        NotificationCreator emailCreator = new EmailNotificationCreator();
        NotificationCreator smsCreator = new SmsNotificationCreator();

        emailCreator.notifyUser("Welcome to the Factory Method example!");
        smsCreator.notifyUser("Your verification code is 1234.");
    }
}
