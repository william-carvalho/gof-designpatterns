package com.designpatterns.creational.singleton;

/**
 * Basic thread-safe Singleton using lazy initialization.
 */
public final class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("Creating the LazySingleton instance.");
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }

    public void showMessage() {
        System.out.println("Hello! I am the lazy Singleton instance.");
    }
}
