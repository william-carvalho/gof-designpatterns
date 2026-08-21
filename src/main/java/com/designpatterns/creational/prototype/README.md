# Prototype

The **Prototype** is a creational design pattern that creates new objects by
copying an existing object instead of constructing them from scratch.

This basic example copies a configured `Document` and then customizes the copy
without changing the original.

## Example Structure

- `Prototype<T>`: generic contract declaring the `copy()` operation.
- `Document`: concrete prototype that copies itself through a private copy
  constructor.
- `Main`: creates an original document, copies it, and modifies the copy.

## How It Works

The original document is configured normally:

```java
Document original = new Document(
        "Monthly Report",
        "Sales: 100 units",
        "PDF");
```

The client asks the object itself to create a copy:

```java
Document copy = original.copy();
copy.setTitle("Monthly Report - Copy");
```

`Document.copy()` delegates to a copy constructor that transfers the current
state into a new object. The example uses an explicit copy operation instead of
Java's `Cloneable` API, keeping the copying rules visible and type-safe.

## Run the Example

From the project root, compile the classes:

```bash
javac -d out src/main/java/com/designpatterns/creational/prototype/*.java
```

Then run:

```bash
java -cp out com.designpatterns.creational.prototype.Main
```

Expected output:

```text
Original: Document{title='Monthly Report', content='Sales: 100 units', format='PDF'}
Copy:     Document{title='Monthly Report - Copy', content='Sales: 120 units', format='PDF'}
Are they the same object? false
```

## Shallow and Deep Copies

The fields in this example are strings, which are immutable, so copying their
references is safe. If a prototype contains mutable objects such as lists, each
mutable object should also be copied when an independent deep copy is required.

## When to Use It

Use Prototype when creating an object is expensive or complicated and new
objects usually begin with the same configuration as an existing one. A normal
constructor or factory is often simpler when object creation is inexpensive.

## Advantages

- Reuses an existing configuration without repeating complex setup
- Creates new variants without depending on concrete constructors
- Can reduce the cost of repeatedly initializing expensive objects

## Disadvantages

- Copying nested mutable objects can be difficult
- Copy behavior may become outdated when new fields are added
- Shared references in shallow copies can cause unexpected changes

## Common Use Cases

- Templates for documents, messages, or graphical objects
- Preconfigured objects that need small variations
- Objects whose initial state is expensive to calculate or load

## Considerations

- Clearly define whether `copy()` performs a shallow or deep copy
- Copy every mutable nested value when independent state is required
- Test that modifying a copy does not unexpectedly change its prototype
- Prefer explicit copy constructors or methods when they make the rules clearer
