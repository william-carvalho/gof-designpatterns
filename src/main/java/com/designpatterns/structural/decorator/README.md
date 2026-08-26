# Decorator

The **Decorator** is a structural design pattern that adds behavior to an object
by wrapping it with another object that implements the same interface.

This basic example starts with a simple coffee and dynamically adds milk and
sugar without changing the `SimpleCoffee` class.

## Example Structure

- `Coffee`: component interface shared by every object in the chain.
- `SimpleCoffee`: concrete component with the basic description and cost.
- `CoffeeDecorator`: base decorator that stores another `Coffee` component.
- `MilkDecorator` and `SugarDecorator`: concrete decorators that add their own
  description and cost.
- `Main`: combines the component and decorators at runtime.

## How It Works

Each decorator implements `Coffee` and delegates to the wrapped component before
adding its own behavior:

```text
SugarDecorator -> MilkDecorator -> SimpleCoffee
```

Decorators can be combined in different orders without creating subclasses for
every possible combination:

```java
Coffee coffee = new SimpleCoffee();
coffee = new MilkDecorator(coffee);
coffee = new SugarDecorator(coffee);
```

## Run the Example

From the project root, compile the classes:

```bash
javac -d out src/main/java/com/designpatterns/structural/decorator/*.java
```

Then run:

```bash
java -cp out com.designpatterns.structural.decorator.Main
```

Expected output:

```text
Order: Simple coffee, milk, sugar
Cost: $2.75
```

## Advantages

- Adds responsibilities without changing the original class
- Combines behaviors at runtime through composition
- Avoids a large subclass hierarchy for every feature combination
- Keeps each optional behavior in a focused class

## Disadvantages

- Creates several small wrapper objects
- Makes the final chain harder to inspect and debug
- Can produce order-dependent results when decorators modify the same behavior
- Object identity and equality may become less obvious through wrappers

## Common Use Cases

- Input/output streams with buffering, compression, or encryption
- User-interface components with borders, scrolling, or validation
- HTTP clients with logging, retries, caching, or authentication
- Products with optional features or pricing additions

## Considerations

- The component and every decorator must share a stable interface
- Keep decorators focused on one responsibility
- Document whether the order of decorators changes the result
- Use a builder or factory when constructing long decorator chains becomes noisy

## When to Use It

Use Decorator when behavior must be added to individual objects dynamically and
subclassing would create too many combinations. A regular class or helper method
may be simpler when the behavior is fixed and has only one variation.
