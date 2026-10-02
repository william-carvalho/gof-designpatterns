# Template Method

The **Template Method** is a behavioral design pattern that defines the
structure of an algorithm in a base class while allowing subclasses to customize
specific steps.

This basic example defines one preparation process for beverages. Coffee and tea
share the same sequence but implement brewing and condiments differently.

## Example Structure

- `Beverage`: abstract class containing the final `prepare()` template method.
- `Coffee`: concrete class that supplies the coffee-specific steps.
- `Tea`: concrete class that supplies the tea-specific steps.
- `Main`: prepares both beverages using the same algorithm structure.

## How It Works

The template method fixes the order of operations:

```text
prepare()
  1. boilWater()       fixed step
  2. brew()            customized step
  3. pourIntoCup()     fixed step
  4. addCondiments()   customized step
```

`prepare()` is `final`, so subclasses cannot change the sequence. They override
only the steps designed for variation:

```java
@Override
protected void brew() {
    System.out.println("Brewing coffee.");
}
```

## Run the Example

From the project root, compile the classes:

```bash
javac -d out src/main/java/com/designpatterns/behavioral/templatemethod/*.java
```

Then run:

```bash
java -cp out com.designpatterns.behavioral.templatemethod.Main
```

Expected output:

```text
Preparing coffee:
Boiling water.
Brewing coffee.
Pouring into cup.
Adding milk and sugar.

Preparing tea:
Boiling water.
Steeping tea.
Pouring into cup.
Adding lemon.
```

## Advantages

- Reuses the common parts of an algorithm in one base class
- Enforces a consistent sequence of steps
- Allows selected steps to vary through subclassing
- Reduces duplication between similar workflows

## Disadvantages

- Relies on inheritance and couples subclasses to the base class
- Can become rigid when clients need to reorder algorithm steps
- A base class with too many extension points can be difficult to understand
- Changes to the template may affect every subclass

## Common Use Cases

- Data import, export, and transformation pipelines
- Document generation and report workflows
- Framework lifecycle methods and test setup
- Similar recipes or processing sequences with varying steps

## Considerations

- Mark the template method `final` when subclasses must preserve its order
- Keep required abstract steps small and clearly documented
- Use hooks with default implementations only for truly optional behavior
- Prefer Strategy when the complete algorithm must change at runtime
- Avoid fragile base classes with excessive subclass knowledge

## When to Use It

Use Template Method when several algorithms share a stable sequence and differ
only in selected steps. Composition with Strategy is more flexible when behavior
must change dynamically rather than through inheritance.
