package com.designpatterns.behavioral.memento;

/**
 * Originator whose text state can be saved and restored.
 */
public class TextEditor {

    private String text = "";

    public void write(String value) {
        text += value;
    }

    public String getText() {
        return text;
    }

    public Memento save() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        text = memento.text;
    }

    /**
     * Immutable snapshot whose contents are accessible only to TextEditor.
     */
    public static final class Memento {

        private final String text;

        private Memento(String text) {
            this.text = text;
        }
    }
}
