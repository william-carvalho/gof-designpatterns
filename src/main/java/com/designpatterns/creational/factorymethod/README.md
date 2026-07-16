# Factory Method

The **Factory Method** is a creational design pattern that defines a method for
creating an object while allowing subclasses to decide which concrete class to
instantiate.

This example creates notifications without making the client depend directly
on the concrete notification classes.

## Example Structure

- `Notification`: product interface.
- `EmailNotification` and `SmsNotification`: concrete products.
- `NotificationCreator`: abstract creator that declares `createNotification()`.
- `EmailNotificationCreator` and `SmsNotificationCreator`: concrete creators
  that choose which notification to instantiate.
- `Main`: creates the concrete creators and demonstrates their use.

## How It Works

The `notifyUser()` method contains the notification workflow, but it does not
instantiate a concrete product. Instead, it calls the `createNotification()`
factory method. Each creator subclass implements that method and returns the
appropriate product.

```text
NotificationCreator
|-- EmailNotificationCreator -> EmailNotification
`-- SmsNotificationCreator   -> SmsNotification
```

New notification types can be introduced by adding a product and its creator
without changing the existing workflow.

## Run the Example

From the project root, compile the classes:

```bash
javac -d out src/main/java/com/designpatterns/creational/factorymethod/*.java
```

Then run:

```bash
java -cp out com.designpatterns.creational.factorymethod.Main
```

Expected output:

```text
Sending email: Welcome to the Factory Method example!
Sending SMS: Your verification code is 1234.
```

## When to Use It

Use Factory Method when a parent class should define a common workflow while
subclasses decide which concrete product that workflow uses. It is useful when
creation logic is expected to vary or grow over time.
