package com.designpatterns.creational.builder;

public class Main {

    public static void main(String[] args) {
        Computer officeComputer = new Computer.Builder("Intel Core i3", "8 GB")
                .build();

        Computer gamingComputer = new Computer.Builder("AMD Ryzen 7", "32 GB")
                .withStorage("1 TB SSD")
                .withDedicatedGraphics()
                .build();

        System.out.println("Office: " + officeComputer);
        System.out.println("Gaming: " + gamingComputer);
    }
}
