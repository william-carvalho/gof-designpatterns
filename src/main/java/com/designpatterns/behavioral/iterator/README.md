# Iterator

The **Iterator** is a behavioral design pattern that provides sequential access
to the elements of a collection without exposing its internal representation.

This basic example traverses a book collection backed by an array. The client
does not access the array or manage indexes directly.

## Example Structure

- `Iterator<T>`: iterator interface declaring `hasNext()` and `next()`.
- `BookCollection`: aggregate that stores book titles in a private array.
- `BookIterator`: concrete iterator that tracks the current position.
- `Main`: creates a collection and traverses it through the iterator.

## How It Works

The collection creates an iterator that knows how to traverse its elements:

```text
Client -> BookCollection -> creates -> BookIterator
                                      traverses the collection
```

The client depends only on the iterator operations:

```java
Iterator<String> iterator = books.createIterator();

while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

Traversal state belongs to `BookIterator`, so multiple iterators can traverse
the same collection independently.

## Run the Example

From the project root, compile the classes:

```bash
javac -d out src/main/java/com/designpatterns/behavioral/iterator/*.java
```

Then run:

```bash
java -cp out com.designpatterns.behavioral.iterator.Main
```

Expected output:

```text
Book: Design Patterns
Book: Clean Code
Book: Effective Java
```

## Advantages

- Hides the collection's internal data structure from clients
- Moves traversal state and logic out of the collection user
- Allows multiple independent traversals of the same collection
- Supports different traversal strategies behind a common interface

## Disadvantages

- Adds iterator classes for simple collections
- Can be less efficient than specialized traversal for some data structures
- Collection changes during iteration require clearly defined behavior
- A custom iterator may duplicate features already provided by the language

## Common Use Cases

- Traversing collections, trees, graphs, and composite structures
- Providing forward, reverse, filtered, or ordered traversal
- Processing database result sets and paginated data
- Hiding custom storage behind a stable traversal API

## Considerations

- Define behavior when `next()` is called after traversal is complete
- Decide how modifications during iteration are detected or supported
- Keep traversal state inside each iterator instance
- Implement Java's standard `Iterable` and `java.util.Iterator` interfaces in
  production code when integration with enhanced `for` loops is useful
- Consider lazy iteration for large or expensive data sources

## When to Use It

Use Iterator when clients need to traverse a collection without depending on
its storage details or when several traversal strategies are required. Direct
iteration is simpler when the collection already exposes a suitable standard
iterator.
