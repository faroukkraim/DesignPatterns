# Design Patterns Java Project

This project demonstrates several classic design patterns implemented in Java. It is organized into packages by pattern category:

- **Creational Patterns**: Singleton, Enum Singleton, Builder, Functional Builder, Factory Method (enum + functional)
- **Structural Patterns**: Adapter, Decorator
- **Behavioral Patterns**: Observer, Strategy

Each pattern is implemented with example classes and demonstrated in the `DesignPatternsDemo` main class.

---

## Patterns Included

### Singleton Pattern

Ensures a class has only one instance and provides a global point of access to it.

- Classic Singleton with lazy initialization.
- Enum Singleton for thread safety and protection against reflection.

### Builder Pattern

Separates the construction of a complex object from its representation.

- Classic Builder with Director and ConcreteBuilder.
- Functional Builder using Java functional interfaces for flexible object construction.

### Factory Method Pattern

Defines an interface for creating an object, but lets subclasses decide which class to instantiate.

- Enum-based functional factory using Java Suppliers for product creation.

### Adapter Pattern

Allows incompatible interfaces to work together by wrapping an existing class with a new interface.

### Decorator Pattern

Adds responsibilities to objects dynamically without affecting other objects.

### Observer Pattern

Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified.

### Strategy Pattern

Defines a family of algorithms, encapsulates each one, and makes them interchangeable.

---

## Project Structure

- `creational/`: Creational pattern implementations.
- `structural/`: Structural pattern implementations.
- `behavioral/`: Behavioral pattern implementations.
- `DesignPatternsDemo.java`: Main class demonstrating all patterns.

---

## License

This project is open source and free to use for learning and reference.
