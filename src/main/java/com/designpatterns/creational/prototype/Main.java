package com.designpatterns.creational.prototype;

public class Main {

    public static void main(String[] args) {
        Document original = new Document(
                "Monthly Report",
                "Sales: 100 units",
                "PDF");

        Document copy = original.copy();
        copy.setTitle("Monthly Report - Copy");
        copy.setContent("Sales: 120 units");

        System.out.println("Original: " + original);
        System.out.println("Copy:     " + copy);
        System.out.println("Are they the same object? " + (original == copy));
    }
}
