package com.designpatterns.creational.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();

        firstInstance.showMessage();

        System.out.println(
                "Do both variables reference the same instance? "
                        + (firstInstance == secondInstance));
    }
}
