# Chain of Responsibility

The **Chain of Responsibility** is a behavioral design pattern that passes a
request through a sequence of handlers until one of them processes it.

This basic example sends support requests through basic, technical, and manager
support levels. A handler processes a matching priority or forwards the request
to the next handler.

## Example Structure

- `SupportHandler`: base handler that stores the next link and defines the
  forwarding behavior.
- `BasicSupportHandler`: handles priority `1` requests.
- `TechnicalSupportHandler`: handles priority `2` requests.
- `ManagerSupportHandler`: handles priority `3` requests.
- `Main`: creates the chain and sends requests with different priorities.

## How It Works

The handlers are connected in a sequence:

```text
Request
   |
   v
Basic Support -> Technical Support -> Manager Support -> Not handled
```

The client sends every request to the first handler without selecting the final
receiver itself:

```java
SupportHandler chain = new BasicSupportHandler();
chain.setNext(new TechnicalSupportHandler())
        .setNext(new ManagerSupportHandler());

chain.handle("Software installation error", 2);
```

## Run the Example

From the project root, compile the classes:

```bash
javac -d out src/main/java/com/designpatterns/behavioral/chainofresponsibility/*.java
```

Then run:

```bash
java -cp out com.designpatterns.behavioral.chainofresponsibility.Main
```

Expected output:

```text
Basic support handled: Password reset
Technical support handled: Software installation error
Manager support handled: Refund approval
No support handler available for: Data center outage
```

## Advantages

- Decouples the sender from the handler that processes a request
- Allows handlers to be reordered, added, or removed at runtime
- Keeps each handling rule in a focused class
- Supports fallback and escalation workflows naturally

## Disadvantages

- Does not guarantee that a request will be handled
- Makes the final receiver less obvious when reading client code
- Long chains can add processing overhead and complicate debugging
- Incorrect forwarding logic can stop or repeat request processing

## Common Use Cases

- Technical-support escalation and approval workflows
- HTTP middleware, filters, and interceptors
- Logging pipelines with multiple severity handlers
- Input validation and event-processing chains

## Considerations

- Define clearly whether one or multiple handlers may process a request
- Provide explicit behavior for unhandled requests
- Prevent cycles when chains can be assembled dynamically
- Keep handlers small and avoid dependencies on their position in the chain
- Consider ordering carefully when more than one handler can accept a request

## When to Use It

Use Chain of Responsibility when several objects may process a request and the
sender should not choose the receiver directly. A direct method call is simpler
when the responsible object is always known.
