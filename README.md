# Prototype Design Pattern — Animal Registry Example

A simple Java prototype-pattern demo that uses an `AnimalRegistry` to clone animal prototypes and create new animal instances.

## Overview

This project demonstrates:

- the Prototype design pattern
- cloning objects via `clone()`
- polymorphism using an `Animal` interface
- a registry class that manages animal prototypes

The example includes three animal types: `Sheep`, `Cow`, and `Horse`.

## Project Structure

- `Animal.java` — the base interface for all animals
- `Sheep.java` — a `Sheep` implementation with cloning support
- `Cow.java` — a `Cow` implementation with cloning support
- `Horse.java` — a `Horse` implementation with cloning support
- `AnimalRegistry.java` — creates and clones animal prototypes
- `TestAnimal.java` — demo driver class with a `main()` method

## How to run

From the project root directory, compile all Java files:

```bash
javac *.java
```

Then run the demo:

```bash
java TestAnimal
```

## Expected output

When you run `TestAnimal`, the program will print each animal sound and full details, for example:

```text
Dolly the sheep says: Baa
Type: Sheep, Name: Dolly, Legs: 4, Sound: Baa, Food: Grass
Molly the sheep says: Baa
Type: Sheep, Name: Molly, Legs: 4, Sound: Baa, Food: Grass
Cow says: Moo
Type: Cow, Legs: 4, Sound: Moo, Food: Grass
Horse says: Nee
Type: Horse, Color: Brown, Legs: 4, Sound: Nee, Food: Hay
```

## Notes

- `AnimalRegistry` uses prototype instances to clone new animals instead of constructing them directly.
- `Sheep` supports renaming after cloning so each created sheep has a custom name.
- This is ideal for learning how prototype cloning can simplify object creation when objects share a common base configuration.
