package com.designpatterns.structural.adapter;

/**
 * Adapter that converts dollars into the cents expected by the legacy gateway.
 */
public class PaymentGatewayAdapter implements PaymentProcessor {

    private final LegacyPaymentGateway legacyGateway;

    public PaymentGatewayAdapter(LegacyPaymentGateway legacyGateway) {
        this.legacyGateway = legacyGateway;
    }

    @Override
    public void pay(double amountInDollars) {
        int amountInCents = (int) Math.round(amountInDollars * 100);
        legacyGateway.makePayment(amountInCents);
    }
}
