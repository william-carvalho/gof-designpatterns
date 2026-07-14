package com.designpatterns.creational.singleton;

/**
 * Basic Singleton pattern example using eager initialization.
 */
public final class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        // Prevents other classes from creating instances with "new".
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello! I am the single Singleton instance.");
    }
}
