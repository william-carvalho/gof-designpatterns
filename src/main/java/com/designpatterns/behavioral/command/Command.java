package com.designpatterns.behavioral.command;

/**
 * Command interface for executing and undoing a request.
 */
public interface Command {

    void execute();

    void undo();
}
