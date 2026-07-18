package com.designpatterns.creational.abstractfactory;

/**
 * Abstract factory for a family of related user-interface components.
 */
public interface GuiFactory {

    Button createButton();

    Checkbox createCheckbox();
}
