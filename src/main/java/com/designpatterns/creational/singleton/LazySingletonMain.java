package com.designpatterns.creational.singleton;

public class LazySingletonMain {

    public static void main(String[] args) {
        System.out.println("Before the first getInstance() call.");

        LazySingleton firstInstance = LazySingleton.getInstance();
        LazySingleton secondInstance = LazySingleton.getInstance();

        firstInstance.showMessage();

        System.out.println(
                "Do both variables reference the same instance? "
                        + (firstInstance == secondInstance));
    }
}
