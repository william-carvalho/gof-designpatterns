# Command

The **Command** is a behavioral design pattern that turns a request into an
object containing all the information needed to perform that request.

This basic example encapsulates the operations for turning a light on and off.
A remote control executes the commands without knowing how the light works.

## Example Structure

- `Command`: command interface declaring `execute()` and `undo()`.
- `TurnOnLightCommand` and `TurnOffLightCommand`: concrete commands.
- `Light`: receiver that performs the actual operations.
- `RemoteControl`: invoker that executes and remembers the last command.
- `Main`: configures the commands and demonstrates execution and undo.

## How It Works

The invoker depends only on the command interface. Each concrete command keeps a
reference to its receiver and translates `execute()` into the correct receiver
operation:

```text
Client -> RemoteControl -> Command -> Light
            (invoker)               (receiver)
```

Commands can be selected at runtime:

```java
remoteControl.setCommand(new TurnOnLightCommand(light));
remoteControl.pressButton();
```

The invoker stores the last executed command so it can call `undo()` without
knowing which operation must be reversed.

## Run the Example

From the project root, compile the classes:

```bash
javac -d out src/main/java/com/designpatterns/behavioral/command/*.java
```

Then run:

```bash
java -cp out com.designpatterns.behavioral.command.Main
```

Expected output:

```text
Light is on.
Light is off.
Undoing the last command...
Light is on.
```

## Advantages

- Decouples the object requesting an action from the object performing it
- Makes requests easy to store, queue, log, or pass as parameters
- Supports undo, redo, and command histories
- Allows commands to be combined into macros or transactions

## Disadvantages

- Adds a command class for each operation or operation family
- Increases indirection for otherwise simple method calls
- Undo logic can be difficult when operations affect complex state
- Command histories may consume significant memory

## Common Use Cases

- Buttons, menus, keyboard shortcuts, and remote controls
- Job queues and scheduled tasks
- Transactional operations and audit logs
- Undo and redo functionality in editors

## Considerations

- Capture enough state before execution to implement reliable undo
- Define how failed and partially completed commands are handled
- Keep command objects immutable when they may be queued or shared
- Consider whether commands can be retried safely
- Use a simple callback when command objects provide no additional value

## When to Use It

Use Command when requests must be treated as objects, selected dynamically,
queued, recorded, retried, or reversed. A direct method call is simpler when no
such behavior is needed.
