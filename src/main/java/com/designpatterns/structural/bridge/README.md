# Bridge

The **Bridge** is a structural design pattern that separates an abstraction
from its implementation so both can change independently.

This basic example separates remote controls from the devices they operate. A
remote can work with either a television or a radio without inheriting from
those device classes.

## Example Structure

- `Device`: implementation interface used by the abstraction.
- `Television` and `Radio`: concrete implementations.
- `RemoteControl`: abstraction that stores and delegates to a `Device`.
- `AdvancedRemoteControl`: refined abstraction that adds a mute operation.
- `Main`: connects different remotes to different devices.

## How It Works

The bridge is the `Device` reference held by `RemoteControl`:

```text
RemoteControl ----------------> Device
      ^                          ^
      |                          |
AdvancedRemoteControl     Television / Radio
```

The two sides can evolve separately. A new remote-control type can use every
existing device, and a new device can work with every existing remote-control
type.

```java
RemoteControl remote = new RemoteControl(new Television());
remote.powerOn();
remote.changeVolume(30);
```

## Run the Example

From the project root, compile the classes:

```bash
javac -d out src/main/java/com/designpatterns/structural/bridge/*.java
```

Then run:

```bash
java -cp out com.designpatterns.structural.bridge.Main
```

Expected output:

```text
Television is on.
Television volume: 30
Television is off.

Radio is on.
Radio volume: 15
Radio volume: 0
Radio is off.
```

## When to Use It

Use Bridge when a class has two independent dimensions that would otherwise
create many subclasses, such as several remote types combined with several
device types. The pattern is most useful when both dimensions are expected to
change independently.

## Advantages

- Allows abstractions and implementations to evolve independently
- Avoids a large subclass hierarchy for every possible combination
- Selects or replaces an implementation through composition

## Disadvantages

- Adds interfaces, delegation, and conceptual indirection
- Can make a small design harder to follow
- Requires identifying the independent dimensions correctly

## Common Use Cases

- Cross-platform abstractions backed by platform-specific implementations
- User-interface controls connected to different rendering systems
- Remote controls, database drivers, and messaging providers

## Considerations

- Introduce Bridge when both dimensions have meaningful independent variation
- Keep implementation details behind a stable implementation interface
- Inject the implementation instead of constructing it inside the abstraction
- Avoid the pattern when a single implementation is unlikely to change
