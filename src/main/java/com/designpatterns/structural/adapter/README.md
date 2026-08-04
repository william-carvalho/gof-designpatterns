# Adapter

The **Adapter** is a structural design pattern that converts the interface of an
existing class into another interface expected by the client.

This basic example allows modern client code to use a legacy payment gateway.
The client sends an amount in dollars, while the legacy gateway accepts only an
integer number of cents.

## Example Structure

- `PaymentProcessor`: target interface expected by the client.
- `LegacyPaymentGateway`: existing adaptee with an incompatible method.
- `PaymentGatewayAdapter`: adapter that implements the target interface,
  converts dollars to cents, and delegates to the legacy gateway.
- `Main`: creates and uses the adapter.

## How It Works

The client depends on the target interface:

```java
PaymentProcessor paymentProcessor =
        new PaymentGatewayAdapter(new LegacyPaymentGateway());

paymentProcessor.pay(25.99);
```

The adapter translates the call before passing it to the existing service:

```text
Client -> PaymentProcessor -> PaymentGatewayAdapter
                                      |
                                      v
                            LegacyPaymentGateway
```

The client does not need to know the legacy method name or perform the currency
conversion itself.

## Run the Example

From the project root, compile the classes:

```bash
javac -d out src/main/java/com/designpatterns/structural/adapter/*.java
```

Then run:

```bash
java -cp out com.designpatterns.structural.adapter.Main
```

Expected output:

```text
Legacy gateway processed 2599 cents.
```

## When to Use It

Use Adapter when existing code has useful behavior but its interface does not
match what the client expects. It is commonly used with legacy code, external
libraries, and services that use different data formats or method signatures.
