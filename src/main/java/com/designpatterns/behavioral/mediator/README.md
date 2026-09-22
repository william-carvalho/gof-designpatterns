# Mediator

The **Mediator** is a behavioral design pattern that centralizes communication
between related objects. The objects interact through a mediator instead of
referring to each other directly.

This basic example uses a chat room as the mediator. Users send messages to the
chat room, which forwards them to the other registered users.

## Example Structure

- `ChatMediator`: mediator interface for registration and message delivery.
- `ChatRoom`: concrete mediator that stores users and routes messages.
- `User`: colleague that sends and receives messages through the mediator.
- `Main`: creates the chat room, registers users, and sends a message.

## How It Works

Every user knows only the mediator:

```text
       Alice
          \
Bob -- ChatRoom -- Carol
       (mediator)
```

When Alice sends a message, she asks `ChatRoom` to deliver it. The mediator
selects the recipients and calls their `receive()` methods:

```java
User alice = new User("Alice", chatRoom);
chatRoom.addUser(alice);
alice.send("Hello everyone!");
```

Adding another user does not require changing the existing users.

## Run the Example

From the project root, compile the classes:

```bash
javac -d out src/main/java/com/designpatterns/behavioral/mediator/*.java
```

Then run:

```bash
java -cp out com.designpatterns.behavioral.mediator.Main
```

Expected output:

```text
Alice sends: Hello everyone!
Bob receives from Alice: Hello everyone!
Carol receives from Alice: Hello everyone!
```

## Advantages

- Reduces direct dependencies between colleague objects
- Centralizes communication and coordination rules
- Makes individual colleagues easier to reuse and test
- Allows interaction behavior to change without modifying every colleague

## Disadvantages

- The mediator can grow into a large class with too many responsibilities
- Centralized logic can become difficult to maintain
- The mediator may become a performance bottleneck or single point of failure
- Communication flow can be less obvious than direct method calls

## Common Use Cases

- Chat rooms and messaging hubs
- Dialog boxes coordinating user-interface controls
- Air-traffic control and workflow coordinators
- Event hubs connecting otherwise independent components

## Considerations

- Keep the mediator focused on coordination rather than colleague business logic
- Split large mediators by workflow or responsibility
- Define registration, removal, and message-delivery behavior clearly
- Consider concurrency and error isolation when messages are delivered asynchronously
- Use Observer when one object simply broadcasts state changes to subscribers

## When to Use It

Use Mediator when several objects communicate in complex ways and direct
references create tight coupling. Direct communication is simpler when only a
few objects have stable, straightforward interactions.
