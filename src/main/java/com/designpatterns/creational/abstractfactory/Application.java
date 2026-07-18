package com.designpatterns.creational.abstractfactory;

/**
 * Client that depends only on abstract products and the abstract factory.
 */
public class Application {

    private final Button button;
    private final Checkbox checkbox;

    public Application(GuiFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void render() {
        button.render();
        checkbox.render();
    }
}
