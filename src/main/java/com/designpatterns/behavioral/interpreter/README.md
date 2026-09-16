# Interpreter

The **Interpreter** is a behavioral design pattern that represents the grammar
of a small language with classes and evaluates sentences written in that
language.

This basic example defines a tiny arithmetic language containing numbers,
addition, and subtraction. It interprets the expression `(10 + 5) - 3`.

## Example Structure

- `Expression`: common interface for every grammar rule.
- `NumberExpression`: terminal expression representing an integer.
- `AddExpression`: non-terminal expression that adds two expressions.
- `SubtractExpression`: non-terminal expression that subtracts two expressions.
- `Main`: builds an abstract syntax tree and interprets it.

## How It Works

Each grammar element is represented by an expression object:

```text
              Subtract
              /      \
            Add       3
           /   \
         10     5
```

Terminal expressions return their values. Non-terminal expressions recursively
interpret their children and combine the results:

```java
Expression expression = new SubtractExpression(
        new AddExpression(
                new NumberExpression(10),
                new NumberExpression(5)),
        new NumberExpression(3));
```

This example constructs the expression tree directly. A larger implementation
would normally include a parser that converts text into the tree.

## Run the Example

From the project root, compile the classes:

```bash
javac -d out src/main/java/com/designpatterns/behavioral/interpreter/*.java
```

Then run:

```bash
java -cp out com.designpatterns.behavioral.interpreter.Main
```

Expected output:

```text
Expression: (10 + 5) - 3
Result: 12
```

## Advantages

- Represents simple grammar rules with focused classes
- Makes new expressions easy to add when the grammar is small
- Uses recursive object composition to evaluate nested expressions
- Keeps interpretation logic close to each grammar rule

## Disadvantages

- Creates many classes as the grammar grows
- Becomes difficult to maintain for complex languages
- Parsing, validation, precedence, and error reporting require additional work
- Recursive interpretation may be inefficient for large expression trees

## Common Use Cases

- Simple arithmetic, boolean, or filtering expressions
- Rule engines and access-control rules
- Search queries and configuration languages
- Small domain-specific languages

## Considerations

- Use a parser rather than manual tree construction for user-provided text
- Define operator precedence, associativity, and invalid syntax clearly
- Keep the grammar small and stable
- Consider a parser generator or dedicated language tool for complex grammars
- Validate recursion depth when interpreting untrusted expressions

## When to Use It

Use Interpreter when a small language has a simple grammar that can be modeled
clearly as an expression tree. Established parsing libraries are usually a
better choice for large or frequently changing languages.
