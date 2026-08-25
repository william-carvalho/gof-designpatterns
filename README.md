# GoF Design Patterns in Java 8

A study project containing clear, practical implementations of the **23 classic
Gang of Four (GoF) design patterns** using **Java 8**.

The patterns were introduced by Erich Gamma, Richard Helm, Ralph Johnson, and
John Vlissides in *Design Patterns: Elements of Reusable Object-Oriented
Software*. They provide reusable solutions to recurring object-oriented design
problems and help create software that is flexible, maintainable, and loosely
coupled.

## Pattern Categories

GoF patterns are organized into three groups:

- **Creational patterns** control how objects are created.
- **Structural patterns** describe how classes and objects are composed.
- **Behavioral patterns** define how objects communicate and share
  responsibilities.

## Creational Patterns

| Pattern | Purpose |
| --- | --- |
| [Singleton](src/main/java/com/designpatterns/creational/singleton) | Ensures that a class has only one instance and provides a global access point to it. |
| [Factory Method](src/main/java/com/designpatterns/creational/factorymethod) | Defines an interface for creating an object while allowing subclasses to choose its concrete type. |
| [Abstract Factory](src/main/java/com/designpatterns/creational/abstractfactory) | Creates families of related objects without specifying their concrete classes. |
| [Builder](src/main/java/com/designpatterns/creational/builder) | Constructs a complex object step by step, independently of its representation. |
| [Prototype](src/main/java/com/designpatterns/creational/prototype) | Creates new objects by copying an existing prototype. |

## Structural Patterns

| Pattern | Purpose |
| --- | --- |
| [Adapter](src/main/java/com/designpatterns/structural/adapter) | Converts one interface into another interface expected by a client. |
| [Bridge](src/main/java/com/designpatterns/structural/bridge) | Separates an abstraction from its implementation so both can evolve independently. |
| [Composite](src/main/java/com/designpatterns/structural/composite) | Represents part-whole hierarchies and treats individual objects and compositions uniformly. |
| [Decorator](src/main/java/com/designpatterns/structural/decorator) | Adds responsibilities to an object dynamically without changing its class. |
| Facade | Provides a simple interface to a complex subsystem. |
| Flyweight | Shares reusable object state to efficiently support many fine-grained objects. |
| Proxy | Provides a substitute that controls access to another object. |

## Behavioral Patterns

| Pattern | Purpose |
| --- | --- |
| Chain of Responsibility | Passes a request through a chain of handlers until one handles it. |
| Command | Encapsulates a request as an object. |
| Interpreter | Defines a grammar and an interpreter for a simple language. |
| Iterator | Traverses a collection without exposing its internal representation. |
| Mediator | Centralizes communication between related objects to reduce direct dependencies. |
| Memento | Captures and restores an object's internal state without breaking encapsulation. |
| Observer | Notifies dependent objects automatically when another object changes state. |
| State | Changes an object's behavior when its internal state changes. |
| Strategy | Defines interchangeable algorithms and selects one at runtime. |
| Template Method | Defines an algorithm's structure while allowing subclasses to customize individual steps. |
| Visitor | Adds operations to an object structure without modifying its element classes. |

## Project Structure

Implementations can follow the standard Maven directory layout and be grouped
by pattern category:

```text
gof-designpatterns/
|-- pom.xml
|-- README.md
`-- src/
    |-- main/java/com/designpatterns/
    |   |-- creational/
    |   |-- structural/
    |   `-- behavioral/
    `-- test/java/com/designpatterns/
```

Each pattern package can contain:

- A small, focused implementation
- An executable example demonstrating its use
- Unit tests documenting the expected behavior

## Requirements

- JDK 8 or newer
- Apache Maven 3.6 or newer

Check the installed versions:

```bash
java -version
mvn -version
```

## Build and Test

After adding the Maven project descriptor and implementations, use the
following commands.

Compile the project:

```bash
mvn clean compile
```

Run all tests:

```bash
mvn test
```

Build the project package:

```bash
mvn clean package
```

## Learning Goals

This project is intended to help developers:

- Recognize common object-oriented design problems
- Understand the intent and trade-offs of each GoF pattern
- Compare patterns with similar responsibilities
- Practice writing reusable Java 8 code
- Learn when a pattern is useful and when a simpler design is preferable

## Choosing a Pattern

Use patterns as design tools, not rigid rules. Start with the problem you need to
solve, keep the implementation as simple as possible, and introduce a pattern
only when its flexibility or separation of responsibilities provides a clear
benefit.

## Advantages

- Provides a shared vocabulary for communicating common design solutions
- Encourages loose coupling, encapsulation, and separation of concerns
- Offers proven structures that can improve extensibility and maintainability
- Makes recurring design decisions easier to recognize and discuss

## Disadvantages

- Can add unnecessary classes, interfaces, and indirection
- May make a simple solution harder to understand when applied prematurely
- Does not replace analysis of the specific problem and its constraints
- Can be misused when developers focus on pattern names instead of design goals

## Common Use Cases

- Managing object creation and configuration
- Integrating incompatible components or third-party systems
- Building object hierarchies and flexible compositions
- Coordinating communication, state changes, and interchangeable behavior

## Considerations

- Prefer the simplest design that satisfies the current requirements
- Evaluate the trade-offs of a pattern in the context of the application
- Keep examples and production implementations compatible with their intended
  concurrency, performance, and testing requirements
- Refactor toward a pattern when recurring variation makes its benefits clear

## References

- Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides. *Design
  Patterns: Elements of Reusable Object-Oriented Software*. Addison-Wesley,
  1994.
- [Oracle Java 8 Documentation](https://docs.oracle.com/javase/8/docs/)

## Contributing

Contributions are welcome. Keep each example focused on one pattern, compatible
with Java 8, and covered by tests. Open an issue or submit a pull request with a
clear description of the change.
