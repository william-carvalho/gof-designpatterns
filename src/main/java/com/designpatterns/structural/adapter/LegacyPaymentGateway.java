package com.designpatterns.structural.adapter;

/**
 * Existing service with an interface incompatible with PaymentProcessor.
 */
public class LegacyPaymentGateway {

    public void makePayment(int amountInCents) {
        System.out.println(
                "Legacy gateway processed " + amountInCents + " cents.");
    }
}
