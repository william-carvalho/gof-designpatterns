package com.designpatterns.behavioral.interpreter;

public class Main {

    public static void main(String[] args) {
        Expression expression = new SubtractExpression(
                new AddExpression(
                        new NumberExpression(10),
                        new NumberExpression(5)),
                new NumberExpression(3));

        System.out.println("Expression: (10 + 5) - 3");
        System.out.println("Result: " + expression.interpret());
    }
}
