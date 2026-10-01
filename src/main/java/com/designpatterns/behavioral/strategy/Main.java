package com.designpatterns.behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.setStrategy(new CreditCardPayment("1234"));
        paymentService.processPayment(100);

        paymentService.setStrategy(new PayPalPayment("user@example.com"));
        paymentService.processPayment(50);
    }
}
