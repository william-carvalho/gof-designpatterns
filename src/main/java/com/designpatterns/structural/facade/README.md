# Facade

The **Facade** is a structural design pattern that provides a simple interface
to a group of classes or a complex subsystem.

This basic example uses a `HomeTheaterFacade` to coordinate a projector, sound
system, and streaming player. The client can start or stop a movie without
calling every subsystem separately.

## Example Structure

- `Projector`: subsystem responsible for the image.
- `SoundSystem`: subsystem responsible for audio and volume.
- `StreamingPlayer`: subsystem responsible for movie playback.
- `HomeTheaterFacade`: simple entry point that coordinates the subsystems.
- `Main`: client that interacts only with the facade.

## How It Works

The facade receives the subsystem objects and exposes operations that represent
complete use cases:

```text
Client -> HomeTheaterFacade -> Projector
                           -> SoundSystem
                           -> StreamingPlayer
```

Instead of knowing the correct setup order, the client makes one call:

```java
homeTheater.watchMovie("Design Patterns");
```

The subsystem classes remain available when advanced clients need direct access
to lower-level operations.

## Run the Example

From the project root, compile the classes:

```bash
javac -d out src/main/java/com/designpatterns/structural/facade/*.java
```

Then run:

```bash
java -cp out com.designpatterns.structural.facade.Main
```

Expected output:

```text
Preparing the home theater...
Projector is on.
Sound system is on.
Sound system volume: 20
Streaming player is on.
Playing: Design Patterns

Shutting down the home theater...
Playback stopped.
Streaming player is off.
Sound system is off.
Projector is off.
```

## Advantages

- Gives clients a small and convenient interface to a complex subsystem
- Reduces coupling between clients and subsystem classes
- Centralizes common workflows and the correct order of operations
- Can provide multiple facades for different client needs

## Disadvantages

- Can become a large class with too many responsibilities
- May hide useful subsystem features from clients
- Can turn into a tightly coupled central dependency if poorly scoped
- Changes in subsystem behavior may require changes to the facade

## Common Use Cases

- Simplified APIs for libraries and frameworks
- Service layers that coordinate repositories and external systems
- Startup and shutdown sequences for multiple components
- Gateways to complex legacy or third-party subsystems

## Considerations

- Keep facade methods focused on meaningful client workflows
- Do not move all subsystem business logic into the facade
- Allow direct subsystem access when advanced operations are legitimately needed
- Split a growing facade into smaller role-specific facades

## When to Use It

Use Facade when clients repeatedly coordinate several subsystem objects or when
a simpler boundary should isolate clients from subsystem complexity. A facade is
unnecessary when the underlying API is already small and clear.
