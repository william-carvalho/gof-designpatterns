package com.designpatterns.behavioral.chainofresponsibility;

public class TechnicalSupportHandler extends SupportHandler {

    @Override
    protected boolean canHandle(int priority) {
        return priority == 2;
    }

    @Override
    protected void process(String issue) {
        System.out.println("Technical support handled: " + issue);
    }
}
