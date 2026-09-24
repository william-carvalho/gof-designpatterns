package com.designpatterns.behavioral.memento;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Caretaker that stores snapshots without inspecting their contents.
 */
public class History {

    private final Deque<TextEditor.Memento> snapshots =
            new ArrayDeque<TextEditor.Memento>();

    public void save(TextEditor.Memento memento) {
        snapshots.push(memento);
    }

    public TextEditor.Memento undo() {
        if (snapshots.isEmpty()) {
            throw new IllegalStateException("There is no saved state.");
        }

        return snapshots.pop();
    }
}
