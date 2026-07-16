package com.designpatterns.creational.factorymethod;

/**
 * Creator that declares the factory method.
 */
public abstract class NotificationCreator {

    protected abstract Notification createNotification();

    public void notifyUser(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }
}
