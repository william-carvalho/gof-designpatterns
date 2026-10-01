package com.designpatterns.behavioral.strategy;

/**
 * Context that delegates payment processing to its current strategy.
 */
public class PaymentService {

    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(int amount) {
        if (strategy == null) {
            throw new IllegalStateException("A payment strategy is required.");
        }

        strategy.pay(amount);
    }
}
