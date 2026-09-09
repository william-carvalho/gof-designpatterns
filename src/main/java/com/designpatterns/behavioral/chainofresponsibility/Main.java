package com.designpatterns.behavioral.chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        SupportHandler supportChain = new BasicSupportHandler();
        supportChain
                .setNext(new TechnicalSupportHandler())
                .setNext(new ManagerSupportHandler());

        supportChain.handle("Password reset", 1);
        supportChain.handle("Software installation error", 2);
        supportChain.handle("Refund approval", 3);
        supportChain.handle("Data center outage", 4);
    }
}
