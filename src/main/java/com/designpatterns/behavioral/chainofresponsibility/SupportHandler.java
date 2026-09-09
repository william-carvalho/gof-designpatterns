package com.designpatterns.behavioral.chainofresponsibility;

/**
 * Base handler that manages the link to the next handler in the chain.
 */
public abstract class SupportHandler {

    private SupportHandler nextHandler;

    public SupportHandler setNext(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public final void handle(String issue, int priority) {
        if (canHandle(priority)) {
            process(issue);
        } else if (nextHandler != null) {
            nextHandler.handle(issue, priority);
        } else {
            System.out.println("No support handler available for: " + issue);
        }
    }

    protected abstract boolean canHandle(int priority);

    protected abstract void process(String issue);
}
