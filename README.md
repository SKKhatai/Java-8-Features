# Java 8 Features

A collection of practical examples and explanations demonstrating the powerful features introduced in Java 8. This repository is designed to help developers understand and apply Java 8 concepts efficiently in real-world Java applications.

## Table of Contents

- [Features Covered](#features-covered)
- [Getting Started](#getting-started)
- [Examples](#examples)
- [Requirements](#requirements)
## Features Covered

This project demonstrates the following Java 8 features:

- **Lambda Expressions**
- **Functional Interfaces**
- **Streams API**
- **Default and Static Methods in Interfaces**
- **Method References**
- **Optional Class**
- **Date & Time API (java.time)**
- **Collectors and Grouping**

## Getting Started

1. **Clone the repository:**  
   ```bash
   git clone https://github.com/SKKhatai/Java-8-Features.git
   ```
## Examples

Here are some key examples included in this repository:

### Lambda Expressions

```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
names.forEach(name -> System.out.println(name));
```

### Streams API

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
System.out.println(evenNumbers); // Output: [2, 4, 6]
```

### Optional Class

```java
Optional<String> optional = Optional.ofNullable(getValue());
optional.ifPresent(System.out::println);
```

### Date & Time API

```java
LocalDate today = LocalDate.now();
System.out.println("Today's Date: " + today);
```

More examples are available in the code files.

## Project Structure

```
Java-8-Features/
│
├── src/
│   └── ... (Java classes demonstrating each feature)
├── README.md
```

## Requirements

- Java 8 or higher
- A Java IDE or command-line tools

## Contributing

Contributions are welcome! Please fork the repository, and submit a pull request with your improvements or new examples.

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

Created by [SKKhatai](https://github.com/SKKhatai)

Feel free to open an issue for suggestions or questions!
