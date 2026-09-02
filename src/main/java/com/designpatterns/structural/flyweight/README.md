# Flyweight

The **Flyweight** is a structural design pattern that reduces memory usage by
sharing common state between many small objects.

This basic example represents trees in a forest. Trees with the same name and
color share one `TreeType`, while each `Tree` stores only its own coordinates.

## Example Structure

- `TreeType`: flyweight containing the shared name and color.
- `Tree`: context containing unique coordinates and a flyweight reference.
- `TreeTypeFactory`: creates and caches flyweights for reuse.
- `Main`: creates three trees while using only two shared tree types.

## How It Works

Flyweight separates object state into two parts:

- **Intrinsic state** is shared and stored in `TreeType`: name and color.
- **Extrinsic state** is unique and stored in `Tree`: x and y coordinates.

```text
Tree(10, 20) ---+
                +--> shared TreeType("oak", "green")
Tree(30, 40) ---+

Tree(50, 60) ------> TreeType("pine", "dark green")
```

The factory returns an existing `TreeType` when the same key is requested:

```java
TreeType oak = factory.getTreeType("oak", "green");
Tree tree = new Tree(10, 20, oak);
```

## Run the Example

From the project root, compile the classes:

```bash
javac -d out src/main/java/com/designpatterns/structural/flyweight/*.java
```

Then run:

```bash
java -cp out com.designpatterns.structural.flyweight.Main
```

Expected output:

```text
Drawing green oak at (10, 20).
Drawing green oak at (30, 40).
Drawing dark green pine at (50, 60).
Shared tree types created: 2
Do the oak trees share one type? true
```

## Advantages

- Reduces memory usage when many objects repeat the same state
- Centralizes shared immutable data
- Can make large collections of fine-grained objects practical
- Reuses flyweights transparently through a factory

## Disadvantages

- Adds a factory, cache, and separation of state
- Makes code harder to understand than ordinary object creation
- May increase computation because extrinsic state must be supplied separately
- Provides little benefit when objects do not share much data

## Common Use Cases

- Characters and formatting information in text editors
- Trees, particles, tiles, and sprites in graphical applications
- Cached metadata shared by many domain objects
- Repeated icons, styles, or symbols in user interfaces

## Considerations

- Keep intrinsic shared state immutable
- Choose stable cache keys that uniquely identify each flyweight
- Measure memory usage before introducing the additional complexity
- Consider cache growth and lifecycle when flyweight variations are unbounded
- Keep contextual state outside the shared flyweight

## When to Use It

Use Flyweight when an application creates a very large number of similar
objects, memory usage is significant, and much of their state can be safely
shared. Regular objects are simpler when the number of instances is small.
