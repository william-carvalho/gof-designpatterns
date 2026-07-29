# Builder

The **Builder** is a creational design pattern that constructs an object step by
step. It keeps object construction readable and avoids constructors with many
parameters.

This basic example builds different `Computer` objects using the same fluent
builder.

## Example Structure

- `Computer`: immutable product containing the final configuration.
- `Computer.Builder`: builder that collects the configuration and creates the
  product with `build()`.
- `Main`: builds a basic office computer and a customized gaming computer.

## How It Works

Required values are passed to the builder constructor:

```java
new Computer.Builder("Intel Core i3", "8 GB")
```

Optional values are configured through chainable methods before `build()`
creates the final object:

```java
Computer computer = new Computer.Builder("AMD Ryzen 7", "32 GB")
        .withStorage("1 TB SSD")
        .withDedicatedGraphics()
        .build();
```

The `Computer` constructor is private, so its construction is controlled by the
builder. Its fields are final and cannot be changed after creation.

## Run the Example

From the project root, compile the classes:

```bash
javac -d out src/main/java/com/designpatterns/creational/builder/*.java
```

Then run:

```bash
java -cp out com.designpatterns.creational.builder.Main
```

Expected output:

```text
Office: Computer{processor='Intel Core i3', memory='8 GB', storage='256 GB SSD', dedicatedGraphics=false}
Gaming: Computer{processor='AMD Ryzen 7', memory='32 GB', storage='1 TB SSD', dedicatedGraphics=true}
```

## When to Use It

Use Builder when an object has several construction options, especially when
many parameters are optional or when the creation process should be separate
from the final object. For very small objects with only a few required values, a
regular constructor may be simpler.
