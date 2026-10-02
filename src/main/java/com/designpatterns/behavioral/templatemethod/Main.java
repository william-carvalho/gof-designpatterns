package com.designpatterns.behavioral.templatemethod;

public class Main {

    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        Beverage tea = new Tea();

        System.out.println("Preparing coffee:");
        coffee.prepare();

        System.out.println();
        System.out.println("Preparing tea:");
        tea.prepare();
    }
}
