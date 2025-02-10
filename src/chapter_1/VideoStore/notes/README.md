# Chapter 1 Notes - VideoStore

## **Refactoring Methodologies**

### ***Extract Method***

[Method Extraction application](../iteration_1/Customer.java)

The first step in the refactoring process is to find a logical clump of code and use the Extract Method.
This technique involves identifying chunks of code that can be moved to a separate method, improving code readability
and maintainability.

Example: Extracting a Switch Statement

- Identify a logical clump of code to extract. In this example, the switch statement is a good candidate.
- Use the Extract Method refactoring to move the switch statement into its own method.

## Tips

```java
// ************************************************************
// *                                                          *
// *  Before you start refactoring, check that you have a     *
// *  solid suite of tests. These tests must be self-checking.*
// *                                                          *
// ************************************************************
```

- [VideoStore Test Package](../../../../test/chapter_1/VideoStore)

```java
// ************************************************************
// *                                                          *
// *  Any fool can write code that a computer can understand. *
// *  Good programmers write code that humans can understand. *
// *                                                          *
// ************************************************************
```

```java
// ************************************************************
// *                                                          *
// *  Refactoring changes the programs in small steps.        *
// *  If you make a mistake, it is easy to find the bug.      *
// *                                                          *
// ************************************************************
```
