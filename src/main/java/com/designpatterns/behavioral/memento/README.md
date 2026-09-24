# Memento

The **Memento** is a behavioral design pattern that captures an object's state
so it can be restored later without exposing the object's internal details.

This basic example saves the contents of a text editor before a change and then
restores the saved state with an undo operation.

## Example Structure

- `TextEditor`: originator that creates and restores snapshots of its text.
- `TextEditor.Memento`: immutable snapshot with private state.
- `History`: caretaker that stores snapshots without inspecting them.
- `Main`: edits text, saves a state, and restores it.

## How It Works

The originator is the only class that can read the state inside its memento:

```text
TextEditor -- creates/restores --> Memento
                                  ^
                                  |
History -------- stores ----------+
```

The client saves a snapshot before changing the editor:

```java
editor.write("Hello");
history.save(editor.save());

editor.write(" world!");
editor.restore(history.undo());
```

`History` manages snapshots as opaque objects and does not depend on the
editor's private text representation.

## Run the Example

From the project root, compile the classes:

```bash
javac -d out src/main/java/com/designpatterns/behavioral/memento/*.java
```

Then run:

```bash
java -cp out com.designpatterns.behavioral.memento.Main
```

Expected output:

```text
Before undo: Hello world!
After undo: Hello
```

## Advantages

- Restores previous state without exposing internal fields
- Keeps snapshot storage separate from the originator
- Supports undo, rollback, checkpoints, and history features
- Preserves encapsulation by making mementos opaque to caretakers

## Disadvantages

- Storing many snapshots can consume significant memory
- Copying large object graphs may be expensive
- The originator must keep snapshot logic synchronized with its state
- Managing snapshot lifecycle and history limits adds complexity

## Common Use Cases

- Undo and redo in text, graphics, and document editors
- Checkpoints in games and long-running workflows
- Transaction rollback and recovery mechanisms
- Restoring configuration or form state

## Considerations

- Make snapshots immutable so saved state cannot be changed accidentally
- Decide whether snapshots require shallow or deep copies
- Limit or expire history when snapshots are large
- Define behavior when no earlier state is available
- Avoid storing sensitive data in snapshots without appropriate protection

## When to Use It

Use Memento when an object's previous state must be restored while its internal
representation remains encapsulated. Storing only the inverse operation may be
more efficient when a full snapshot is large and changes are easy to reverse.
