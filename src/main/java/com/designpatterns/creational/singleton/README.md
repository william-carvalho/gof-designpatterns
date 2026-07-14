# Singleton

The **Singleton** is a creational pattern that ensures a class has only one
instance and provides a global access point to it.

## Example Structure

- `Singleton.java`: contains the single instance, private constructor, and
  `getInstance()` method.
- `Main.java`: retrieves the instance twice and demonstrates that both
  references point to the same object.

## How It Works

This example has three key elements:

1. The constructor is `private`, preventing the use of `new Singleton()` outside
   the class itself.
2. The instance is stored in a `private static final` field.
3. The public `getInstance()` method always returns the same instance.

Because the instance is created when the class is initialized, this
implementation is simple and thread-safe.

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

## When to Use It

Singleton can be useful when exactly one instance must coordinate a shared
resource. Use it carefully because global access can increase coupling and make
testing more difficult.
