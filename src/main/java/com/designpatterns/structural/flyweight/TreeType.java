package com.designpatterns.structural.flyweight;

/**
 * Flyweight containing state shared by many trees.
 */
public final class TreeType {

    private final String name;
    private final String color;

    public TreeType(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void draw(int x, int y) {
        System.out.println(
                "Drawing " + color + " " + name + " at (" + x + ", " + y + ").");
    }
}
