# Proxy

The **Proxy** is a structural design pattern that provides a substitute for
another object and controls access to it through the same interface.

This basic example uses a virtual proxy to delay loading an image until the

client displays it for the first time.

## Example Structure

- `Image`: subject interface used by the client.
- `RealImage`: real subject that loads and displays an image.
- `ImageProxy`: proxy that creates `RealImage` only when it is needed.
- `Main`: accesses the image twice through the proxy.

## How It Works

Both the proxy and real subject implement the same interface:

```text
Client -> ImageProxy -> RealImage
             |             |
             +-- Image ----+
```

Creating the proxy is inexpensive. On the first `display()` call, the proxy
creates the real object and delegates the operation. Later calls reuse that
object:

```java
Image image = new ImageProxy("photo.jpg");
image.display(); // Loads and displays the image.
image.display(); // Reuses the loaded image.
```

## Run the Example

From the project root, compile the classes:

```bash
javac -d out src/main/java/com/designpatterns/structural/proxy/*.java
```

Then run:

```bash
java -cp out com.designpatterns.structural.proxy.Main
```

Expected output:

```text
Proxy created. Image not loaded yet.
Loading image from disk: photo.jpg
Displaying image: photo.jpg
Displaying image: photo.jpg
```

## Advantages

- Controls access without changing the real object's interface
- Can delay expensive object creation until it is necessary
- Keeps access-control, caching, or remote-communication logic out of clients
- Can manage the lifecycle of the real object transparently

## Disadvantages

- Adds another class and an extra level of indirection
- Can make response time less predictable when work is performed lazily
- May hide network, security, or loading failures behind a simple method call
- Requires the proxy and real subject to maintain compatible behavior

## Common Use Cases

- Lazy loading of images, documents, or expensive resources
- Access control and authorization checks
- Local representatives for remote services
- Caching, logging, and monitoring access to another object

## Considerations

- Make lazy initialization thread-safe when a proxy is shared between threads
- Define how loading or remote-operation failures are reported
- Ensure the proxy does not unexpectedly change the real object's contract
- Use Decorator instead when the main goal is adding optional behavior rather
  than controlling access

## When to Use It

Use Proxy when access to an object must be delayed, protected, cached, monitored,
or performed remotely while clients continue using the original interface. A
direct reference is simpler when no access control is required.
