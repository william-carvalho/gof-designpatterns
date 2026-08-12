package com.designpatterns.structural.adapter;

public class Main {

    public static void main(String[] args) {
        LegacyPaymentGateway legacyGateway = new LegacyPaymentGateway();
        PaymentProcessor paymentProcessor =
                new PaymentGatewayAdapter(legacyGateway);

        paymentProcessor.pay(25.99);
    }
}
