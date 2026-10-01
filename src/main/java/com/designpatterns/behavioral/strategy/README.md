# Strategy

The **Strategy** is a behavioral design pattern that defines a family of
algorithms, puts each algorithm in a separate class, and makes them
interchangeable at runtime.

This basic example allows a payment service to process payments with either a
credit card or PayPal without changing the service itself.

## Example Structure

- `PaymentStrategy`: strategy interface declaring `pay()`.
- `CreditCardPayment`: concrete strategy for card payments.
- `PayPalPayment`: concrete strategy for PayPal payments.
- `PaymentService`: context that delegates to its selected strategy.
- `Main`: changes the strategy at runtime and processes two payments.

## How It Works

The context depends on the strategy abstraction rather than concrete payment
classes:

```text
                   -> CreditCardPayment
PaymentService ----|
                   -> PayPalPayment
```

The client selects the appropriate algorithm before processing a payment:

```java
paymentService.setStrategy(new CreditCardPayment("1234"));
paymentService.processPayment(100);

paymentService.setStrategy(new PayPalPayment("user@example.com"));
paymentService.processPayment(50);
```

No conditional statement is required inside `PaymentService` to identify the
selected payment type.

## Run the Example

From the project root, compile the classes:

```bash
javac -d out src/main/java/com/designpatterns/behavioral/strategy/*.java
```

Then run:

```bash
java -cp out com.designpatterns.behavioral.strategy.Main
```

Expected output:

```text
Paid $100 with credit card ending in 1234.
Paid $50 with PayPal account user@example.com.
```

## Advantages

- Replaces algorithm-selection conditionals with interchangeable objects
- Keeps each algorithm isolated and independently testable
- Allows behavior to change at runtime
- Adds new strategies without modifying the context

## Disadvantages

- Adds classes for each algorithm
- Requires clients to understand and select a suitable strategy
- Communication between the context and strategies can require a broad interface
- Is unnecessary when the behavior has only one stable implementation

## Common Use Cases

- Payment, pricing, discount, and tax calculations
- Sorting, validation, compression, and serialization algorithms
- Routing and path-finding options
- Authentication and data-export mechanisms

## Considerations

- Keep the strategy interface focused on data required by every algorithm
- Validate that a strategy is selected before executing the context operation
- Prefer stateless, immutable strategies when they can be safely reused
- Decide whether the client, context, or configuration selects the strategy
- Use lambdas for very small strategies when a named class adds little clarity

## When to Use It

Use Strategy when multiple algorithms solve the same problem and must be
selected or replaced independently. A simple conditional may be clearer when
there are only two trivial, stable behaviors.
