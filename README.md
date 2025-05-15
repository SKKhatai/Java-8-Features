# Java-8-Features
Examples and explanations of Java 8 features: Lambdas, Streams, Functional Interfaces, Optional, and more Code snippets.

Java 8 Features 🚀
A practical guide to Java 8's most important features, with code examples, best practices, and real-world use cases.


📌 Features Covered
✅ Lambda Expressions – Write concise functional code.
✅ Stream API – Process collections declaratively.
✅ Functional Interfaces – Predicate, Function, Consumer, Supplier.
✅ Optional Class – Safely handle null values.
✅ Default & Static Methods in Interfaces – Evolve interfaces without breaking existing code.
✅ Method References (:: operator) – Shorten Lambda calls.
✅ New Date & Time API (java.time) – Modern, thread-safe date handling.
✅ Parallel Streams – Leverage multi-core processors.


📖 Code Examples
1. Lambda Expressions

->example:
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");  
names.forEach(name -> System.out.println(name));  // Lambda  
names.forEach(System.out::println);              // Method Reference  

2. Stream API (Filter, Map, Reduce)
->example:
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);  
int sum = numbers.stream()  
                .filter(n -> n % 2 == 0)  
                .mapToInt(n -> n * 2)  
                .sum();

3. Optional (Avoid Null Checks)
->example: 
Optional<String> name = Optional.ofNullable(getName());  
String result = name.orElse("Default"); 


📌 Best Practices
✔ Prefer immutable collections with Streams.
✔ Use Optional instead of null checks.
✔ Avoid side-effects in Lambdas.
✔ Parallel streams only for large datasets. 
