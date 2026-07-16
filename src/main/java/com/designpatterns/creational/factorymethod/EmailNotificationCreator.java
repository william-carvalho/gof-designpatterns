package com.designpatterns.creational.factorymethod;

public class EmailNotificationCreator extends NotificationCreator {

    @Override
    protected Notification createNotification() {
        return new EmailNotification();
    }
}
