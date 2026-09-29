# State

The **State** is a behavioral design pattern that lets an object change its
behavior when its internal state changes. Each state is represented by a
separate object.

This basic example models a traffic light that transitions from red to green,
green to yellow, and yellow back to red.

## Example Structure

- `TrafficLightState`: state interface declaring transition behavior.
- `RedState`, `GreenState`, and `YellowState`: concrete states.
- `TrafficLight`: context that delegates behavior to its current state.
- `Main`: advances the traffic light through a complete cycle.

## How It Works

The context stores one state object and delegates `change()` to it:

```text
RedState -> GreenState -> YellowState -> RedState
    ^                                      |
    +--------------------------------------+
```

Each concrete state knows which state comes next:

```java
public void next(TrafficLight trafficLight) {
    trafficLight.setState(new GreenState());
}
```

The `TrafficLight` does not need a large conditional statement to determine the
next transition.

## Run the Example

From the project root, compile the classes:

```bash
javac -d out src/main/java/com/designpatterns/behavioral/state/*.java
```

Then run:

```bash
java -cp out com.designpatterns.behavioral.state.Main
```

Expected output:

```text
Current state: Red
Current state: Green
Current state: Yellow
Current state: Red
```

## Advantages

- Replaces large state-dependent conditional statements with focused classes
- Keeps behavior associated with each state in one place
- Makes state transitions explicit
- Allows new states to be introduced without changing every existing state

## Disadvantages

- Adds classes when the state machine is very small
- Distributes transition logic across several files
- State objects may need controlled access to the context
- Complex state machines can still be difficult to visualize and validate

## Common Use Cases

- Workflow and approval stages
- Order, connection, and document lifecycles
- Media players and user-interface modes
- Games and protocol state machines

## Considerations

- Define valid transitions and behavior for invalid transitions
- Decide whether state objects should be reused or created per context
- Keep context-specific data in the context rather than duplicating it in states
- Consider a state-machine library when transitions become highly complex
- Test every state and transition, including complete cycles

## When to Use It

Use State when an object's behavior depends heavily on its current state and
state-specific conditionals are spreading through the class. A simple enum and
conditional may be clearer when there are only a few trivial behaviors.
