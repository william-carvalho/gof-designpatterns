package com.designpatterns.behavioral.memento;

public class Main {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Hello");
        history.save(editor.save());

        editor.write(" world!");
        System.out.println("Before undo: " + editor.getText());

        editor.restore(history.undo());
        System.out.println("After undo: " + editor.getText());
    }
}
