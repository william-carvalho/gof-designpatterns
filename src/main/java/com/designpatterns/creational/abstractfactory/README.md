# Abstract Factory

The **Abstract Factory** is a creational design pattern that creates families of
related objects without exposing their concrete classes to the client.

This basic example creates matching buttons and checkboxes for Windows and
macOS. The client works only with the abstract factory and product interfaces.

## Example Structure

- `Button` and `Checkbox`: abstract product interfaces.
- `WindowsButton` and `WindowsCheckbox`: Windows product family.
- `MacButton` and `MacCheckbox`: macOS product family.
- `GuiFactory`: abstract factory that declares methods for creating every
  product in a family.
- `WindowsGuiFactory` and `MacGuiFactory`: concrete factories.
- `Application`: client that uses only abstract types.
- `Main`: demonstrates both product families.

## How It Works

Each concrete factory creates a complete, matching family of components:

```text
GuiFactory
|-- WindowsGuiFactory -> WindowsButton + WindowsCheckbox
`-- MacGuiFactory     -> MacButton     + MacCheckbox
```

`Application` receives a `GuiFactory` and never calls the constructors of the
concrete products. Changing the factory changes the entire product family while
the client code remains the same.

## Run the Example

From the project root, compile the classes:

```bash
javac -d out src/main/java/com/designpatterns/creational/abstractfactory/*.java
```

Then run:

```bash
java -cp out com.designpatterns.creational.abstractfactory.Main
```

Expected output:

```text
Windows family:
Rendering a Windows button.
Rendering a Windows checkbox.
macOS family:
Rendering a macOS button.
Rendering a macOS checkbox.
```

## When to Use It

Use Abstract Factory when an application must work with multiple families of
related products and products from the same family should be used together. It
is especially useful when the client must remain independent of concrete
product classes.

## Advantages

- Ensures that products created together belong to a compatible family
- Isolates clients from concrete classes and construction details
- Makes switching an entire product family straightforward

## Disadvantages

- Introduces several interfaces and concrete factory classes
- Adding a new product type requires changing every factory implementation
- Can be excessive when there is only one product family

## Common Use Cases

- Cross-platform user-interface component families
- Database drivers and related persistence components
- Theme, cloud-provider, or operating-system-specific services

## Considerations

- Define one creation method for each product that belongs to the family
- Keep products from different families compatible at the abstraction level
- Use Factory Method when only one product varies
- Consider dependency injection for selecting the concrete factory at startup
