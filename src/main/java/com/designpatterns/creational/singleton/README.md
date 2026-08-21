# Singleton

The **Singleton** is a creational pattern that ensures a class has only one
instance and provides a global access point to it.

## Examples

This package contains eager and lazy initialization examples.

### Eager Singleton

- `Singleton.java`: contains the single instance, private constructor, and
  `getInstance()` method.
- `Main.java`: retrieves the instance twice and demonstrates that both
  references point to the same object.

The instance is stored in a `private static final` field and is created when the
class is initialized. This implementation is simple and thread-safe.

### Lazy Singleton

- `LazySingleton.java`: creates its instance only when `getInstance()` is called
  for the first time.
- `LazySingletonMain.java`: demonstrates the delayed creation and confirms that
  subsequent calls return the same object.

The lazy implementation uses a `synchronized` factory method. This makes the
basic example thread-safe by allowing only one thread at a time to perform the
null check and create the instance.

## Key Elements

Both examples have three key elements:

1. The constructor is `private`, preventing the use of `new Singleton()` outside
   the class itself.
2. The instance is stored in a private static field.
3. The public `getInstance()` method always returns the same instance.

## Run the Example

From the project root, compile the classes:

```bash
javac -d out src/main/java/com/designpatterns/creational/singleton/*.java
```

Then run:

```bash
java -cp out com.designpatterns.creational.singleton.Main
```

Expected output:

```text
Hello! I am the single Singleton instance.
Do both variables reference the same instance? true
```

Run the lazy example:

```bash
java -cp out com.designpatterns.creational.singleton.LazySingletonMain
```

Expected output:

```text
Before the first getInstance() call.
Creating the LazySingleton instance.
Hello! I am the lazy Singleton instance.
Do both variables reference the same instance? true
```

## When to Use It

Singleton can be useful when exactly one instance must coordinate a shared
resource. Use it carefully because global access can increase coupling and make
testing more difficult.

## Advantages

- Guarantees one shared instance through a controlled access point
- Can delay resource creation when lazy initialization is used
- Keeps instance-creation logic inside the class

## Disadvantages

- Introduces global state and can hide dependencies
- Can make isolated unit tests and lifecycle management more difficult
- Requires special care to remain safe under concurrent access

## Common Use Cases

- Application configuration shared across components
- Logging or caching services with one coordinated instance
- Managers for a single process-wide resource

## Considerations

- Prefer dependency injection when a normal shared service is sufficient
- Select eager or lazy initialization based on resource cost and usage
- Account for threads, serialization, reflection, and class loaders in
  production implementations
- Keep the Singleton free of unnecessary mutable state
