package com.designpatterns.creational.abstractfactory;

public class Main {

    public static void main(String[] args) {
        renderFamily("Windows family:", new WindowsGuiFactory());
        renderFamily("macOS family:", new MacGuiFactory());
    }

    private static void renderFamily(String title, GuiFactory factory) {
        System.out.println(title);
        new Application(factory).render();
    }
}
