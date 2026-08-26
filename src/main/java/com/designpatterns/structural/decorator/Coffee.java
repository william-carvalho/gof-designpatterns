package com.designpatterns.structural.decorator;

/**
 * Component interface shared by the base object and its decorators.
 */
public interface Coffee {

    String getDescription();

    double getCost();
}
