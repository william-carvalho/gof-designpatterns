# Composite

The **Composite** is a structural design pattern that organizes objects into a
tree and lets clients treat individual objects and groups of objects through the
same interface.

This basic example represents a file-system tree containing files and
directories.

## Example Structure

- `FileSystemItem`: component interface shared by every item in the tree.
- `FileItem`: leaf that represents an individual file.
- `Directory`: composite that stores files or other directories.
- `Main`: builds and displays a small project tree.

## How It Works

Both leaves and composites implement `FileSystemItem`:

```text
FileSystemItem
|-- FileItem                 (leaf)
`-- Directory               (composite)
    `-- List<FileSystemItem> (children)
```

A directory delegates `display()` to every child. A child may be a file or
another directory, so the same operation works recursively across the entire
tree.

```java
Directory project = new Directory("project");
project.add(new FileItem("README.md"));
project.add(new Directory("src"));
project.display("");
```

## Run the Example

From the project root, compile the classes:

```bash
javac -d out src/main/java/com/designpatterns/structural/composite/*.java
```

Then run:

```bash
java -cp out com.designpatterns.structural.composite.Main
```

Expected output:

```text
+ project
  - README.md
  + src
    - Main.java
    - Application.java
```

## When to Use It

Use Composite when data naturally forms a part-whole hierarchy and clients
should perform the same operations on single objects and nested groups. Common
examples include file systems, graphical user interfaces, organization charts,
and menu trees.

## Advantages

- Lets clients treat leaves and containers through one interface
- Supports recursive operations over an entire tree
- Makes new leaf and composite types easier to introduce

## Disadvantages

- A very general component interface may expose operations that do not suit leaves
- Tree traversal and mutation rules can become complex
- Cycles can cause infinite recursion if the structure is not constrained

## Common Use Cases

- File systems and folder structures
- Menus, graphical user interfaces, and scene graphs
- Organization charts, product groups, and document trees

## Considerations

- Decide whether child-management operations belong on the component or only on composites
- Prevent cycles when the data must remain a tree
- Define ownership, removal, ordering, and traversal behavior clearly
- Consider performance when operations recursively visit large hierarchies
