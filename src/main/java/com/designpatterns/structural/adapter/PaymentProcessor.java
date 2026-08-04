package com.designpatterns.structural.adapter;

/**
 * Target interface expected by the client.
 */
public interface PaymentProcessor {

    void pay(double amountInDollars);
}
