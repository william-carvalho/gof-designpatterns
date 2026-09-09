package com.designpatterns.behavioral.chainofresponsibility;

public class BasicSupportHandler extends SupportHandler {

    @Override
    protected boolean canHandle(int priority) {
        return priority == 1;
    }

    @Override
    protected void process(String issue) {
        System.out.println("Basic support handled: " + issue);
    }
}
