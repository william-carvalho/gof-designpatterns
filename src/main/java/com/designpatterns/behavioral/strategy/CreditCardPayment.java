package com.designpatterns.behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy {

    private final String lastFourDigits;

    public CreditCardPayment(String lastFourDigits) {
        this.lastFourDigits = lastFourDigits;
    }

    @Override
    public void pay(int amount) {
        System.out.println(
                "Paid $" + amount + " with credit card ending in " + lastFourDigits + ".");
    }
}
