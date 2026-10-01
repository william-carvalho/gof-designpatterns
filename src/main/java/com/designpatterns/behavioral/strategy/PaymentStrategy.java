package com.designpatterns.behavioral.strategy;

/**
 * Strategy interface for interchangeable payment algorithms.
 */
public interface PaymentStrategy {

    void pay(int amount);
}
