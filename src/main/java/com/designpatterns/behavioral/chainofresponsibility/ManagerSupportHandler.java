package com.designpatterns.behavioral.chainofresponsibility;

public class ManagerSupportHandler extends SupportHandler {

    @Override
    protected boolean canHandle(int priority) {
        return priority == 3;
    }

    @Override
    protected void process(String issue) {
        System.out.println("Manager support handled: " + issue);
    }
}
