# Observer

The **Observer** is a behavioral design pattern that defines a one-to-many
dependency. When the subject changes state, all registered observers are
notified automatically.

This basic example uses a weather station as the subject. Phone and window
displays observe temperature changes and update themselves.

## Example Structure

- `WeatherObserver`: observer interface declaring `update()`.
- `PhoneDisplay` and `WindowDisplay`: concrete observers.
- `WeatherStation`: subject that registers, removes, and notifies observers.
- `Main`: subscribes the displays and changes the temperature.

## How It Works

Observers register themselves with the subject:

```text
                  -> PhoneDisplay
WeatherStation ---|
                  -> WindowDisplay
```

When the temperature changes, the station iterates over its registered
observers and sends the new value:

```java
station.addObserver(phoneDisplay);
station.addObserver(windowDisplay);
station.setTemperature(25.0);
```

An observer stops receiving updates after it is removed.

## Run the Example

From the project root, compile the classes:

```bash
javac -d out src/main/java/com/designpatterns/behavioral/observer/*.java
```

Then run:

```bash
java -cp out com.designpatterns.behavioral.observer.Main
```

Expected output:

```text
Temperature changed to 25.0 C.
Phone display: 25.0 C
Window display: 25.0 C

Temperature changed to 30.0 C.
Phone display: 30.0 C
```

## Advantages

- Decouples the subject from concrete observer classes
- Allows observers to subscribe and unsubscribe at runtime
- Broadcasts changes to multiple dependents automatically
- Supports new observer types without modifying the subject

## Disadvantages

- Notification order may be unclear or unintentionally significant
- A slow or failing observer can affect synchronous notifications
- Forgotten subscriptions can cause memory leaks
- Chains of updates can become difficult to trace and debug

## Common Use Cases

- User-interface events and data binding
- Domain events and application notifications
- Monitoring, dashboards, and status displays
- Cache invalidation and model-view synchronization

## Considerations

- Define whether notifications are synchronous or asynchronous
- Remove observers when their lifecycle ends
- Decide whether updates push changed data or ask observers to pull state
- Protect iteration when observers may subscribe or unsubscribe during notification
- Isolate failures when one observer should not prevent others from updating

## When to Use It

Use Observer when several objects must react to changes in another object and
the subject should not depend on their concrete classes. Direct calls are
simpler when there is only one fixed dependent.
