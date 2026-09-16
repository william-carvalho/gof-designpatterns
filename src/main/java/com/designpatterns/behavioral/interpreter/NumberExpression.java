package com.designpatterns.behavioral.interpreter;

/**
 * Terminal expression representing a number.
 */
public class NumberExpression implements Expression {

    private final int value;

    public NumberExpression(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return value;
    }
}
